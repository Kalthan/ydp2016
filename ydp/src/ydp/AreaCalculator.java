package ydp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static ydp.RaportTypes.*;
import ydp.shapes.Shape;

/**
 * @author Michal Radkiewicz
 */
public class AreaCalculator {

    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<Shape>();
        UserInteraction ui = new UserInteraction();
        ShapeFactory sf = new ShapeFactory(ui);
        Shape tempShape;
        int id = 0; // kazdy kszalt bedzie mial kolejne id
        Scanner sc = new Scanner(System.in);
        boolean exit = false;// warunek wyjscia z petli(zmiana w exit)
        while (!exit) {
            System.out.println("Commands : hello, showall, area, exit ");
            switch (sc.next()) {
                case "area":
                    tempShape = sf.createShape(id);
                    System.out.println("area: " + tempShape.getArea());
                    shapesList.add(tempShape);// zapisujemy kszalty do pamieci
                    ++id;
                    break;
                case "hello":
                    System.out.println("Welcome to Area Calculator. Enter command.");
                    break;
                case "showall":
                    ui.generateAreaRaport(DEFAULT, shapesList);
                    break;
                case "exit":
                    exit = true;
                    break;

            }

        }
    }

}
