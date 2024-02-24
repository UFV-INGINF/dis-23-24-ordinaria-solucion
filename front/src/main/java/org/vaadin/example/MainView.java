package org.vaadin.example;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.data.renderer.NativeButtonRenderer;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.models.Ship;
import org.vaadin.example.services.DataService;

import java.util.List;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 * <p>
 * The main view contains a text field for getting the user name and a button
 * that shows a greeting message in a notification.
 */
@Route("")
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed
     *                bean.
     */
    public MainView(@Autowired DataService service) {


        Grid<Ship> grid = new Grid<>(Ship.class, false);
        grid.addColumn(Ship::getName).setHeader("Ship name");
        grid.addColumn(Ship::getModel).setHeader("Ship model");
        grid.addColumn(Ship::getCostInCredits).setHeader("Cost in credits");
        grid.addColumn(Ship::getCrew).setHeader("Crew");
        grid.addColumn(Ship::getCargoCapacity).setHeader("Cargo capacity");
        grid.addColumn(Ship::getConsumables).setHeader("Consumables");
        grid.addColumn(Ship::getHyperdriveRating).setHeader("Hyperdrive rating");
        grid.addColumn(Ship::getStarshipClass).setHeader("Starship class");
        grid.addColumn(Ship::getPilotsView).setHeader("Pilots");
        grid.addColumn(Ship::getFilmsView).setHeader("Films");
        grid.addColumn(new NativeButtonRenderer<>("Generar", clickedItem -> {
                    service.senPDFRequest(clickedItem.getName());
                })
        ).setHeader("Generar PDF");
        List<Ship> ship = service.getShips();
        grid.setItems(ship);
        grid.setWidth("100%");
        grid.setWidthFull();
        addClassName("centered-content");

        add(grid);

    }

}
