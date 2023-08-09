package com.novatec.qrpet.tarefas.dto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Document(collection = "users") // Nome da coleção no MongoDB
public class Usuario {
    @Id
    private String id;
    @NotBlank(message = "O campo nome é obrigatório")
    @NotNull
    @NotEmpty
    private String nome;
    @NotBlank(message = "O campo e-mail é obrigatório")
    @NotNull
    @NotEmpty
    @Email(message = "Formato de e-mail inválido")
    private String email;
    @NotBlank(message = "O campo senha é obrigatório")
    @NotNull
    @NotEmpty
    private String senha;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome) {
        this.nome = nome;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha( String senha) {
        this.senha = senha;
    }
}
