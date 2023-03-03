package com.task1.SpringBootCrudApi.Repositoty;

import org.springframework.data.repository.CrudRepository;

import com.task1.SpringBootCrudApi.Entity.Student;

public interface StudentRepository extends CrudRepository<Student,String> {
	

}
