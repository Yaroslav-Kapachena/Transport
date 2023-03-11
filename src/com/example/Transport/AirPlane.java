package com.example.Transport;

public class AirPlane extends Transport{
    private String model;

    public AirPlane(String model) {
        this.model = model;
    }

    public AirPlane(int valueOfPassengers, String typeOfTransport, int priceForFuel, int priceForFood, String model) {
        super(valueOfPassengers, typeOfTransport, priceForFuel, priceForFood);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void countTicketPrice(Transport transport) {
        int priceForTicket;
        priceForTicket = transport.getPriceForFuel()+ transport.getPriceForFood()/transport.getValueOfPassengers();
    }

    @Override
    public void printInf(Transport transport) {
        System.out.println(getPriceForFood()+""+getValueOfPassengers()+""+getTypeOfTransport());
    }
}
