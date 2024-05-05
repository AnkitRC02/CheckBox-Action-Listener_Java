import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxActionListenerExample_exp9 extends JFrame {

    public CheckBoxActionListenerExample_exp9() {
        setTitle("CheckBox with ActionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create check boxes
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");
        JCheckBox checkBox4 = new JCheckBox("Option 4");
        JCheckBox checkBox5 = new JCheckBox("Option 5");

        // Create a label to display the selected options
        JLabel resultLabel = new JLabel("Selected options: None");

        // Create a panel and add components to it
        JPanel panel = new JPanel(new GridLayout(6, 1));
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(checkBox4);
        panel.add(checkBox5);
        panel.add(resultLabel);

        // Add an item listener to the check boxes
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String selectedOptions = "";
                if (checkBox1.isSelected()) {
                    selectedOptions += "Option 1 ";
                }
                if (checkBox2.isSelected()) {
                    selectedOptions += "Option 2 ";
                }
                if (checkBox3.isSelected()) {
                    selectedOptions += "Option 3 ";
                }
                if (checkBox4.isSelected()) {
                    selectedOptions += "Option 4 ";
                }
                if (checkBox5.isSelected()) {
                    selectedOptions += "Option 5 ";
                }
                resultLabel.setText("Selected options: " + (selectedOptions.isEmpty() ? "None" : selectedOptions));
            }
        };

        checkBox1.addItemListener(itemListener);
        checkBox2.addItemListener(itemListener);
        checkBox3.addItemListener(itemListener);
        checkBox4.addItemListener(itemListener);
        checkBox5.addItemListener(itemListener);

        // Add the panel to the frame
        add(panel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CheckBoxActionListenerExample_exp9::new);
    }
}
