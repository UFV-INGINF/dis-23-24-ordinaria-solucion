package es.ufv.dis.ordinaria.api.controllers;

import es.ufv.dis.ordinaria.api.models.Ship;
import es.ufv.dis.ordinaria.api.models.ShipRequest;
import es.ufv.dis.ordinaria.api.services.ShipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ShipsController {
    @Autowired
    ShipsService shipsService;

    @GetMapping("/ships")
    public ArrayList<Ship> getShips() {
        return shipsService.getShips();
    }

    @PostMapping(value = "/ships", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.ALL_VALUE)
    public ResponseEntity<String> addShip(@RequestBody ShipRequest ship) {
        shipsService.writeRequestsLog(ship);
        shipsService.getShipAndPDF(ship);
        return ResponseEntity.ok("Ship request added to the log.");
    }


}
