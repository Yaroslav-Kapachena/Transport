package com.example.Transport;

public abstract class Transport {
    private int valueOfPassengers;
    private String typeOfTransport;
    private int priceForFuel;
    private int priceForFood;

    public  Transport(){
    }

    public Transport(int valueOfPassengers, String typeOfTransport, int priceForFuel, int priceForFood) {
        this.valueOfPassengers = valueOfPassengers;
        this.typeOfTransport = typeOfTransport;
        this.priceForFuel = priceForFuel;
        this.priceForFood = priceForFood;
    }

    public int getValueOfPassengers() {
        return valueOfPassengers;
    }

    public void setValueOfPassengers(int valueOfPassengers) {
        this.valueOfPassengers = valueOfPassengers;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public int getPriceForFuel() {
        return priceForFuel;
    }

    public void setPriceForFuel(int priceForFuel) {
        this.priceForFuel = priceForFuel;
    }

    public int getPriceForFood() {
        return priceForFood;
    }

    public void setPriceForFood(int priceForFood) {
        this.priceForFood = priceForFood;
    }

    public abstract void countTicketPrice(Transport transport);

    public abstract void printInf(Transport transport);
}
