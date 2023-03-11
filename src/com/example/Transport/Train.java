package com.example.Transport;

public class Train extends Transport{
    private int priceForBedding;
    private boolean isTrainInternational;

    public Train(int priceForBedding, boolean isTrainInternational) {
        this.priceForBedding = priceForBedding;
        this.isTrainInternational = isTrainInternational;
    }

    public Train(int valueOfPassengers, String typeOfTransport, int priceForFuel, int priceForFood,
                 int priceForInternationalTrip, int priceForBedding, boolean isTrainInternational) {
        super(valueOfPassengers, typeOfTransport, priceForFuel, priceForFood, priceForInternationalTrip);
        this.priceForBedding = priceForBedding;
        this.isTrainInternational = isTrainInternational;
    }

    public int getPriceForBedding() {
        return priceForBedding;
    }

    public void setPriceForBedding(int priceForBedding) {
        this.priceForBedding = priceForBedding;
    }

    public boolean isTrainInternational() {
        return isTrainInternational;
    }

    public void setTrainInternational(boolean trainInternational) {
        isTrainInternational = trainInternational;
    }

    @Override
    public void countTicketPrice(Transport transport) {
        int priceForTicket;
        priceForTicket=+getPriceForFuel()/getValueOfPassengers();
        System.out.println(priceForTicket);
    }

    @Override
    public void printInf(Transport transport) {
        System.out.println(getTypeOfTransport()+" "+getValueOfPassengers());
    }
}
