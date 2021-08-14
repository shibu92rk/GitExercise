import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Fri Aug 13 16:26:10 PDT 2021
 */



/**
 * @author unknown
 */
public class CompoundInterest extends JFrame {
    public CompoundInterest() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        textField1 = new JTextField();
        textArea1 = new JTextArea();
        textArea2 = new JTextArea();
        textField2 = new JTextField();
        textArea3 = new JTextArea();
        textField3 = new JTextField();
        textArea4 = new JTextArea();
        textField4 = new JTextField();
        textArea5 = new JTextArea();
        textField5 = new JTextField();
        comboBox1 = new JComboBox();
        table1 = new JTable();

        //======== this ========
        setTitle("Compund Interest");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- textField1 ----
        textField1.setText("Enter the customer number");
        contentPane.add(textField1, "cell 0 0");
        contentPane.add(textArea1, "cell 1 0 2 1");
        contentPane.add(textArea2, "cell 3 0");

        //---- textField2 ----
        textField2.setText("Enter the customer name");
        contentPane.add(textField2, "cell 0 1");
        contentPane.add(textArea3, "cell 3 1");

        //---- textField3 ----
        textField3.setText("Enter the initial deposit");
        contentPane.add(textField3, "cell 0 2");
        contentPane.add(textArea4, "cell 3 2");

        //---- textField4 ----
        textField4.setText("Enter the number of years");
        contentPane.add(textField4, "cell 0 3");
        contentPane.add(textArea5, "cell 3 3");

        //---- textField5 ----
        textField5.setText("Choose the type of savings");
        contentPane.add(textField5, "cell 0 4");
        contentPane.add(comboBox1, "cell 3 4");
        contentPane.add(table1, "cell 0 5");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextField textField1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextField textField2;
    private JTextArea textArea3;
    private JTextField textField3;
    private JTextArea textArea4;
    private JTextField textField4;
    private JTextArea textArea5;
    private JTextField textField5;
    private JComboBox comboBox1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
