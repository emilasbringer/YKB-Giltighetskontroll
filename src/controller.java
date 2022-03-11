import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.util.Objects;


public class controller {
    private model model;
    private view view;

    public controller() {
        view = new view();
        model = new model();
        JFileChooser fileChooser = new JFileChooser();

        JScrollPane scroll = new JScrollPane(model.getList(), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        view.setScrollPane(scroll);

        JFrame frame = new JFrame("YKB Giltighetskontroll");
        frame.setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("logo.png"))).getImage());
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

        view.getLäggTillButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.getSparaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.showSaveDialog(null);
                String path = fileChooser.getSelectedFile().getAbsolutePath();
            }
        });

        view.getLaddaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.showOpenDialog(null);
                String path = fileChooser.getSelectedFile().getAbsolutePath();
                File myFile = new File(path+"/YKBFörare.txt");
            }
        });

    }

    public static void main(String[] args) {
        controller c = new controller();
    }
}
