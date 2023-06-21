public class Application {
    public static void main(String[] args) {

        Employee employee1;

        employee1 = new Employee();
        employee1.setFirstName("Lawrence");
        employee1.setLastName("Caudle");
        employee1.setPosition("The Boss");
        employee1.work(27);
        employee1.setSalary(20.00);
        System.out.println(employee1.displayPayCheck());

        System.out.println();
        employee1.clearHoursWorked();
        System.out.println(employee1);
    }
}