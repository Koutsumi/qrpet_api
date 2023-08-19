package com.novatec.qrpet.tarefas.dto;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@Document(collection = "pets")
@Validated
public class Pet {

    @Id
    private String id;

    @NotBlank(message = "O campo userId é obrigatório")
    private String userId;
    private String foto_url;
    @NotBlank (message = "O campo nome é obrigatório")
    private String nome;
    private int ano_nascimento;
    @NotBlank (message = "O campo nome_dono é obrigatório")
    private String nome_dono;
    private String nome_dono_alt;
    @NotBlank (message = "O campo telefone é obrigatório")
    private String telefone;
    private String telefone_alt;
    private String observacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoto_url() {
        return foto_url;
    }

    public void setFoto_url(String foto_url) {
        this.foto_url = foto_url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getNome_dono() {
        return nome_dono;
    }

    public void setNome_dono(String nome_dono) {
        this.nome_dono = nome_dono;
    }

    public String getNome_dono_alt() {
        return nome_dono_alt;
    }

    public void setNome_dono_alt(String nome_dono_alt) {
        this.nome_dono_alt = nome_dono_alt;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone_alt() {
        return telefone_alt;
    }

    public void setTelefone_alt(String telefone_alt) {
        this.telefone_alt = telefone_alt;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
