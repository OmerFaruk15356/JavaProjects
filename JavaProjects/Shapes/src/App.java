public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(5);
        Prisma prisma = new Prisma(2, 5, 7);
        Cube cube = new Cube(6);
        System.out.println(rectangle.calculateArea() + "," + rectangle.calculateCircumference());
        System.out.println(square.calculateArea() + "," + square.calculateCircumference());
        System.out.println(prisma.calculateArea() + "," + prisma.calculateCircumference() + "," + prisma.calculateVolume()); 
        System.out.println(cube.calculateArea() + "," + cube.calculateCircumference() + "," + cube.calculateVolume());           
    }
}

