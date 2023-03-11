package com.example.Transport;

public class TestLogic {
    public static void main(String[] args) {

        AirPlane airPlane = new AirPlane(
                250,
                "Наземный",
                1200,
                900,
                100,
                "rthrthrg"
        );
        airPlane.countTicketPrice(airPlane);
        airPlane.printInf(airPlane);

        Bus bus = new Bus(100,
                "Наземный",
                500,
                0,
                150,
                true
        );
        bus.countTicketPrice(bus);
        bus.printInf(bus);
        Underground underground = new Underground(1000,
                "Подземный",
                1500,
                0,
                0,
                500
        );
        underground.countTicketPrice(underground);
        underground.printInf(bus);
        Train train = new Train(120,
                "Наземный",
                2500,
                700,
                0,
                250,
                false
        );
        train.countTicketPrice(train);
        train.printInf(train);
    }
}
