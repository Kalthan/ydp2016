package ydp.shapes;

/**
 *
 * @author Michal Radkiewicz
 */
public class Square extends Shape {
// bok kwadratu
    private float side;

    public Square(int id, float side) {// wylicza  pole kwadratu
        super(id);// konstruktor tworzacy id oraz date
        this.side = side;
        this.area = side*side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {// przy zmianie wartosci boku kwadratu, zmieniane jest rowniez pole
        this.side = side;
        this.area = side*side;
    }

}
