package ydp;

import ydp.shapes.*;

/**
 * @author Michal Radkiewicz
 */
public class ShapeFactory {

    UserInteraction ui;

    public ShapeFactory(UserInteraction ui) {
        this.ui = ui;
    }

    public Shape createShape() {
        while (true) {
            System.out.println("Please enter shape name");

            switch (ui.getStringData()) {
                case "RECTANGLE":
                    System.out.println("Please enter first side value;");
                    float side1 = ui.getFloatData();
                    System.out.println("Please enter second side value");
                    float side2 = ui.getFloatData();

                    Rectangle rectangle = new Rectangle(1, side1, side2);
                    return rectangle;

                case "CIRCLE":
                    System.out.println("Please enter radius value");
                    float radius = ui.getFloatData();

                    Circle circle = new Circle(1, radius);
                    return circle;

                case "SQUARE":
                    System.out.println("Please enter side value");
                    float side = ui.getFloatData();

                    Square square = new Square(1, side);
                    return square;

                default:
                    System.out.println("Wrong Shape\n Try again(YES/NO)?");
                    
                    while (true) {
                        String choice = ui.getStringData();
                        if (choice.equals("NO") || choice.equals("N")) {
                            return null;
                        } else if (choice.equals("YES") || choice.equals("Y")) {
                            break;
                        } else {
                            System.out.println("Type YES or NO");
                        }
                    }
            }
        }
    }
}
