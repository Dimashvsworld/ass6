package com.company.factory;

public class SeaLogistics extends Logistics {

    @Override
    public Transport getTransport() {
        return new Ship();
    }
}
