import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Przemek on 2016-04-25.
 */
public class CalculatorView extends JPanel {

    private JButton calculateButton;
    private JTextField field1,field2,result;
    private JLabel plusLabel;

    CalculatorView()
    {
        field1=new JTextField(5);
        add(field1);

        plusLabel=new JLabel("+");
        add(plusLabel);

        field2=new JTextField(5);
        add(field2);

        calculateButton=new JButton("Calculate");
        add(calculateButton);

        result= new JTextField(5);
        result.setEditable(false);
        add(result);
    }

    public int getFirstNumber()
    {
        return Integer.parseInt(field1.getText());
    }

    public int getSecondNumnber()
    {
       return Integer.parseInt(field2.getText());
    }

    public void setCalculationValue(int value)
    {
        this.result.setText(Integer.toString(value));
    }

    public void addCalculationListiner(ActionListener listener)
    {
        this.calculateButton.addActionListener(listener);
    }
}
