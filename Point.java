//a class called Point

public class Point {
//constructor chaining
//instance variable public, x coordinates and y coordinates
//visibility of classes, variables and methods, if public variables, outside entities will have access
//if make these variables private, we will control access to variables and the alteration of their values

    public double x;
    private double y;

    // getter and setter methods allow limited or complete access by outside entities.
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    //assigning the values of a and b to the instance variable x and y, that are found in the class
    public Point(double a, double b){
        x = a;
        y = b;
    }

    //second constructor, this.x - reference variable, this.y refer to the instance variable of class
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //third example of constructor, facilitates object instantiation flexibility
    //instead of writing a full constructor where we assign value a to x, value 0 to y, constructor
    //chaining, call parameters a and 0, passing in know value for x which is a, default value to y
    public Point(double a) {
        this(a, 0);
    }

}

//visibility modifiers - like public and private labels, apply to classes, variables and methods.
//Constructors, Generics and References
//Iterator, Iterable
//Comparable, Comparator
//Big-O


