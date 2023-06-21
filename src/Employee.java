public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private double salary;
    private double hoursWorked;

    public Employee() {}
    public Employee(String fn, String ln, String pos, double s) {
        firstName = fn;
        lastName = ln;
        position = pos;
        salary = s;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (!(salary >= 8.25)) {
            salary = 8.25;
        }
        this.salary = salary;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void work(double hours) {
        if (hours <= 0) {
            hoursWorked = 0;
        } else {
            hoursWorked = hours;
        }
    }

    public void clearHoursWorked() {
        hoursWorked = 0.00;
    }

    public double showCurrentPay() {
        double basePay;
        double overtimePay;
        double overtimeRate;
        double overtimeHours;

        if (hoursWorked > 40) {
            basePay = 40 * getSalary();
            overtimeRate = getSalary() * 1.5;
            overtimeHours = hoursWorked - 40;
            overtimePay = overtimeRate * overtimeHours;
            return basePay + overtimePay;

        } else {
            basePay = hoursWorked * getSalary();
        }
        return basePay;
    }

    public String displayPayCheck() {
        String str;
        str = "====== " + getFirstName() + " "
                + getLastName() + " ======" + "\n"
                + "Hours Worked: " + getHoursWorked() + "\n"
                + "Salary: " + getSalary() + "/hr" + "\n"
                + "Total Pay: " + (showCurrentPay());
        return str;
    }

    public String toString() {
        String str;
        str = "firstName: " + getFirstName() + ", "
                + "lastName: " + getLastName() + ", "
                + "position: " + getPosition() + ", "
                + "salary: " + getSalary() + ", "
                + "hoursWorked: " + getHoursWorked();
        return str;
    }
}
