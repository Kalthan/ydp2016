package ydp;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import static ydp.RaportTypes.*;
import ydp.shapes.Shape;

/**
 * @author Michal Radkiewicz
 */
public class UserInteraction {  // klasa sluzy do komunikacji czlowiek-komputer,
                                // pobiera dane od uzytkownika oraz moze wyswietlac raporty

    private Scanner sc;

    public UserInteraction() {
        sc = new Scanner(System.in);
    }

    public void generateAreaRaport(RaportTypes type, List<Shape> list) {
        // tworzy raport o wczesniej obliczonych o polach powierzchni(data, ksztalt, pole)
        if (type.equals(DOTTED)) {
            //todo
        } else if (type.equals(DASHED)) {
            //todo
        } else {//deafult'owy raport
            for (Shape shape : list) {
                System.out.println(shape.getCreationTime() + ": " + shape.getClass().getSimpleName() + " " + shape.getArea());
            }
        }

    }

    public float getFloatData() {// mozna wybrac ktora metoda moga byc pobierane dane(konsola, formularz etc.) 
        return getFloatDataFromConsole();
    }

    public String getStringData() {// mozna wybrac ktora metoda moga byc pobierane dane(konsola, formularz etc.)
        return getStringDataFromConsole();
    }

    public float getFloatDataFromConsole() {// pobiera dane liczbowe z konsoli
        float temp = 0;
        while (true) {// trwa tak dlugo, dopoki nie pobierze poprawnej wartosci
            try {
                temp = sc.nextFloat();
                break;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("It should be float value");
            }
        }
        return temp;

    }

    public String getStringDataFromConsole() {// pobiera dane String z konsoli
        String temp;
        while (true) {// trwa tak dlugo, dopoki nie pobierze poprawnej wartosci
            try {
                temp = sc.next();
                break;
            } catch (NullPointerException e) {
                System.out.println("Please enter some value");
            }
        }
        return temp.toUpperCase();// ujednolica wprowadzone dane(Rectangle, rectangle, RECTANGLE etc.)
    }

    public String getStringDataFromForm() {//todo
        return null;
    }

    public Float getFloatDataFromForm() {//todo
        return null;
    }
}
