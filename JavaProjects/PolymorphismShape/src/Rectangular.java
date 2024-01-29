public class Rectangular extends Shape{

    double lLenght;
    double sLenght;
    public Rectangular(double lLenght,double sLenght)
    {
        this.lLenght = lLenght;
        this.sLenght = sLenght;
    }
    @Override
    public void Area() 
    {
        double area = lLenght * sLenght;
        System.out.println("Area of Rectangular is " + area);
    }
    
}
