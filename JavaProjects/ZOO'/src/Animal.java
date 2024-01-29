public abstract class Animal {
    protected String animalName;
    protected String species;
    protected int animalAge;

    public Animal(String name,String species,int age)
    {
        this.animalName = name;
        this.species = species;
        this.animalAge = age;
    }

    public abstract void makeSound();
}
