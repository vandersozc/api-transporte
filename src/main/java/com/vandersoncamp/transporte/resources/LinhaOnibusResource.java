package com.vandersoncamp.transporte.resources;import com.vandersoncamp.transporte.dto.LinhaDTO;import com.vandersoncamp.transporte.model.LinhaOnibus;import com.vandersoncamp.transporte.service.linhaonibus.LinhaDTOService;import com.vandersoncamp.transporte.service.linhaonibus.LinhaOnibusService;import com.vandersoncamp.transporte.utils.RestTemplateConverter;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.core.ParameterizedTypeReference;import org.springframework.http.HttpMethod;import org.springframework.http.MediaType;import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.PostMapping;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;import java.util.List;import java.util.stream.Collectors;@RestController@RequestMapping("linha-onibus")public class LinhaOnibusResource {    @Autowired    private LinhaOnibusService service;    @Autowired    private LinhaDTOService linhaDTOService;    @Autowired    private RestTemplateConverter restTemplateConverter;    @GetMapping(value = "/consultar", produces = {MediaType.APPLICATION_JSON_VALUE})    public Iterable<LinhaOnibus> findAll() {        return service.findAll();    }    @PostMapping("/integrar")    public void integrarLinhas() {        List<LinhaOnibus> linhas = findByPoaTransporte();        service.integrarLinhaOnibus(linhas);    }    private List<LinhaOnibus> findByPoaTransporte() {        String url = "http://www.poatransporte.com.br/php/facades/process.php?a=nc&p=%&t=o";        ResponseEntity<List<LinhaDTO>> response = restTemplateConverter.messageConverter().exchange(                url, HttpMethod.GET, null, new ParameterizedTypeReference<List<LinhaDTO>>() {                });        return response.getBody().stream().map(dto ->                linhaDTOService.toEntity(dto)).collect(Collectors.toList());    }}