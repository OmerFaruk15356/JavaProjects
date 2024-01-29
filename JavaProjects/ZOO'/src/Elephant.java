public class Elephant extends Animal{

    public Elephant(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The elephant trumpeted: Trumpet!");
    }
    
}
