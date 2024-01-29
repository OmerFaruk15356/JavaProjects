public class Giraffe extends Animal{

    public Giraffe(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The giraffe grunted: Grunt!");
    }
    
}
