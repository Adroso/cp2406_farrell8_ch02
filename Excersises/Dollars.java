import javax.swing.*;

/**
 * Created by Adroso360 on 8/08/2016.
 */
public class Dollars {
    public static void main(String[] args) {
        int inputDollars = Integer.parseInt(JOptionPane.showInputDialog(null, " Dollars"));

        int dollar = inputDollars;

        int dollar20 = (inputDollars/20);
        inputDollars = inputDollars % 20;
        int dollar10 = (inputDollars/10);
        inputDollars = inputDollars % 10;
        int dollar5 = (inputDollars/5);
        inputDollars = inputDollars % 5;
        int dollar1 = (inputDollars/1);

        System.out.println("20's >>>" + dollar20 + "  10's>>>" + dollar10 + "  5's>>>>" + dollar5 + "  1's>>>" +dollar1);






    }
}
