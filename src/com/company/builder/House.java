package com.company.builder;

public class House {
    private final int windows;
    private final int doors;
    private final int rooms;
    private final boolean hasGarage;
    private final boolean hasSwimPool;
    private final boolean hasStatues;
    private final boolean hasGarden;


    public static class Builder {

        private int windows;
        private int doors;
        private int rooms;
        private boolean hasGarage;
        private boolean hasSwimPool;
        private boolean hasStatues;
        private boolean hasGarden;


        public Builder windows(int number){this.windows = number; return this; }
        public Builder doors(int number){this.doors = number; return this; }
        public Builder rooms(int number){this.rooms = number; return this; }
        public Builder hasGarage(boolean number){this.hasGarage = number; return this; }
        public Builder hasSwimPool(boolean number){this.hasSwimPool = number; return this; }
        public Builder hasStatues(boolean number){this.hasStatues = number; return this; }
        public Builder hasGarden(boolean number){this.hasGarden = number; return this; }


        public House build() {
            return new House(this);
        }
    }

    private House(Builder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
        this.hasSwimPool = builder.hasSwimPool;
        this.hasStatues = builder.hasStatues;
        this.hasGarden = builder.hasGarden;

    }

    @Override
    public String toString() {
        return "House{" + "windows=" + windows + ", doors=" + doors + ", rooms=" + rooms + ", has garage=" + hasGarage + ", has swimming pool=" + hasSwimPool + ", has statues=" + hasStatues + ", has garden=" + hasGarden + '}';

    }

}
