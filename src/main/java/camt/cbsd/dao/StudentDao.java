package camt.cbsd.dao;

import camt.cbsd.entity.Student;

import java.util.List;
<<<<<<< HEAD
/**
 * Created by Admin on 15/4/2560.
 */

public interface StudentDao {
    List<Student> getStudents();
    Student findById(long id);
    Student addStudent(Student student);

=======

/**
 * Created by CAMT on 3/24/2017.
 */
public interface StudentDao {
    List<Student> getStudents();
    Student findById(long id);
>>>>>>> b04d23fe73bc31a48b6e25d53769cb18bf29ab8f
}
