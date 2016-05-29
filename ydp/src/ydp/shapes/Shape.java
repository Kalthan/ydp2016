package ydp.shapes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Michal Radkiewicz
 */
public abstract class Shape {

    // wspolny zbior id dla wszystkich ksztaltow
    protected final int id;
    // data jest we wszystkich ksztaltach, tworzona automatycznie w konstruktorze 
    protected final String creationTime;
    // pole powierzchni figury . brak setter-> ( zmiana pola nastepuje automatycznie przy zmianie bokow lub w konstruktorze)
    protected float area;

    public Shape(int id) {
        Date currentTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy  HH:mm");
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
