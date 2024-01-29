public class Rectangle {
    double lLenght,sLenght,area,circumference;

    public Rectangle(double lLenght,double sLenght)
    {
        this.lLenght = lLenght;
        this.sLenght = sLenght;
    }
    public double calculateArea()
    {
        return lLenght * sLenght;
    }

    public double calculateCircumference()
    {
        return 2 * (lLenght + sLenght);
    }

}
