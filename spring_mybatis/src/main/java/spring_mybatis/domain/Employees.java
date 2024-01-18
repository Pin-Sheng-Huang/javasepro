package spring_mybatis.src.main.java.spring_mybatis.domain;

import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-07-11 19:05
 * @LastEditTime: 2023-07-11 19:05
 */

public class Employees {
    /*
     Field	Type	Null	Key	Default	Extra
     employee_id	int	NO	PRI		auto_increment
     name	varchar(255)	YES
     salary	decimal(10,2)	YES
     department_id	int	YES
     hire_date	date	YES			*/
    @Column
    private int employee_id;
    @Column
    private String name;
    @Column
    private BigDecimal salary;
    @Column
    private String department_id;
    @Column
    private Date hire_date;

    @Override
    public String toString() {
        return "employees{" +
                "employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department_id=" + department_id +
                ", hire_date=" + hire_date +
                '}';
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

}
