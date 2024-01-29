public class Triangle extends Shape{
    
    double base;
    double height;
    public Triangle(double base,double height)
    {
        this.base = base;
        this.height = height;
    }
    @Override
    public void Area() 
    {
        double area = (base * height) / 2 ;
        System.out.println("Area of Triangle is " + area);
    }
}
