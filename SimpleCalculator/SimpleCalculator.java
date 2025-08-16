package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {

    private JPanel calculator;
    private JTextField textField1;
    private JPanel screen;
    private JPanel buttonsPanel;
    private JButton zero;
    private JButton two;
    private JButton one;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton minusPlus;
    private JButton comma;
    private JButton equal;
    private JButton addition;
    private JButton subtraction;
    private JButton multiplication;
    private JButton deletion;
    private JButton division;
    private JButton clear;
    private JLabel label;
    private JButton mode;
    private double answer, number;
    private int operation;


    public SimpleCalculator() {
        add(calculator);





        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInput(e.getActionCommand());
            }
        });

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInput(e.getActionCommand());
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInput(e.getActionCommand());
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInput(e.getActionCommand());
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInput(e.getActionCommand());
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInput(e.getActionCommand());
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInput(e.getActionCommand());
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInput(e.getActionCommand());
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInput(e.getActionCommand());
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setInput(e.getActionCommand());
            }
        });



        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });



        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField1.getText());
                operation = 1;
                textField1.setText("");
                label.setText(number + e.getActionCommand());
            }
        });

        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField1.getText());
                operation = 2;
                textField1.setText("");
                label.setText(number + e.getActionCommand());
            }
        });

        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField1.getText());
                operation = 3;
                textField1.setText("");
                label.setText(number + e.getActionCommand());
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField1.getText());
                operation = 4;
                textField1.setText("");
                label.setText(number + e.getActionCommand());
            }
        });

        mode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(textField1.getText());
                operation = 5;
                textField1.setText("");
                label.setText(number + e.getActionCommand());
            }
        });



        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculation();
            }
        });



        deletion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                if (!text.isEmpty()) {
                    textField1.setText(text.substring(0, text.length() - 1));
                }
            }
        });



        minusPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();

                if (!text.isEmpty()) {
                    if (text.startsWith("-")) {
                        textField1.setText(text.substring(1));
                    } else {
                        textField1.setText("-" + text);
                    }
                }
            }
        });


    }





    public void setInput (String input) {
        textField1.setText(textField1.getText() + input);
    }


    public void calculation() {
        switch (operation) {
            case 1:
                answer = number + Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(answer));
                break;
                case 2:
                    answer = number - Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(answer));
                    break;
                    case 3:
                        answer = number * Double.parseDouble(textField1.getText());
                        textField1.setText(Double.toString(answer));
                        break;
                        case 4:
                            answer = number / Double.parseDouble(textField1.getText());
                            textField1.setText(Double.toString(answer));
                            break;
                            case 5:
                                answer = number % Double.parseDouble(textField1.getText());
                                textField1.setText(Double.toString(answer));
                                break;
        }
    }
}
