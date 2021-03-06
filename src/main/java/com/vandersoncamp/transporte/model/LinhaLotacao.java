package com.vandersoncamp.transporte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "LINHA_LOTACAO")
public class LinhaLotacao implements Serializable {

    @Id
    @NotNull
    @Column(name = "ID", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "CODIGO", length = 12, nullable = false)
    private String codigo;

    @NotNull
    @Column(name = "NOME", nullable = false)
    private String nome;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object lotacao) {
        if (this == lotacao) return true;
        if (lotacao == null || getClass() != lotacao.getClass()) return false;
        LinhaLotacao that = (LinhaLotacao) lotacao;
        return Objects.equals(id, that.id) &&
                Objects.equals(codigo, that.codigo) &&
                Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, codigo, nome);
    }
}
