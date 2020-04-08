package com.SoftServAcademy;

import java.util.Arrays;
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
            plants[0] = new Plant(1, PlantColor.Green, PlantType.Flower);
            plants[1] = new Plant(2, PlantColor.Grey, PlantType.Flower);
            plants[2] = new Plant(3, PlantColor.Grey, PlantType.Moss);
            plants[3] = new Plant(4, PlantColor.Red, PlantType.Moss);
            plants[4] = new Plant(5, PlantColor.Green, PlantType.Grass);

            for (Plant plant : plants) {
                if (plant.getColor() == PlantColor.Grey && plant.getType() == PlantType.Flower) {
                    throw new ColorException("Flower cant be grey");
                }
                else if (plant.getColor() == PlantColor.Red && plant.getType() == PlantType.Moss) {
                    throw new ColorException("Moss cant be red");
                    //Почему я не могу сдлелать вторую проверку с другим сообщением?
                }
            }
        } catch (ColorException e) {
            System.out.println("Check colors");
            System.out.println(e.getMessage());
        } System.out.println(Arrays.toString(plants));
    }

    //#1
    public static int squareRectangle () throws IllegalArgumentException{
        System.out.println("please enter 2 integers:");
        int a;
        int b;
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
