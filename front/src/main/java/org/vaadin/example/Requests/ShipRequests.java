package org.vaadin.example.Requests;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.vaadin.example.models.Ship;
import org.vaadin.example.models.ShipRequest;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import static org.springframework.web.servlet.function.RequestPredicates.POST;

public class ShipRequests {

    public ArrayList<Ship> getShips() {
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/ships"))
                    .GET()
                    .build();

            HttpResponse<String> response = null;
            Gson gson = new Gson();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Type shipsListType = new TypeToken<ArrayList<Ship>>() {
            }.getType();
            return gson.fromJson(response.body(), shipsListType);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public int sendPDFRequest(ShipRequest ship) {
        Gson gson = new Gson();
        HttpClient client = HttpClient.newHttpClient();
        System.out.println(gson.toJson(ship));
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8080/ships"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(ship)))
                    .build();

            HttpResponse<String> response = null;
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.statusCode();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

}
