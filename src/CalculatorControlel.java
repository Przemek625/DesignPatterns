import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Przemek on 2016-04-25.
 */
public class CalculatorControlel {

    private CalculatorView view;
    private CalculatorModel model;

    CalculatorControlel(CalculatorView view, CalculatorModel model)
    {
        this.view=view;
        this.model=model;

        this.view.addCalculationListiner(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                view.setCalculationValue(
                        (model.addNumbers(view.getFirstNumber(),view.getSecondNumnber()))

                      );
            }
        });
    }
}
