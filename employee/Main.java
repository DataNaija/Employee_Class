package employee;

public class Main {

    public static void main(String[] args) {
        Employee employA = new Employee("Muhydeen", 36,20000,"Chihuahua");
        Employee employB = new Employee("Adelani",40,50000,"Mexico");

        employA.raiseSalary();

        System.out.println(employA.salary);
        System.out.println(employB.salary);
    }
}
