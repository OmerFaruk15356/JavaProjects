import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gui extends JFrame{
    private JButton btn;
    private JLabel lbl;
    private JTextField textField;
    Random random = new Random();
    int randomNumber = random.nextInt(100);
    int count = 0;

    public class pressButton implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try {
                String text = (String)textField.getText();
                int number = Integer.parseInt(text);  
                PredictNumber(number); 
            } 
            catch (NumberFormatException ex) {
                lbl.setText("Please enter valid number");
            }
        }
    }

    public Gui()
    {
        setLayout(new FlowLayout());
        btn = new JButton("Button");
        lbl = new JLabel("Please Enter your predict.");
        textField = new JTextField(15);
        btn.addActionListener(new pressButton());
        add(lbl);
        add(textField);
        add(btn);
    }

    public void PredictNumber(int number)
    {

        if(number < randomNumber)
        {
            lbl.setText("Answer is higher");
            count++;
        }
        else if(number > randomNumber)
        {
            lbl.setText("Answer is lower");
            count++;
        }
        else if(number == randomNumber)
        {
            lbl.setText("You find answer " + count + ". attempt");
            btn.setEnabled(false);
        }
    }
    

    public static void main(String[] args) throws Exception {
        Gui gui = new Gui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300,300);
        gui.setVisible(true);
        gui.setTitle("Title");
    }
}
