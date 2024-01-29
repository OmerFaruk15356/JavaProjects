public class Circle extends Shape{

    double pi;
    double radius;
    public Circle(double pi,double radius)
    {
        this.pi = pi;
        this.radius = radius;
    }
    @Override
    public void Area() 
    {
        double area = pi * Math.pow(radius, 2);
        System.out.println("Area of Circular is " + area);
    }
}
