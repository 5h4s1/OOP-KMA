package De2;

public class Employee extends Person{
    private String department;
    private int coefficientsSalary;
    private int seniority;
    private int baseSalary;


    public Employee(String name, String dateOfBirth, String address, String gender, String department, int coefficientsSalary, int seniority, int baseSalary) {
        super(name, dateOfBirth, address, gender);
        this.department = department;
        this.coefficientsSalary = coefficientsSalary;
        this.seniority = seniority;
        this.baseSalary = baseSalary;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(int coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float getSalary() {
        float coefficients = coefficientsSalary* (1 + (float)seniority / 100);
        return baseSalary * coefficients;
    }

    public void show() {
        super.show();
        System.out.println("Department: " + department);
        System.out.println("Coefficients Salary: " + coefficientsSalary);
        System.out.println("Seniority: " + seniority);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Salary: " + getSalary());
    }
}
