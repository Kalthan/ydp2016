package ydp.shapes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Michal Radkiewicz
 */
public abstract class Shape {

    // wspolny zbior id dla wszystkich ksztaltow
    protected int id;
    // data jest we wszystkich ksztaltach, tworzona automatycznie w konstruktorze 
    protected String creationTime;
    // pole powierzchni figury, brak settera( zmiana pola nastepuje automatycznie przy zmianie bokow lub w konstruktorze)
    protected float area;

    public Shape(int id) {
//        tworzy  datę i id. Dostep do id oraz daty tylko przez konstruktor
//        ( nie chcemy by ktos mieszal w danych statystycznych)
        Date currentTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        creationTime = dateFormat.format(currentTime);

        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public float getArea() {
        return area;
    }
}
