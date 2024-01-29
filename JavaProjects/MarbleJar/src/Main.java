public class Main {
    public static void main(String[] args) throws Exception {
        Jar jar = new Jar();
        
        jar.AddMarble(8);

        jar.isLidOpen = true;
        jar.AddMarble(8);
        jar.AddMarble(3);


        jar.isLidOpen = false;
        jar.TakeOutMarble(8);


        jar.isLidOpen = true;
        jar.TakeOutMarble(7);
        jar.TakeOutMarble(4);
    }
}
