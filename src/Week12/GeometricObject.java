package Week12;

//Make an abstract class for Geometric Object
public abstract class GeometricObject {

    //Attribute
    protected int id;

    //No-args constructor
    GeometricObject(){
        id = 0;
    }

    //Parameterized constructor
    GeometricObject(int newID){
        this();
        this.setID(newID);
    }

    //make abstract methods for sub-classes to use
    abstract void setID(int newID);
    abstract int getID();
    abstract double getArea();
}
