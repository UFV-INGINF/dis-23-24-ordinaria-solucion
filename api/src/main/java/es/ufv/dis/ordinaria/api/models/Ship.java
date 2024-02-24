package es.ufv.dis.ordinaria.api.models;


import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Ship {

    @SerializedName("name")
    private String name;
    @SerializedName("model")
    private String model;
    @SerializedName("cost_in_credits")
    private String costInCredits;
    @SerializedName("crew")
    private String crew;
    @SerializedName("cargo_capacity")
    private String cargoCapacity;
    @SerializedName("consumables")
    private String consumables;
    @SerializedName("hyperdrive_rating")
    private String hyperdriveRating;
    @SerializedName("starship_class")
    private String starshipClass;
    @SerializedName("pilots")
    private String[] pilots;
    @SerializedName("films")
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

    public void setPilots(String[] pilots) {
        this.pilots = pilots;
    }

    public String[] getFilms() {
        return films;
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
