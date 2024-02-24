package es.ufv.dis.ordinaria.api.datahandler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import es.ufv.dis.ordinaria.api.models.Ship;
import es.ufv.dis.ordinaria.api.models.ShipLog;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JSONManager {

    //Read JSON file

    public ArrayList<Ship> getShipsList() {
        ArrayList<Ship> ships = new ArrayList<Ship>();
        Type userListType = new TypeToken<ArrayList<Ship>>() {
        }.getType();

        try {
            FileReader reader = new FileReader("data.json");
            ships = new Gson().fromJson(reader, userListType);
            System.out.println(ships);
            reader.close();
            return ships;

        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Ship getShipInfo(String ship) {
        ArrayList<Ship> ships = getShipsList();
        for (Ship s : ships) {
            if (s.getName().equals(ship)) {
                return s;
            }
        }
        return null;
    }

    public ShipLog getRequestsLog() {
        ShipLog requestsLog;
        Type userListType = new TypeToken<ShipLog>() {
        }.getType();

        try {
            FileReader reader = new FileReader("peticiones/requests.json");
            requestsLog = new Gson().fromJson(reader, userListType);
            System.out.println(requestsLog.getShipLog());
            reader.close();
            return requestsLog;

        } catch (FileNotFoundException e) {
            return new ShipLog();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // Write JSON file
    public void writeRequestsLog(String ship) {
        ShipLog requestsLog = getRequestsLog();
        if (requestsLog.getShipLog().containsKey(ship)) {
            requestsLog.getShipLog().put(ship, requestsLog.getShipLog().get(ship) + 1);
        } else {
            requestsLog.getShipLog().put(ship, 1);
        }
        try {
            FileWriter writer = new FileWriter("peticiones/requests.json");
            new Gson().toJson(requestsLog, writer);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
