import javax.swing.*;
import java.awt.*;


public class controller {
    private model model;
    private view view;

    public controller() {
        view = new view();
        model = new model();

        JScrollPane scroll = new JScrollPane(model.getList(), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        view.setScrollPane(scroll);
        JFrame frame = new JFrame("YKB Giltighetskontroll");
        frame.add(view.getControllPane(), BorderLayout.PAGE_START);
        frame.add(view.getScrollPane(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1300, 500);

        model.getList().setBackground(Color.GRAY);
    }

    public static void main(String[] args) {
        controller c = new controller();
    }
}
