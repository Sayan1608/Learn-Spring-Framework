package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class StudentApp 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("confign/spring-config-pschema.xml");
        
        Student student1 = (Student) context.getBean("student1");
        Student student2 = context.getBean("student2", Student.class);
        
        System.out.println("Printing Student 1 =>\n " +student1 );
        
        System.out.println("Printing Student 2 =>\n " +student2 );
        
    }
}
