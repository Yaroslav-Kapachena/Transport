package com.example.Transport;

public class Underground extends Transport {
    private  int lengthOfCar;
    public Underground(){
    }

    public Underground(int lengthOfCar) {
        this.lengthOfCar = lengthOfCar;
    }

    public Underground(int valueOfPassengers, String typeOfTransport, int priceForFuel, int priceForFood,
                       int priceForInternationalTrip, int lengthOfCar) {
        super(valueOfPassengers, typeOfTransport, priceForFuel, priceForFood, priceForInternationalTrip);
        this.lengthOfCar = lengthOfCar;
    }

    public int getLengthOfCar() {
        return lengthOfCar;
    }

    public void setLengthOfCar(int lengthOfCar) {
        this.lengthOfCar = lengthOfCar;
    }

    @Override
    public void countTicketPrice(Transport transport) {
        int priceForTicket;
        priceForTicket = transport.getPriceForFuel()/transport.getValueOfPassengers()/2;
        System.out.println(priceForTicket);
    }

    @Override
    public void printInf(Transport transport) {
        System.out.println(transport.getValueOfPassengers()+" "+transport.getTypeOfTransport());
    }

}
