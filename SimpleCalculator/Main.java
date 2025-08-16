package SimpleCalculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimpleCalculator sCalculator = new SimpleCalculator();
                sCalculator.setSize(400, 600);
                sCalculator.setVisible(true);
                sCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sCalculator.setResizable(false);
            }
        });




    }
}
