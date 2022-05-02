package JavaSwingSimple;

public class User {
    private String username;
    private String password;
    private boolean isMale;
    private String address;
    private String job;

    public User(String username, String password, boolean isMale, String address, String job) {
        this.username = username;
        this.password = password;
        this.isMale = isMale;
        this.address = address;
        this.job = job;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "\nUsername: " + username
                +"\nPassword: " + password
                + "\nisMale: " + isMale
                + "\nAddress: " + address
                + "\nJob: " + job;
    }
}
