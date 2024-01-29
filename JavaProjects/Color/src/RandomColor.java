import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class RandomColor extends JPanel{

    boolean canChange = true;
    JButton button;
    JCheckBox checkBox;
    public Color _RandomColor()
    {
        int red = (int)(Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        return (new Color(red, green, blue));
    }
    public class MouseMotionListener extends MouseAdapter
    {
        @Override
        public void mouseMoved(MouseEvent e)
        {
            if(canChange && !checkBox.isSelected())
            setBackground(_RandomColor());
        }

    }

    public RandomColor()
    {
        setBackground(_RandomColor());
        addMouseMotionListener(new MouseMotionListener());
        checkBox = new JCheckBox();
        add(checkBox);
    }

    public static void main(String[] args) throws Exception {
        JFrame gui = new JFrame();
        gui.setTitle("Color");
        gui.setSize(300,300);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = gui.getContentPane();
        pane.setLayout(new GridLayout(5,5));
        for(int i = 1; i <= 25 ;i++)
        {
            RandomColor rc = new RandomColor();
            pane.add(rc);
        }
        gui.setVisible(true);

    }
}
