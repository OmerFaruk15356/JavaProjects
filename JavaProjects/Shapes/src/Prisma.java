public class Prisma extends Rectangle{
    double height;
    public Prisma (double sLenght,double lLenght, double height)
    {
        super(lLenght, sLenght);
        this.height = height;
    }

    @Override
    public double calculateArea()
    {
        return 2 * (lLenght * height + lLenght * sLenght + sLenght * height);
    }

    @Override
    public double calculateCircumference()
    {
        return 4 * (lLenght + sLenght + height);
    }

    public double calculateVolume()
    {
        return lLenght * sLenght * height;
    }
}
