/*
Your program must do the following:

1. Tell the user what the program does.

2. Create the following objects and store the references to them in a single ArrayList.

A Circle object with a radius of 10 inches and an identifier of 156.
A Square object with a side of 2 inches and an identifier of 237.
A Right Triangle with a height of 3 inches, a base of 4 inches and an identifier of 212.

3. Iterate through the ArrayList and display the area of the three different shape objects you have created.

Your output should look like this:

Identifier Area
156     314.16 sq. inches
237       4.00 sq. inches
212.      6.00 sq. inches
 */
package Week12;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Start an Array List
        ArrayList<GeometricObject> shapes = new ArrayList<>();
        //Provide a description of the program
        System.out.println("This program takes the information of a circle, a square and a triangle with its own " +
                "unique identifier and puts it into a list.\n");

        //Make new shapes
        Circle c = new Circle(10, 156);
        Square s = new Square(2, 237);
        Triangle t = new Triangle(3, 4, 212);

        //Add the shapes to the array list
        shapes.add(c);
        shapes.add(s);
        shapes.add(t);

        //Provide heading for the list
        System.out.println("Identifier Area");

        //Use a for loop to populate the list
        for(GeometricObject gO : shapes){
            System.out.printf("%d \t %4.2f sq. inches\n", gO.getID(), gO.getArea());
        }
    }
}
