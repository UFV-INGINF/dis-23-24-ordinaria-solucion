package es.ufv.dis.ordinaria.api.services;

import es.ufv.dis.ordinaria.api.datahandler.JSONManager;
import es.ufv.dis.ordinaria.api.datahandler.PDFManager;
import es.ufv.dis.ordinaria.api.models.Ship;
import es.ufv.dis.ordinaria.api.models.ShipRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ShipsService {

    static public ArrayList<Ship> getShips() {
        return new JSONManager().getShipsList();
    }

    static public Ship getShipAndPDF(ShipRequest ship) {
        Ship shipInfo = new JSONManager().getShipInfo(ship.getShip());
        if (shipInfo == null) {
            return null;
        }
        PDFManager pdfManager = new PDFManager();
        pdfManager.createPDF(shipInfo);
        return shipInfo;
    }

    static public void writeRequestsLog(ShipRequest ship) {
        new JSONManager().writeRequestsLog(ship.getShip());
    }
}
