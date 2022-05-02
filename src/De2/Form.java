package De2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Form extends JFrame{
    private JPanel mainPanel;
    private JTextField textName;
    private JTextField textDOB;
    private JTextField textAddress;
    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton other;
    private JComboBox boxDepartment;
    private JTextField textCoefficientSalary;
    private JTextField textSeniority;
    private JTextField textBaseSalary;
    private JButton addEmployeeButton;
    private JButton saveListButton;
    private final List<Employee> employeeList;

    public Form() {
        super("Manager Employee");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.employeeList = new ArrayList<>();
        addEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textName.getText();
                String dateOfBirth = textDOB.getText();
                String address = textAddress.getText();
                int coefficientsSalary = Integer.parseInt(textCoefficientSalary.getText());
                int seniority = Integer.parseInt(textSeniority.getText());
                int baseSalary = Integer.parseInt(textBaseSalary.getText());
                String gender = "";
                if (male.isSelected())
                {
                    gender = "Male";
                } else if (female.isSelected())
                {
                    gender = "Female";
                }else
                {
                    gender = "Other";
                }
                String department = boxDepartment.getItemAt(boxDepartment.getSelectedIndex()).toString();
                Employee employee = new Employee(name, dateOfBirth, address, gender, department, coefficientsSalary, seniority, baseSalary);
                addEmployee(employee);
                employee.show();
            }
        });
        saveListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String filename = "./src/De2/employee.dat";
                    FileWriter fw = new FileWriter(filename, false);
                    PrintWriter pw = new PrintWriter(fw);
                    for (Employee employee : employeeList) {
                        pw.write("\t\t" + employee.getName());
                        pw.write("\t\t" + employee.getDateOfBirth());
                        pw.write("\t\t" + employee.getAddress());
                        pw.write("\t\t" + employee.getGender());
                        pw.write("\t\t" + employee.getDepartment());
                        pw.write("\t\t" + employee.getCoefficientsSalary());
                        pw.write("\t\t" + employee.getSeniority());
                        pw.write("\t\t" + employee.getBaseSalary());
                        pw.write("\t\t" + employee.getSalary());
                        pw.println();
                    }
                    pw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(null, "Save List Successful");

                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Save List Fal");
                }
            }
        });
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }
}
