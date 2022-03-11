import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class model {
    private ArrayList<person> personArrayList;
    private JList list;
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private Font listFont = new Font("Helvetica", Font.BOLD, 15);
    private person tempPerson;

    public model() {
        personArrayList = new ArrayList<>();
        for (int i = 0; i < 600; i++) {
            addPersonToArrayList("Person" + i, "070" + randomNumber(100000,999999),"Företag" + randomNumber(1,5),"54 243 423", randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28), randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28),randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28),randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28),randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28),randomNumber(2017, 2022) +"-0"+randomNumber(1,9)+"-"+randomNumber(10,28));
        }
        initizializeViewList();
    }

    public void addPersonToArrayList(String name, String personalNumber, String company, String companyNumber, String YKBDate, String course1Date, String course2date, String course3Date, String course4Date, String course5Date) {
        personArrayList.add(new person(name,personalNumber,company,companyNumber,YKBDate,course1Date,course2date,course3Date,course4Date,course5Date));
    }

    public void initizializeViewList() {
        for (person person : personArrayList) {
            listModel.addElement(person.listToString());
        }
        list = new JList(listModel);
        list.setFixedCellWidth(40);
        list.setFixedCellHeight(40);
        list.setFont(listFont);
        list.setSelectionBackground(Color.GRAY);
    }

    public void updateViewList() {
        clearListModel();
        for (person person : personArrayList) {
            listModel.addElement(person.listToString());
        }
    }

    public void sortArrayByYKBDate() {
        for (int i = 1; i < personArrayList.size(); i++) {
            int key = i;
            //System.out.println(j);
            while(getDateInEpoch(personArrayList.get(key).getYKBDate()) <  getDateInEpoch(personArrayList.get(key-1).getYKBDate())) {
                //System.out.println("Date " + personArrayList.get(key).getYKBDate() + " was smaller than previous date " + personArrayList.get(key-1).getYKBDate() + " so moving up once");
                tempPerson = personArrayList.get(key-1);
                personArrayList.set(key-1, personArrayList.get(key));
                personArrayList.set(key, tempPerson);
                if (key > 1) {key--;}
            }
        }
        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println(personArrayList.get(i).getYKBDate());
        }
        //updateViewList();
    }

    public void clearListModel() {
        listModel.clear();
    }

    public JList getList() {
        return list;
    }

    public int randomNumber(int min, int max) {
        return (int) Math.floor(Math.random()*((max+1)-min)+min);
    }

    public long getDateInEpoch(String string) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {date = df.parse(string);} catch (ParseException e) {e.printStackTrace();}
        long epoch = date.getTime();
        return epoch;
    }
}
