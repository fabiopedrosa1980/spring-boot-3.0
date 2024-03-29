package br.com.pedrosa.springboot3.dto;

import jakarta.validation.constraints.NotBlank;

public class CustomerDTO {
    private Long id;

    @NotBlank
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
