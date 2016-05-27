package ydp;

import ydp.shapes.*;

/**
 * @author Michal Radkiewicz
 */
public class ShapeFactory {// klasa tworzaca i zwracajaca ksztalty

    UserInteraction ui;

    public ShapeFactory(UserInteraction ui) {
        this.ui = ui;
    }

    public Shape createShape(int id) { // metoda tworzaca ksztalty
        while (true) {
            System.out.println("Please enter shape name");

            switch (ui.getStringData()) {
                case "RECTANGLE":
                    System.out.println("Please enter first side value;");
                    float side1 = ui.getFloatData();
                    System.out.println("Please enter second side value");
                    float side2 = ui.getFloatData();

                    Rectangle rectangle = new Rectangle(id, side1, side2);
                    return rectangle;

                case "CIRCLE":
                    System.out.println("Please enter radius value");
                    float radius = ui.getFloatData();

                    Circle circle = new Circle(id, radius);
                    return circle;

                case "SQUARE":
                    System.out.println("Please enter side value");
                    float side = ui.getFloatData();

                    Square square = new Square(id, side);
                    return square;

                default:
                    System.out.println("Wrong Shape\n Try again(YES/NO)?");
                    
                    while (true) {
                        String choice = ui.getStringData();
                        if (choice.equals("NO") || choice.equals("N")) {  // wraca do menu
                            return null;
                        } else if (choice.equals("YES") || choice.equals("Y")) {// powtarza wybor kszaltu
                            break;
                        } else {
                            System.out.println("Type YES or NO"); // powtarza zapytanie YES or NO
                        }
                    }
            }
        }
    }
}
