package JavaSwingSimple;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formLogin extends JFrame{
    private JPanel panelMain;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JCheckBox male;
    private JCheckBox female;
    private JComboBox boxJob;
    private JTextField txtAddress;
    private JButton btQuit;
    private JButton btRegister;
    private JLabel txtError;
    private JPasswordField txtConfPassword;

    public formLogin() {
        super("Login");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        btRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtUsername.getText().isEmpty() || txtPassword.getPassword().length != 0 || txtConfPassword.getPassword().length != 0 ||!txtAddress.getText().isEmpty()) {
                    String username = txtUsername.getText();
                    String password = new String(txtPassword.getPassword());
                    String confPassword = new String(txtConfPassword.getPassword());

                    if (!password.equals(confPassword))
                        JOptionPane.showMessageDialog(null, "Mat khau xac nhan khong chinh xac");

                    boolean isMale = male.isSelected();
                    String address = txtAddress.getText();
                    String job = boxJob.getItemAt(boxJob.getSelectedIndex()).toString();
                    User user = new User(username, password, isMale, address, job);
                    Main.users.add(user);
                    System.out.printf(user.toString());
                    txtError.setText("Register successful");
                    resetForm();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Vui Long nhap du thong tin");
                }
            }
        });
    }

    private void resetForm() {
        this.txtUsername.setText("");
        this.txtPassword.setText("");
        this.txtConfPassword.setText("");
        this.txtAddress.setText("");
        this.boxJob.setSelectedIndex(0);
    }


}
