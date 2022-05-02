package JavaSwingSimple;

import java.util.ArrayList;

public class Main {
    public static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        formLogin formlogin = new formLogin();
        formlogin.setVisible(true);
    }
}
