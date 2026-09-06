/*
57. APPLICATION 1 - SHAPE MANAGEMENT
------------------------------------
Required filename: ShapeManagementApp.java
Purpose:
Build a shape-processing application where one Shape array processes several
shape types through abstract methods.
Common evidence required in every solution:
- An abstract Shape base class with at least one private common field.
- Abstract methods for area and perimeter.
- At least three concrete Shape subclasses selected by the student. Choices
    may include Circle, Rectangle, Square, Triangle, or another valid 2D shape.
- Positive dimensions protected by constructors or methods.
- Constructors that use super(...).
- Correct @Override implementations for area and perimeter.
- A Shape[] containing at least five mixed objects.
- One loop that displays every shape through Shape references.
- Calculation of total area through polymorphic calls.
- A useful toString() somewhere in the hierarchy.
Choose any two application features:
- calculate average area or total perimeter
- find the shape with the largest or smallest area
- count objects by runtime shape type
- search using a common String property such as color or label
- safely call a subtype-specific method using instanceof
- add a fourth shape type
Student design choices:
- the three or more concrete shape types
- the common field and additional fields
- dimension representation and validation approach
- which two features to implement
- helper methods, report organization, and displayed text
The marker will look for a meaningful abstract base class, correct formulas,
constructor chaining, at least three concrete implementations, a mixed Shape[]
and runtime dispatch. All students do not need to use Circle, Rectangle, and
Triangle together.


*/
public class Shape
{
    private String color;

    public Shape(String color)
    {
        this.color = color;
    }
    
    String GetColor()
    {
        return color;
    }
    
    double CalcArea(double side)
    {
        return side * side;
    }
    double CalcArea(double length ,double breadth)
    {
        return length * breadth;
    }
    double CalcPerimeter(double side)
    {
        return 4 * side;
    }

    double CalcPerimeter(double length, double breadth)
    {
        return 2 * (length + breadth);
    }
    
}
class Circle extends Shape
{
    private double radius;
    Circle(String color, double radius)
    {
        super(color);
        if (radius>0)
            {
                this.radius = radius;
            }
        else
            {
                this.radius = 1;
            }
    }
    @Override
    double CalcArea(double radius)
    {
        return 3.14 * radius * radius;
    }
    @Override
    double CalcPerimeter(double radius)
    {
        return 2 * 3.14 * radius;
    }

    void GetDetails() 
    {
        System.out.println("CIRCLE");
        System.out.println("Color:" + GetColor());
        System.out.println("Radius:" + radius);
        System.out.println("Area:" + CalcArea(radius));
        System.out.println("Perimeter:" + CalcPerimeter(radius));
    }
}

class Rectangle extends Shape
{
    private double length;
    private double breadth;
    Rectangle(String color, double length, double breadth)
    {
        super(color);
        if (length>0)
        {
            this.length = length;
        }
        else
        {
            this.length = 1.0;
        }
        if (breadth>0)
        {
            this.breadth = breadth;
        }
        else
        {
            this.breadth = 1.0;
        }
    }
    @Override
    double CalcArea(double length, double breadth)
    {
        return length * breadth;
    }
    @Override
    double CalcPerimeter(double length, double breadth)
    {
        return 2*(length + breadth);
    }

    void GetDetails()
    {
        System.out.println("RECTANGLE ");
        System.out.println("Color:" + GetColor());
        System.out.println("Length:" + length);
        System.out.println("Breadth:" + breadth);
        System.out.println("Area:" + CalcArea(length, breadth));
        System.out.println("Perimeter:" + CalcPerimeter(length, breadth));
    }
    
}

class Square extends Shape
{
    private double side;
    Square(String color, double side)
    {
        super(color);
        if ( side > 0)
        {
            this.side= side;
        }
        else{
            this.side = 1.0;
        }
    }
    @Override
    double CalcArea(double side)
    {
        return side*side;
    }
    @Override
    double CalcPerimeter(double side)
    {
        return 4*side;
    }

    void GetDetails() {

        System.out.println("SQUARE");
        System.out.println("Color:"+GetColor());
        System.out.println("Side:"+side);
        System.out.println("Area:"+CalcArea(side));
        System.out.println("Perimeter:" + CalcPerimeter(side));
    }
}