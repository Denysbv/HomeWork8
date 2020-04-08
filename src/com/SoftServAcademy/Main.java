package com.SoftServAcademy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static class ColorException extends RuntimeException {

        public ColorException() {
        }

        public ColorException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        System.out.println("Area of rectangle is " + squareRectangle());

        // #2
        Plant[] plants = new Plant[5];
        try {
            plants[0] = new Plant(5, PlantColor.Green, PlantType.Flower);
            plants[1] = new Plant(1, grey, tree);
            for (Plant plant : plants) {
                if (plant.getColor() != PlantColor.Green |
                    plant.getColor() != PlantColor.Red |
                        plant.getColor() != PlantColor.Yellow) {
                    throw new ColorException("Bad color");
                }

            }
        } catch (ColorException e) {
            e.getMessage();
        }
    }

    //#1

    public static int squareRectangle () throws IllegalArgumentException{
        System.out.println("please enter 2 integers:");
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        try {
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a <= 0 | b<= 0) {
            throw new IllegalArgumentException("Please only positive values");
            }
            return a*b;
        } catch (InputMismatchException e) {
            System.out.println("Please input integers only");
            e.getMessage();
            return 0;
        } finally {
            scanner.close();
        }
    }




}
