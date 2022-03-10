import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;


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
        frame.setSize(1600, 500);

        view.getYKBDatumButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.sortArrayByYKBDate();
                model.updateViewList();
            }
        });
    }

    public static void main(String[] args) {
        controller c = new controller();
    }
}
