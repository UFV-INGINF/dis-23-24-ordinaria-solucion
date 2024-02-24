package es.ufv.dis.ordinaria.api.models;

import java.util.HashMap;
import java.util.Map;

public class ShipLog {


    private Map<String, Integer> shipLog = new HashMap<>();

    public ShipLog(Map<String, Integer> shipLog) {
        this.shipLog = shipLog;
    }

    public ShipLog() {
    }

    public Map<String, Integer> getShipLog() {
        return shipLog;
    }

    public void setShipLog(Map<String, Integer> shipLog) {
        this.shipLog = shipLog;
    }
}
