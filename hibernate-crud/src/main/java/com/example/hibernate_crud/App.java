package com.example.hibernate_crud;

import java.util.List;

import com.example.hibernate_crud.dao.StudentDao;
import com.example.hibernate_crud.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        StudentDao studentDao=new StudentDao();
        //test saveStudent
    	Student student=new Student(1,"Jyothi","Yenduri","jyo@gmail.com");
        studentDao.saveStudent(student);
        
        //test updateStudent
    /*    student.setLastName("Immadisetty");
        studentDao.updateStudent(student);
        
        //test getStudentById
        Student student2=studentDao.getStudentById(student.getId());
        
        //test getAllStudents
        //List<Student> students=studentDao.getAllStudents(Student student);
        //students.forEach(student1 ->System.out.println(student1.getId()));
        
        //test delete student
        studentDao.deleteStudentById(student.getId()); */
    }
}
