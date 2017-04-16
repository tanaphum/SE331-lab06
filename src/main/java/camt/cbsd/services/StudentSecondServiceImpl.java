package camt.cbsd.services;

import camt.cbsd.dao.StudentDao;
import camt.cbsd.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Profile("secondDataSource")
@Service
public class StudentSecondServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> getStudents() {
        return studentDao.getStudents();
    }

    @Override
    public Student findById(long id) {
        return studentDao.findById(id);
    }
}
