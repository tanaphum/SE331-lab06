package camt.cbsd.dao;

import camt.cbsd.entity.Student;

import java.util.List;

/**
 * Created by Admin on 15/4/2560.
 */

public interface StudentDao {
    List<Student> getStudents();
    Student findById(long id);
}
