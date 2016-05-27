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
    protected Date created;
    // pole powierzchni figury, brak settera( zmiana pola nastepuje automatycznie przy zmianie bokow lub w konstruktorze)
    protected float area;

    public Shape(int id) {
//        tworzy  datę i id. Dostep do id oraz daty tylko przez konstruktor
//        ( nie chcemy by ktos mieszal w danych statystycznych)
        created = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = dateFormat.format(created);

        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Date getCreated() {
        return created;
    }

    public float getArea() {
        return area;
    }
}
