package com.company.factory;

public abstract class Logistics {

    public void planDelivery() {
        Transport transport = getTransport();
        transport.deliver();
    }

    public abstract Transport getTransport();

}
