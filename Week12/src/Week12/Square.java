package Week12;

public class Square extends GeometricObject{

    private double side;

    //No-args constructor
    Square(){
        side = 0;
    }

    //Parameterized constructor
    Square(double newS, int newID){
        this.setSide(newS);
        this.setID(newID);
    }

    //Setter Method
    private void setSide(double newS) {
        this.side = newS;
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
        return Math.pow(side, 2);
    }
}
