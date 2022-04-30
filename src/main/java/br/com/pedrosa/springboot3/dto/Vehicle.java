package br.com.pedrosa.springboot3.dto;

public sealed interface Vehicle permits Car, Truck {

    String getRegistrationNumber();

}
