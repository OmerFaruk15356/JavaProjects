import javax.swing.*;
import javax.swing.text.PlainDocument;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gui extends JFrame{
    private JButton btnHigh,buttonLow,buttonEqual;
    private JLabel lbl;
    private JTextField textField;
    Random random = new Random();
    int upperBound = 100,lowerBound = 0;
    int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    int count = 0;

    public class Higher implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            lowerBound = randomNumber + 1;
            randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            textField.setText(String.valueOf(randomNumber));
            count++;
        }
    }
    public class Lower implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            upperBound = randomNumber - 1;
            randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            textField.setText(String.valueOf(randomNumber));
            count++;
        }
    }
    public class Equal implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            lbl.setText("It finded " + count + " attempt.");
            btnHigh.setEnabled(false);
            buttonLow.setEnabled(false);
            buttonEqual.setEnabled(false);
        }
    }

    public Gui()
    {
        setLayout(new FlowLayout());
        textField = new JTextField(10);
        lbl = new JLabel("Competer predict the number.");
        btnHigh = new JButton("Higher");
        buttonLow = new JButton("Lower");
        buttonEqual = new JButton("Correct");
        textField.setText(String.valueOf(randomNumber));
        btnHigh.addActionListener(new Higher());
        buttonLow.addActionListener(new Lower());
        buttonEqual.addActionListener(new Equal());

        add(lbl);
        add(textField);
        add(btnHigh);
        add(buttonLow);
        add(buttonEqual);
    }

    public static void main(String[] args) throws Exception {
        Gui gui = new Gui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300,300);
        gui.setVisible(true);
        gui.setTitle("Title");
    }
}
