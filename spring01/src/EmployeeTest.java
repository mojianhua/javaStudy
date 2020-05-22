import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setName("J1");
        employee.setSalary(100);
        employee.setBirthday(new Date());

        Manager manager = new Manager();
        manager.setName("j2");
        manager.setSalary(200);
        manager.setBirthday(new Date());
        manager.setBonus(200);

        System.out.println("员工工资 :" + employee.getName());
        System.out.println("员工工资 :" + manager.getName());
    }
}
