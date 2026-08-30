/*
62. TASK 3 - RECTANGLE MODEL
Required filename: RectangleModel.java
Create a Rectangle class and a public RectangleModel driver.
Requirements:
- private double width and height
- no-argument constructor creating a 1 by 1 rectangle
- one-argument constructor creating a square
- two-argument constructor creating a rectangle
- use this(...) constructor chaining
- positive dimensions only
- getArea(), getPerimeter(), isSquare(), and scale(double factor)
- overloaded area methods only if their responsibilities are clearly stated
- useful toString()
Trace the constructor call order for all three construction forms.


*/
public class Rectangle
{
    private double width;
    private double height;
    public Rectangle()
    {
        width =1;
        height= 1;
    }
    public Rectangle(double side)
    {
        width = side;
        height = side;
    }

    public Rectangle(double width, double height)
    {
        if (width > 0 && height > 0)
            {
                this.width = width;
                this.height = height;
        }
        else
            {
            this.width = 1;
            this.height = 1;
        }
    }
    public double getArea()
    {
        return width* height;
    }

    public double getPerimeter()
    {
        return 2*(width + height);
    }

    public boolean isSquare(){
        return width == height;
    }

    public void scale(double factor)
    {
        if (factor > 0) {
            width = width * factor;
            height = height * factor;
        }
    }

    public String toString() {
        return "Rectangle= " + width + " x= " + height+ ", Area= " + getArea()+ ", Perimeter= " + getPerimeter();
    }
}