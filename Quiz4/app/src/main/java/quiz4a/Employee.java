package quiz4a;


// (1.1) เขียน Java Docs
/**
 * class Employee คลาสหลัก
 * ตัวแปร iD หนักงาน
 * ตัวแปรชื่อพนักงาน
 * ตัวแปรเงินเดือน
 */
public class Employee {
    private int employeeId; //
    private String name; //
    private double salary; //

    // (1.2) 
    /**
     * method ที่ใช่ในการสร้างข้อมูลพนักงาน
     * @param employeeId //ID พนักงาน
     * @param name //ชื่อพนักงาน
     * @param salary //เงินเดือนพนักงาน
     */
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary >= 0) ? salary : 0;
    }

    // (1.3)
    /**
     * การคำนวณเงินเดือน
     * @return ส่งออกเงินเดือน
     */
    public double calculateSalary() {
        return salary;
    }

    // (1.4)
    /**
     * 
     * @return ส่งออก ID พนักงาน
     */
    public int getEmployeeId() {
        return employeeId;
    }

    // (1.5)
    /**
     * 
     * @return ส่งออกชื่อพนักงาน
     */
    public String getName() {
        return name;
    }
}