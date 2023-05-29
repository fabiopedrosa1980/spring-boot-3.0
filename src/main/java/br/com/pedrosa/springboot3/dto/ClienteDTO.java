package br.com.pedrosa.springboot3.dto;


import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public record ClienteDTO(Long id, @NotBlank(message = "Nome é obrigatorio") String nome) {
}
