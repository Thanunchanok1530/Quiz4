package quiz4a;

// 2.1
/**
 * การขยายข้อมูลของ class Employee ไปยัง class Manager 
 * เพิ่ม ตัวแปรแผนกของพนักงาน
 * ตัวแปรโบนัส
 */
public class Manager extends Employee {
    private String department;
    private double bonus;
    private boolean Bonuss;

    
    // 2.2
    /**
     * method ข้อมูลของผู้จัดการ
     * @param employeeId ID พนักงาน
     * @param name ชื่อพนักงาน
     * @param salary เงินเดือน
     * @param department แผนกของพนักงาน
     * @param bonus โบนัส
     */
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    public double getbonus(){
        return getbonus();
    }

@Override
    public double abonus (int bonus ) {
        if (bonus <= getbonus()) {
            double finalBouns = Salary() * 0.2; // เพิ่มชาร์จ 10% ของราคาหนังสือ
        return finalBouns;
}
    // 2.3
    /**
     * การทำงานของรายละเอียด 
     * โดยรายละเอียดจะส่งออกมาเป็น ID พนักงาน , ชื่อพนักงาน , เงินเดือน , แผนกของพนักงาน , โบนัส
     * จะแสดงผลออกมาเป็นพวกรายละเอียดด้านบน 
     */
    public void displayDetails() {
        String[] details = {
            "Employee ID: " + getEmployeeId(),
            "Name: " + getName(),
            "Salary: " + calculateSalary(),
            "Department: " + department,
            "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    //2.4
/**
 * 
 * @param condition หากตรวจสอบเงื่อนไขแล้วขึ้น "full" 
 * จะแสดงผลรายละเอียดออกมาเป็น ID พนักงาน , ชื่อพนักงาน , เงินเดือน , แผนกของพนักงาน , โบนัส 
 * หากไม่ขึ้น "full" จะแสดงผลรายละเอียดแค่ID พนักงานและชื่อพนักงาน
 */
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {
            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}
