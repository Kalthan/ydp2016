package ydp.shapes;

/**
 * @author Michal Radkiewicz
 */
public class Circle extends Shape {
    private float radius;
    
    public Circle(int id, float radius){
        super(id);
        this.radius = radius;
        this.area = (float) Math.PI * radius*radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {// zmiana promienia - zmienia sie automatycznie pole
        this.radius = radius;
        this.area = (float) Math.PI * radius*radius;
    }

}
