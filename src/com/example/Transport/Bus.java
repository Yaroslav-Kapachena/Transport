package com.example.Transport;

public class Bus extends Transport {
    private boolean internationalOrNo;
    private int priceForInternationalTrip;
    public Bus(){
    }

    public Bus(boolean internationalOrNo, int priceForInternationalTrip) {
        this.internationalOrNo = internationalOrNo;
        this.priceForInternationalTrip = priceForInternationalTrip;
    }

    public Bus(int valueOfPassengers, String typeOfTransport, int priceForFuel, int priceForFood,
               int priceForInternationalTrip, boolean internationalOrNo) {
        super(valueOfPassengers, typeOfTransport, priceForFuel, priceForFood, priceForInternationalTrip);
        this.internationalOrNo = internationalOrNo;
    }

    public boolean isInternationalOrNo() {
        return internationalOrNo;
    }

    public void setInternationalOrNo(boolean internationalOrNo) {
        this.internationalOrNo = internationalOrNo;
    }

    public int getPriceForInternationalTrip() {
        return priceForInternationalTrip;
    }


    public void setPriceForInternationalTrip(int priceForInternationalTrip) {
        this.priceForInternationalTrip = priceForInternationalTrip;
    }

    @Override
    public void countTicketPrice(Transport transport) {
        int priceForTicket=0;
        if(internationalOrNo==true){
            priceForTicket =
                    transport.getPriceForFuel()+transport.getPriceForInternationalTrip()/transport.getValueOfPassengers();
            System.out.println(priceForTicket);
        }
        else{
            priceForTicket = transport.getPriceForFuel()/transport.getValueOfPassengers();
            System.out.println(priceForTicket);
        }
    }

    @Override
    public void printInf(Transport transport) {
        System.out.println(transport.getValueOfPassengers()+" "+transport.getTypeOfTransport());
    }
}
