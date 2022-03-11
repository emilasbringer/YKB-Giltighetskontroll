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
    private JButton redigeraFöretagButton;


    public JPanel getPanel() {
        return panel;
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

    public JButton getLäggTillButton() {return läggTillButton;}

    public JButton getLaddaButton() {
        return laddaButton;
    }

    public JButton getSparaButton() {
        return sparaButton;
    }

    public JButton getYKBDatumButton() {return YKBDatumButton;}

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
