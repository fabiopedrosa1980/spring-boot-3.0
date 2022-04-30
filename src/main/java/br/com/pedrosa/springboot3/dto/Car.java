package br.com.pedrosa.springboot3.dto;

public record Car(int numberOfSeats, String registrationNumber) implements Vehicle {

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

}
