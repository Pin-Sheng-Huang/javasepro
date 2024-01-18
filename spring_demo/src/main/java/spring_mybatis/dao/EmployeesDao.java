package spring_mybatis.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import spring_mybatis.domain.Employees;

import java.util.List;

public interface EmployeesDao {

//    @Insert("insert into test.employees(name,salary,department_id,hire_date)values(#{name},#{salary},#{department_id},#{hire_date})")
@Insert({
        "<script>",
        "INSERT INTO test.employees (name, salary, department_id, hire_date)",
        "VALUES",
        "<foreach collection='list' item='employee' separator=','>",
        "(",
        "#{employee.name},",
        "#{employee.salary},",
        "#{employee.department_id},",
        "#{employee.hire_date}",
        ")",
        "</foreach>",
        "</script>"
})
    void save(Employees employees);

    @Delete("delete from test.employees where employee_id = #{id}")
    void delete(Integer id);

    @Update("update test.employees set name =#{name},salary = #{salary}")
    void update(Employees employees);

    @Select("select * from test.employees")
    List<Employees> findAll();

    @Select("select * from test.employees where employee_id = #{id}")
    Employees findById(Integer id);
}
