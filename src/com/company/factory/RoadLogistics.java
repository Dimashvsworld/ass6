package com.company.factory;

public class RoadLogistics extends Logistics {

    @Override
    public Transport getTransport() {
        return new Truck();
    }
}
