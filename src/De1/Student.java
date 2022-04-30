package De1;

public class Student extends Person {
    private String id;
    private String email;
    private float gpa;

    public Student(String name, String dateOfBirth, String address, String gender, String id, String email, float gpa) {
        super(name, dateOfBirth, address, gender);
        this.id = id;
        this.email = email;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


    public void show() {
        super.show();
        System.out.println("Id: " + id);
        System.out.println("Email: " + email);
        System.out.println("Gpa: " + Float.toString(gpa));
    }
}
