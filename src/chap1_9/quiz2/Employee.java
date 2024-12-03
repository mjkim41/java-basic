package chap1_9.quiz2;

import java.util.UUID;

public class Employee {

    private static int idCounter;
    private String employeeId;
    private String name;

    public Employee(String name) {
        this.employeeId = UUID.randomUUID().toString();
        this.name = name;
        idCounter++;
    }

    public void getEmployeeInfo() {
        System.out.printf("직원 ID : %s\n", employeeId);
        System.out.printf("직원 이름 : %s\n", name);
    }

    public static int getIdCounter() {
        return idCounter;
    }


}
