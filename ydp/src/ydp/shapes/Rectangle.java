package ydp.shapes;

/**
 * @author Michal Radkiewicz
 */
public class Rectangle extends Shape {
    //boki prostokata
    private float side1, side2;

    public Rectangle(int id, float side1, float side2) {// wylicza pole prostokata
        super(id);// konstruktor tworzacy id oraz date
        this.side1 = side1;
        this.side2 = side2;
        this.area = side1*side2; 
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
        this.area = this.side1*this.side2;// wylicza pole przy zmianie boku
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
        this.area = this.side1*this.side2;// wylicza pole przy zmianie boku
    }
    

}
