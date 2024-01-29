public class Penguin extends Animal{

    public Penguin(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The penguin honked: Honk!");
    }
    
}
