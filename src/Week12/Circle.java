package Week12;

public class Circle extends GeometricObject {

    private double radius;

    //No-args constructor
    Circle(){
        radius = 0;
    }

    //Parameterized constructor
    Circle(double newCR, int newID){
        this.setRadius(newCR);
        this.setID(newID);
    }

    //Setter Method
    private void setRadius(double radius){
        this.radius = radius;
    }

    //Overriding Methods
    @Override
    public void setID(int newID) {
        id = newID;
    }

    @Override
    int getID() {
        return id;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
