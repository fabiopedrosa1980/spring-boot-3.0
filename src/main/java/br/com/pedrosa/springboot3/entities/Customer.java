package br.com.pedrosa.springboot3.entities;

import org.springframework.data.annotation.Id;

public record Customer(@Id Integer id, String name) {
}
