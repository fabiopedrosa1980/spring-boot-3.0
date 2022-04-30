package br.com.pedrosa.springboot3.dto;

public sealed interface Color {
    final class Red implements Color {}
    final class Green implements Color {}
    final class Blue implements Color {}
    final class Orange implements Color {}
}
