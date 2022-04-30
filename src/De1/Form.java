package De1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Form extends JFrame{
    private JPanel panelMain;
    private JTextField textId;
    private JTextField textName;
    private JTextField textDob;
    private JTextField textAddress;
    private JTextField textEmail;
    private JTextField textGpa;
    private JRadioButton rbtMale;
    private JRadioButton rbtFemale;
    private JRadioButton rbtOther;
    private JButton addStudent;
    private JButton saveData;

    private List<Student> personList;
    public Form() {
        super("Manager Student");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.personList = new ArrayList<>();
        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textName.getText();
                String dateOfBirth = textDob.getText();
                String address = textAddress.getText();
                String id = textId.getText();
                String email = textEmail.getText();
                float gpa = Float.parseFloat(textGpa.getText());
                String gender = "";
                if (rbtMale.isSelected()) {
                    gender = "Male";
                } else if (rbtFemale.isSelected()) {
                    gender = "Female";
                } else {
                    gender = "Other";
                }
                Student person = new Student(name, dateOfBirth, address, gender, id, email, gpa);
                personList.add(person);
                person.show();
            }
        });

        saveData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String fileName = "./src/De1/sinhvien.dat";
                    FileWriter jw = new FileWriter(fileName, false);
                    PrintWriter bw = new PrintWriter(jw);
                    for (Student st : personList) {
                        System.out.println(st);
                        bw.write(st.getName() + "\t");
                        bw.write(st.getDateOfBirth() + "\t");
                        bw.write(st.getAddress() + "\t");
                        bw.write(st.getGender() + "\t");
                        bw.write(st.getId() + "\t");
                        bw.write(st.getEmail() + "\t");
                        bw.write(Float.toString(st.getGpa()));
                        bw.println();
                    }
                    JOptionPane.showMessageDialog(null, "Lưu thành công");
                    bw.close();
                    bw.close();
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        });
    }
}
