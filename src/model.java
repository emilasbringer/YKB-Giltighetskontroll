import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class model {
    private ArrayList<person> personArrayList;
    private JList list;
    private DefaultListModel<String> listModel;
    private DefaultListModel<String> sortedListModel;
    private Font listFont = new Font("Helvetica", Font.BOLD, 15);

    public model() {
        personArrayList = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            addPersonToArrayList("Person" + i, "070" + randomNumber(100000,999999),"Företag" + randomNumber(1,5),"54 243 423", randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28), randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28),randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28),randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28),randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28),randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28));
        }

        updateViewList();
    }

    public void addPersonToArrayList(String name, String personalNumber, String company, String companyNumber, String YKBDate, String course1Date, String course2date, String course3Date, String course4Date, String course5Date) {
        personArrayList.add(new person(name,personalNumber,company,companyNumber,YKBDate,course1Date,course2date,course3Date,course4Date,course5Date));
    }

    public void updateViewList() {
        listModel = new DefaultListModel();
        for (person person : personArrayList) {
            listModel.addElement(person.listToString());
        }
        list = new JList(listModel);
        list.setFixedCellWidth(40);
        list.setFixedCellHeight(40);
        list.setFont(listFont);
    }

    public void sortArrayByYKBDate() {
        listModel = new DefaultListModel();
        for (person person : personArrayList) {
            listModel.addElement(person.listToString());
        }
        list = new JList(listModel);
        list.setFixedCellWidth(40);
        list.setFixedCellHeight(40);
        list.setFont(listFont);
    }

    public JList getList() {
        return list;
    }

    public int randomNumber(int min, int max) {
        return (int) Math.floor(Math.random()*((max+1)-min)+min);
    }
}
