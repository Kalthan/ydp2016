package ydp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static ydp.RaportTypes.*;
import ydp.shapes.Shape;

/**
 * @author Michal Radkiewicz
 */
public class Ydp {

    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<Shape>();
        UserInteraction ui = new UserInteraction();
        ShapeFactory sf = new ShapeFactory(ui);
        Shape tempShape;
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Commands : hello, showall, area, exit ");
            switch (sc.next()) {
                case "area":
                    tempShape = sf.createShape();
                    System.out.println("area: " + tempShape.getArea());
                    shapesList.add(tempShape);
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
                default:

            }

        }
    }

}
