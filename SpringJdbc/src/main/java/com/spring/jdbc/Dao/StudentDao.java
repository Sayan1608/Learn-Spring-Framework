package com.spring.jdbc.Dao;

import java.util.List;

import com.spring.jdbc.entitity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
	public int delete(int id);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
}
