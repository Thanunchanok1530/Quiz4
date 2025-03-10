/*
 * This source file was generated by the Gradle 'init' task
 */
package quiz4a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AppTest {


    //ตัวอย่าง 1 ให้สร้าง Employee Employee(1, "John Doe", 50000) และตรวจสอบว่าเงินเดือน เป็น 50000
    @Test void createEmployee() {
        Employee Employee = new Employee(1, "John Doe", 50000);
        assertEquals("John Doe", Employee.getName());
        assertEquals(1, Employee.getEmployeeId());
        assertEquals(50000, Employee.calculateSalary());
    }

    //ข้อ 2 ตรวจสอบว่า Salary ตั้งให้ติดลบไม่ได้
    @Test void SalaryCannotBeNegative() {
        Employee and = new Employee(1, "John Doe", 50000);
        assertEquals(0, and.salary);

    }

    //ข้อ 3 ตรวจสอบว่า Bonus เป็น 20% ของ เงินเดือน(Salary)
    //ต้องมีการแก้ไข code ใน Manager.java ให้ถูกต้อง
    @Test void Bonus20() {
        Manager a = new Manager(1, "John Doe", 5000, "Directors", 20);
        

    }
}