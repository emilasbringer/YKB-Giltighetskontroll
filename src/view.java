import javax.swing.*;

public class view {
    private JTextField namnTextField;
    private JComboBox comboBox;
    private JPanel panel;
    private JButton läggTillButton;
    private JCheckBox giltigYKBCheckBox;
    private JScrollPane scrollPane;
    private JPanel controllPane;
    private JButton sparaButton;
    private JButton laddaButton;
    private JTextField personTelTextField;
    private JTextField företagTelTextField;
    private JButton YKBDatumButton;


    public JPanel getPanel() {
        return panel;
    }
    public JButton getLäggTillButton() {
        return läggTillButton;
    }
    public JCheckBox getGiltigYKBCheckBox() {
        return giltigYKBCheckBox;
    }
    public JComboBox getComboBox() {
        return comboBox;
    }
    public JTextField getNamnTextField() {
        return namnTextField;
    }


    public JButton getYKBDatumButton() {
        return YKBDatumButton;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public JPanel getControllPane() {
        return controllPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }
}
