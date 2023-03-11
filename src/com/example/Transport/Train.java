package com.example.Transport;

public class Train extends Transport{
    private int priceForBedding;
    private boolean isTrainInternational;

    public Train(int priceForBedding, boolean isTrainInternational) {
        this.priceForBedding = priceForBedding;
        this.isTrainInternational = isTrainInternational;
    }
    public Train(){
    }

    public Train(int valueOfPassengers, String typeOfTransport, int priceForFuel, int priceForBedding,
                 boolean isTrainInternational) {
        super(valueOfPassengers, typeOfTransport, priceForFuel);
        this.priceForBedding = priceForBedding;
        this.isTrainInternational = isTrainInternational;
    }

    public boolean isTrainInternational() {
        return isTrainInternational;
    }

    public void setTrainInternational(boolean trainInternational) {
        isTrainInternational = trainInternational;
    }
    public int getPriceForBedding() {
        return priceForBedding;
    }

    public void setPriceForBedding(int priceForBedding) {
        this.priceForBedding = priceForBedding;
    }

    @Override
    public void countTicketPrice(Transport transport) {
        int priceForTicket;
        priceForTicket=getPriceForBedding()+getPriceForFuel()/getValueOfPassengers();
    }

    @Override
    public void printInf(Transport transport) {
        System.out.println(getTypeOfTransport()+""+getValueOfPassengers());
    }
}
