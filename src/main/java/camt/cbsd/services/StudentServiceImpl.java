package camt.cbsd.services;

import camt.cbsd.dao.StudentDao;
import camt.cbsd.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
<<<<<<< HEAD
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

=======
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


>>>>>>> b04d23fe73bc31a48b6e25d53769cb18bf29ab8f
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


<<<<<<< HEAD
@Profile("firstDataSource")
@ConfigurationProperties(prefix="server")
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> getStudents() {
        return studentDao.getStudents();
    }

    @Override
    public Student findById(long id) {
        return studentDao.findById(id);
=======

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    @Override
    public List<Student> getStudents() {
        return studentDao.getStudents();
>>>>>>> b04d23fe73bc31a48b6e25d53769cb18bf29ab8f
    }
}
