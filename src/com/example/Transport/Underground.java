package com.example.Transport;

public class Underground extends Transport {
    private  int lengthOfCar;

    public int getLengthOfCar() {
        return lengthOfCar;
    }

    public void setLengthOfCar(int lengthOfCar) {
        this.lengthOfCar = lengthOfCar;
    }

    public Underground() {
    }

    public Underground(int valueOfPassengers, String typeOfTransport, int priceForFuel, int priceForFood) {
        super(valueOfPassengers, typeOfTransport, priceForFuel, priceForFood);
    }

    @Override
    public void countTicketPrice(Transport transport) {
        int priceForTicket;
        priceForTicket = transport.getPriceForFuel()/getValueOfPassengers()/2;
    }

    @Override
    public void printInf(Transport transport) {
        System.out.println(getValueOfPassengers()+""+getTypeOfTransport());
    }

}
