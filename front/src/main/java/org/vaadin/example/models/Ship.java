package org.vaadin.example.models;



import java.util.Arrays;

public class Ship {

    private String name;
    private String model;
    private String costInCredits;
    private String crew;
    private String cargoCapacity;
    private String consumables;
    private String hyperdriveRating;
    private String starshipClass;
    private String[] pilots;
    private String[] films;

    public Ship(String name, String model, String costInCredits, String crew, String cargoCapacity, String consumables, String hyperdriveRating, String starshipClass, String[] pilots, String[] films) {
        this.name = name;
        this.model = model;
        this.costInCredits = costInCredits;
        this.crew = crew;
        this.cargoCapacity = cargoCapacity;
        this.consumables = consumables;
        this.hyperdriveRating = hyperdriveRating;
        this.starshipClass = starshipClass;
        this.pilots = pilots;
        this.films = films;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCostInCredits() {
        return costInCredits;
    }

    public void setCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public String getHyperdriveRating() {
        return hyperdriveRating;
    }

    public void setHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
    }

    public String getStarshipClass() {
        return starshipClass;
    }

    public void setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
    }

    public String[] getPilots() {
        return pilots;
    }

    public String getPilotsView() {
        String pilotsView = "";
        for (String pilot : pilots) {
            pilotsView += pilot + ", ";
        }
        return pilotsView;
    }

    public void setPilots(String[] pilots) {
        this.pilots = pilots;
    }

    public String[] getFilms() {
        return films;
    }

    public String getFilmsView() {
        String filmsView = "";
        for (String film : films) {
            filmsView += film + ", ";
        }
        return filmsView;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", costInCredits='" + costInCredits + '\'' +
                ", crew='" + crew + '\'' +
                ", cargoCapacity='" + cargoCapacity + '\'' +
                ", consumables='" + consumables + '\'' +
                ", hyperdriveRating='" + hyperdriveRating + '\'' +
                ", starshipClass='" + starshipClass + '\'' +
                ", pilots=" + Arrays.toString(pilots) +
                ", films=" + Arrays.toString(films) +
                '}';
    }
}
