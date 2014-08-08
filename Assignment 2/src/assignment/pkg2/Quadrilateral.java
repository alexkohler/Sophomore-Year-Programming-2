//Quadrilateral.java - Inheritance Hierachy exercise for CMPSC 221- 2-4-14
//Written by Alexander Kohler 
//INSTRUCTIONS:
/*Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram,
 Rectangle, and Square. 
 Use Quadrilateral as the superclass of the hierarchy. 
 Create and use a Point class to represent the points in each shape. 
 Make the hierarchy as deep (i.e. as many levels) as possible. 
 Specify the instance variables and methods for each class. 
 The private instance variables of Quadrilateral should be the x-y coordinate pairs
 for the four endpoints of the Quadrilateral. 
 Write a program that instantiates objects of your classes and outputs each object's
 area (except Quadrilateral). Each class should use an area calculation appropriate 
 for that class. The four coordinate points of each figure should be 
 specified in the following order, top left, top right, bottom right, and 
 bottom left. To simplify the calculations, you can assume that the figures 
 have tops and bottoms that are parallel to the x axis. 
 All of your code should be in the Quadrilateral.java file which will be 
 submitted in the Assignment 2 Dropbox.*/
package assignment.pkg2;

//Quadrilateral Class- Our superclass 
public class Quadrilateral {

    //Four points of the Quadrilateral-top left, top right, bottom right, bottom left, etc
    Point TL;
    Point TR;
    Point BR;
    Point BL;

    //default constructor for quadrilateral
    Quadrilateral(Point topLeft, Point topRight, Point bottomRight, Point bottomLeft) {
        TL = topLeft;
        TR = topRight;
        BR = bottomRight;
        BL = bottomLeft;

    }

    //default constructor
    Quadrilateral() {
    }

    //Class to create points for each of our subclasses
    public static class Point extends Quadrilateral {

        private double x;
        private double y;

        //overriding default constructor to take two arguments
        Point(double X, double Y) {
            x = X;
            y = Y;
        }

    }

    // Trapezoid, Parallelogram, rectangle and square classes are our subclasses of Quadrilateral
    public static class Trapezoid extends Quadrilateral {

        //Trapezoid consructor 
        Trapezoid(Point trapezoidTL, Point trapezoidTR, Point trapezoidBR, Point trapezoidBL) {
            super(trapezoidTL, trapezoidTR, trapezoidBR, trapezoidBL);
        }

        //Area computation for Trapezoid- needs overriden from the superclass's general "base times height" area formula 
        double Area() {
            //find bases by using distance formula between TR and TL coordinates for top base, then BR and BL for bottom base 
            double base1 = Math.sqrt((TR.x - TL.x) * (TR.x - TL.x) + (TR.y - TL.y) * (TR.y - TL.y));

            double base2 = Math.sqrt((BR.x - BL.x) * (BR.x - BL.x) + (BR.y - BL.y) * (BR.y - BL.y));

            //height is computed by the absolute value of the difference in bases 
            double height = Math.abs(base1 - base2);

            //we have all parts required to compute, plug them into formula 
            return (.5 * height * (base1 + base2));
        }

    }

    public static class Parallelogram extends Quadrilateral {

        //parallelogram constructor
        Parallelogram(Point parallelogramTL, Point parallelogramTR, Point parallelogramBR, Point parallelogramBL) {
            super(parallelogramTL, parallelogramTR, parallelogramBR, parallelogramBL);
        }

        //Area computation for parallelogram- needs overriden from the superclass's general "base times height" area formula 
        double Area() {
            //To find height, Compute distance between TL and BL y coordinates of our parallelogram
            double height = TL.y - BL.y;

            //To find the base, compute distance between BR and BL points of our shape
            double base = BR.x - BL.x;

            //compute and return the area via base * height 
            return base * height;

        }
    }

    public static class Rectangle extends Quadrilateral {

        //Rectangle object constructor
        Rectangle(Point rectangleTL, Point rectangleTR, Point rectangleBR, Point rectangleBL) {
            super(rectangleTL, rectangleTR, rectangleBR, rectangleBL);

        }

        double Area() {
            //To find height, Compute distance between TL and BL points of our shape
            double height = Math.sqrt((TL.x - BL.x) * (TL.x - BL.x) + (TL.y - BL.y) * (TL.y - BL.y));

            //To find the base, compute distance between BR and BL points of our shape
            double base = Math.sqrt((BR.x - BL.x) * (BR.x - BL.x) + (BR.y - BL.y) * (BR.y - BL.y));

            //compute and return the area via base * height 
            return base * height;
        }

    }

    public static class Square extends Quadrilateral {

        //Rectangle object constructor
        Square(Point squareTL, Point squareTR, Point squareBR, Point squareBL) {
            super(squareTL, squareTR, squareBR, squareBL);

        }

        double Area() {
            //To find height, Compute distance between TL and BL points of our shape
            double height = Math.sqrt((TL.x - BL.x) * (TL.x - BL.x) + (TL.y - BL.y) * (TL.y - BL.y));

            //To find the base, compute distance between BR and BL points of our shape
            double base = Math.sqrt((BR.x - BL.x) * (BR.x - BL.x) + (BR.y - BL.y) * (BR.y - BL.y));

            //compute and return the area via base * height 
            return base * height;
        }

    }

    public static void main(String[] args) {

        //Trapezoid coordinate points
        Point trapezoidTL = new Point(2.0, 4.0);
        Point trapezoidTR = new Point(5.0, 4.0);
        Point trapezoidBR = new Point(4.0, 2.0);
        Point trapezoidBL = new Point(3.0, 2.0);

        Trapezoid myTrapezoid = new Trapezoid(trapezoidTL, trapezoidTR, trapezoidBR, trapezoidBL);
        System.out.print("The area of the trapezoid is: " + myTrapezoid.Area() + "\n");

        //Parallelogram coordinate points
        Point parallelogramTL = new Point(2.0, 4.0);
        Point parallelogramTR = new Point(5.0, 4.0);
        Point parallelogramBR = new Point(6.0, 2.0);
        Point parallelogramBL = new Point(3.0, 2.0);

        Parallelogram myParallelogram = new Parallelogram(parallelogramTL, parallelogramTR, parallelogramBR, parallelogramBL);
        System.out.print("The area of the parallelogram is: " + myParallelogram.Area() + "\n");

        //Rectangle coordinate points
        Point rectangleTL = new Point(2.0, 4.0);
        Point rectangleTR = new Point(5.0, 4.0);
        Point rectangleBR = new Point(5.0, 2.0);
        Point rectangleBL = new Point(2.0, 2.0);

        Rectangle myRectangle = new Rectangle(rectangleTL, rectangleTR, rectangleBR, rectangleBL);
        System.out.print("The area of the rectangle is: " + myRectangle.Area() + "\n");

        //Square coordinate points 
        Point squareTL = new Point(2.0, 4.0);
        Point squareTR = new Point(4.0, 4.0);
        Point squareBR = new Point(4.0, 2.0);
        Point squareBL = new Point(2.0, 2.0);

        Square mySquare = new Square(squareTL, squareTR, squareBR, squareBL);
        System.out.print("The area of the square is: " + mySquare.Area() + "\n");

    }

}
