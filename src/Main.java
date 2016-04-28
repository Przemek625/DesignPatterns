import javax.swing.*;
import java.awt.*;

/**
 * Created by Przemek on 2016-04-25.
 */
public class Main{

    public static void main(String[] args) {



        EventQueue.invokeLater(new Runnable() {
            public void run() {

                CalculatorModel model= new CalculatorModel();
                CalculatorView view  = new CalculatorView();
                CalculatorControlel controlel = new CalculatorControlel(view,model);

                JFrame frame = new JFrame();
                frame.add(view);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setTitle("Wizard for PGS Software");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.pack();

            }
        });
    }
}
