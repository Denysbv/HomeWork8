package com.SoftServAcademy;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static class TypeException extends RuntimeException {
        public TypeException() {
        }

        public TypeException(String message) {
            super(message);
        }
    }

    public static class ColorException extends RuntimeException {

        public ColorException() {
        }

        public ColorException(String message) {
            super(message);
        }
    }

    public static void main (String[] args) {

        // #1
        System.out.println("Area of rectangle is " + squareRectangle());

        // #2
        LinkedList<Plant> plants = new LinkedList<>();
        plants.add (new Plant(1, PlantColor.Green, PlantType.Flower));
        plants.add (new Plant(2, PlantColor.Grey, PlantType.Flower));
        plants.add (new Plant(3, PlantColor.Grey, PlantType.Moss));
        plants.add (new Plant(4, PlantColor.Red, PlantType.Tree));
        plants.add (new Plant(5, PlantColor.Green, PlantType.Grass));
        try {
            for (Plant plant : plants) {
                if (plant.getColor() == PlantColor.Grey) {
                    throw new ColorException("Plant cant be grey");
                }
            }
        } catch (ColorException e) {
            System.out.println("Check colors");
            System.out.println(e.getMessage());
        }
        try {
            for (Plant plant : plants) {
                if (plant.getType() == PlantType.Tree) {
                    throw new TypeException("Plant cant be tree");
                }
            }
        } catch (TypeException e) {
            System.out.println("Check plant type");
            System.out.println(e.getMessage());
        }

        System.out.println(plants.toString());
    }

    //#1
    public static int squareRectangle () throws IllegalArgumentException{
        System.out.println("please enter 2 integers:");
        int a;
        int b;
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a <= 0 || b <= 0) {
                throw new IllegalArgumentException("Please only positive values");
            }
            return a * b;
        } catch (InputMismatchException e) {
            System.out.println("Please input integers only");
            return 0;
        }
    }
}
