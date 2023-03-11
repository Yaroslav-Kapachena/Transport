package com.example.Transport;

public class TestLogic {
    public static void main(String[] args) {

    Transport transport1 = new AirPlane(250,"Наземный" , 1200,900,
             100,"rthrthrg");
    transport1.countTicketPrice(transport1);
    transport1.printInf(transport1);
    }
}
