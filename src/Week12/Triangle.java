package Week12;

public class Triangle extends GeometricObject {
    private double height;
    private double base;

    //No-args constructor
    Triangle(){
        height = 0;
        base = 0;
    }

    //Parameterized constructor
    Triangle(double newH, double newB, int newID){
        this.setHeight(newH);
        this.setBase(newB);
        this.setID(newID);
    }

    //Setter Methods
    private void setHeight(double newH) {
        this.height = newH;
    }

    private void setBase(double newB) {
        this.base = newB;
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
        double half = 0.5;
        return half * base * height;
    }
}
