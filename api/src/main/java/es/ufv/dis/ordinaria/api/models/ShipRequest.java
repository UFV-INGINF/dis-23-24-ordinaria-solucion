package es.ufv.dis.ordinaria.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipRequest {
    private String ship;

    public ShipRequest(String ship) {
        this.ship = ship;
    }

    public ShipRequest() {
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }


}
