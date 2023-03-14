package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Dao.StudentDaoImpl;
import com.spring.jdbc.config.SpringJdbcJavaConfig;
import com.spring.jdbc.entitity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       ApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-config.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcJavaConfig.class);
       
       StudentDao studentDao = context.getBean("studentDao", StudentDaoImpl.class);
       
       //INSERT
       
       Student student1 = new Student(105, "Shitish Banerjee", "Siliguri");
       int result = studentDao.insert(student1);
       System.out.println("No of students inserted..."+result);
       
       //UPDATE
       
//       Student student = new Student();
//       student.setId(105);
//       student.setName("Rajiv Das");
//       student.setCity("Raipur");
//       int res = studentDao.update(student);
//       System.out.println("Rows updated..."+res);
       
       //DELETE
//       int res = studentDao.delete(105);
//       System.out.println("Rows deleted..."+res);
       
       //select single object from db
       
//       Student student = studentDao.getStudent(222);
//       System.out.println(student);
       
       List<Student> students = studentDao.getAllStudents();
       
       Iterator<Student> itr = students.iterator();
       
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       
       
    }
}
