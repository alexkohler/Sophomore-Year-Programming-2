//Shape Hierarchy - abstract class exercise
//Written by Alexander Kohler 

package shape;



/**
 *
 * @author aok5326
 */
public abstract class Shape {

    abstract double getArea();
  
    public static void main(String[] args) {
       
        //Instantiate an object of each type 
        Circle myCircle = new Circle(4); //pass radius to circle 
        Square mySquare = new Square(5); //pass side length to square 
        Triangle myTriangle = new Triangle(3, 4, 5, 7, 9); //pass base, height, and length of each side to triangle 
        Sphere mySphere = new Sphere(5); //pass radius to Sphere 
        Cube myCube = new Cube(3);//pass radius to cube 
        Tetrahedron myTetrahedron = new Tetrahedron(3); // pass edge length to tetrahedron 
        
        
        //Store these in shapes array 
        Shape myShapes[] = new Shape[6];
        myShapes[0] = myCircle;
        myShapes[1] = mySquare;
        myShapes[2] = myTriangle;
        myShapes[3] = mySphere;
        myShapes[4] = myCube;
        myShapes[5] = myTetrahedron;
        
        for (int i=0; i<6; i++){
        
       if (myShapes[i].getClass().getSuperclass().getSimpleName().equals("TwoDimensionalShape"))
       {
           System.out.printf( "Name:" + myShapes[i].getClass().getSimpleName() + "\n");
           //downcast myCircle
           System.out.printf("Area:" + myShapes[i].getArea() + "\n");
           TwoDimensionalShape shapeCast = (TwoDimensionalShape) myShapes[i];
           System.out.printf( "Perimeter: " + shapeCast.getPerimeter() + "\n" + "\n");
       }   
       else     
       {
           System.out.printf( "Name:" + myShapes[i].getClass().getSimpleName() + "\n");
           //downcast myCircle
           System.out.printf("Area:" + myShapes[i].getArea() + "\n");
           ThreeDimensionalShape shapeCast = (ThreeDimensionalShape) myShapes[i];
           System.out.printf( "Volume: " + shapeCast.getVolume() + "\n" + "\n");
       }
    }
        
    }
}

abstract class TwoDimensionalShape extends Shape{
  
    abstract double getPerimeter();
            
}

abstract class ThreeDimensionalShape extends Shape{

    abstract double getVolume();
    
}

class Square extends TwoDimensionalShape{
    
    private double sideLength;
    
    //overriding default constructor 
    Square(double side){
        sideLength = side;
    }
    
    //perimeter of a square is 4 times the side (all sides are even in a square) 
    @Override
    double getPerimeter()
    {
    return 4 * sideLength;
    }
    
    //area of a square is s^2
    @Override 
    double getArea()
    {
    return sideLength * sideLength;
    }
    
}

class Circle extends TwoDimensionalShape{
    //private member radius
    private double Radius;
    
    
    //Overriding default constructor 
    Circle (int radius )
    {
    Radius = radius;
    }
          
    
    @Override
    //Perimeter of a  circle is 2pi times the radius 
    double getPerimeter()
    {
    return 2 * Radius * Math.PI;
    }
    
    @Override 
    //Area of a circle is pi * r^2
    double getArea()
    {
    return Radius * Radius * Math.PI;
    }
    
}


class Triangle extends TwoDimensionalShape{
    //private members for computation
    private double Base;
    private double Height;
    private double Side1, Side2, Side3;
    
    

//override default constructor
//Triangle
    Triangle (double base, double height, double side1, double side2, double side3){
        Base = base;
        Height = height;
        Side1 = side1;
        Side2 = side2;
        Side3 = side3;
        
    }


  
    //to compute perimeter of a triangle add all three sides together 
    @Override
    double getPerimeter()
    {
    return (Side1 + Side2 + Side3);
    }
    
    //area of a triangle is .5(base * height)
    @Override 
    double getArea()
    {
    return .5 * Base * Height;
    }
    
}


class Sphere extends ThreeDimensionalShape{
    //private members for computation 
    private double Radius;
    
    //Overriding default constructor
    Sphere (double radius){
        Radius = radius;
    }
    
    
    //volume of a sphere is (4/3)*r^3
    @Override
    double getVolume()
    {
    return ((4) * Math.PI * (Radius * Radius * Radius))/3;
    }
    
    
    //Area of a sphere is 4 * pi * r^2 
    @Override 
    double getArea()
    {
    return 4 * Math.PI * (Radius * Radius);
    }
    
}



class Cube extends ThreeDimensionalShape{
    //declaring private members 
    private double Side;
    
    //overriding default constructor to take one argument
    Cube(double side){
        Side = side;
    }
    
    
    //volume of a cube is a^3 = a * a * a
    @Override
    double getVolume()
    {
    return Side * Side * Side;
    }
    
    
    //(surface) area of a cube is 6a^2  = 6 * a * a
    @Override 
    double getArea()
    {
    return 6 * Side * Side;
    }
    
}

class Tetrahedron extends ThreeDimensionalShape{
    //declare private memebers
    private double EdgeLength;
    
    //override default constructor
    Tetrahedron (double edgeLength)
    {
       EdgeLength = edgeLength;
    }
    
    //Volume of a tetrahedron is  (a^3 / 12) * sqrt(2)
    @Override
    double getVolume()
    {
    return (EdgeLength * EdgeLength * EdgeLength / 12) * Math.sqrt(2);
    }
    
    
    //Area of a tetrahedron is sqrt(3) * a^2
    @Override 
    double getArea()
    {
    return Math.sqrt(3) * (EdgeLength * EdgeLength);
    }
    
}


