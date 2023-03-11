package com.example.Transport;

public class AirPlane extends Transport{
    private String model;
    public AirPlane(){
    }

    public AirPlane(int valueOfPassengers, String typeOfTransport, int priceForFuel, int priceForFood,
                    int priceForInternationalTrip, String model) {
        super(valueOfPassengers, typeOfTransport, priceForFuel, priceForFood, priceForInternationalTrip);
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
        System.out.println(priceForTicket);
    }

    @Override
    public void printInf(Transport transport) {
        System.out.println(transport.getPriceForFood()+" "+transport.getValueOfPassengers()+" "+transport.getTypeOfTransport());
    }
}
