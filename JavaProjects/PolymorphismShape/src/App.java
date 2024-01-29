public class App {
    public static void main(String[] args) throws Exception {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.14, 4);
        shapes[1] = new Rectangular(5, 6);
        shapes[2] = new Triangle(12, 4);

        for(Shape shape : shapes)
        {
            shape.Area();
        }
    }
}
