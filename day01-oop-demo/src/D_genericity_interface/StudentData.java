package D_genericity_interface;

/**
 * @program: javasepromax
 * @description:
 * @Creator: 阿昇
 * @CreateTime: 2023-04-08 14:15
 * @LastEditTime: 2023-04-08 14:15
 */

public class StudentData implements Data<Student>{
    @Override
    public void add(Student s) {

    }

    @Override
    public void delete(int d) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student queryById(int id) {
        return null;
    }
}
