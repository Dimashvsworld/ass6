package com.company.builder;

public class Main {

    public static void main(String[] args) {

        House SomeHouse = new House.Builder()
                .windows(6)
                .doors(6)
                .rooms(4)
                .hasGarage(true)
                .hasSwimPool(false)
                .hasStatues(true)
                .hasGarden(true)
                .build();
        System.out.println(SomeHouse);

    }
}
