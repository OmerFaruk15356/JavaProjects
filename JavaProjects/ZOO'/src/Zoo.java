public class Zoo {
    public static void main(String[] args) throws Exception {
        Lion lion = new Lion("Alex", "AsainLion", 12);
        Elephant elephant = new Elephant("Steve", "AfricanElephant", 4);
        Giraffe giraffe = new Giraffe("Susie", "SouthernGiraffe", 8);
        Penguin penguin = new Penguin("Sam","AntarcticEmperorPenguin", 2);

        CalculateAvarageAge(lion,elephant,giraffe,penguin);
        Display(lion, elephant, giraffe, penguin);
    }
    public static void CalculateAvarageAge(Lion lion,Elephant elephant,Giraffe giraffe,Penguin penguin)
    {
        double avarageAge = (lion.animalAge + elephant.animalAge + giraffe.animalAge + penguin.animalAge) / 4;
        System.out.println("Avarage age all animals is " + avarageAge);
    }
    public static void Display(Lion lion,Elephant elephant,Giraffe giraffe,Penguin penguin)
    {
        System.out.printf("Lion %s is a %s. It is %d years old.\n",lion.animalName,lion.species,lion.animalAge);
        lion.makeSound();
        System.out.printf("Elephant %s is a %s. It is %d years old.\n",elephant.animalName,elephant.species,elephant.animalAge);
        elephant.makeSound();
        System.out.printf("Giraffe %s is a %s. It is %d years old.\n",giraffe.animalName,giraffe.species,giraffe.animalAge);
        giraffe.makeSound();
        System.out.printf("Penguin %s is a %s. It is %d years old.\n",penguin.animalName,penguin.species,penguin.animalAge);
        penguin.makeSound();
    }

}
