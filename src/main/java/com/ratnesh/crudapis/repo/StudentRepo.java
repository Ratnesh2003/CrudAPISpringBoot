package com.ratnesh.crudapis.repo;

import com.ratnesh.crudapis.studentmodel.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {


}
