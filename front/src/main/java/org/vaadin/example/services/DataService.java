package org.vaadin.example.services;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.vaadin.example.Requests.ShipRequests;
import org.vaadin.example.models.Ship;
import org.vaadin.example.models.ShipRequest;

@Service
public class DataService implements Serializable {

    public ArrayList<Ship> getShips() {
        return new ShipRequests().getShips();
    }

    public int senPDFRequest(String ship) {
        System.out.println("Sending PDF request for " + ship);
        ShipRequest request = new ShipRequest();
        request.setShip(ship);
        return new ShipRequests().sendPDFRequest(request);
    }

}
