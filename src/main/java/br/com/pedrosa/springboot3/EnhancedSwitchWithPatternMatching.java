package br.com.pedrosa.springboot3;

import br.com.pedrosa.springboot3.dto.Color;
import br.com.pedrosa.springboot3.dto.Color.*;


public class EnhancedSwitchWithPatternMatching {
    public static void main(String[] args) {
        Color[] colours = {new Red(), new Red(), new Green(), new Blue(), new Green(), new Orange()};
        out:
        for (Color colour : colours) {
            switch (colour) {
                case Red r -> System.out.println("#FF0000 // Red");
                case Green g -> System.out.println("#008000 // Green");
                case Blue b -> {
                    System.out.println("#0000FF // Blue");
                    break out; // stop when we encounter the first Blue
                }
                case Orange o -> System.out.println("#FFA500 // Orange");
            }
        }
    }

}
