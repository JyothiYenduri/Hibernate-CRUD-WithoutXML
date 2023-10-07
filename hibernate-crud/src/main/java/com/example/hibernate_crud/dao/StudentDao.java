package com.example.hibernate_crud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernate_crud.model.Student;
import com.example.hibernate_crud.util.HibernateUtil;

public class StudentDao {

	//save student
	//get All Students
	//get Student By Id
	//update Student
	//delete Student
	
	public void saveStudent(Student student) {
		Transaction transaction=null;
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			//start transaction
			transaction=session.beginTransaction();
			
			//save student object
			session.save(student);
			
			//commit the transaction
			transaction.commit();
			
		}catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();	
			}
		}
	}
/*	public void updateStudent(Student student) {
		Transaction transaction=null;
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			//start transaction
			transaction=session.beginTransaction();
			
			//save student object
			session.saveOrUpdate(student);
			
			//commit the transaction
			transaction.commit();
			
		}catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();	
			}
		}
	}
	public Student getStudentById(long id) {
		Transaction transaction=null;
		Student student=null;
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			//start transaction
			transaction=session.beginTransaction();
			
			//get student object
			student=session.get(Student.class, id);
			
			//commit the transaction
			transaction.commit();
			
		}catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();	
			}
		}
		return student;
	}
	public void deleteStudentById(long id) {
		Transaction transaction=null;
		Student student=null;
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			//start transaction
			transaction=session.beginTransaction();
			student=session.get(Student.class, id);
			//delete student object
			session.delete(student);
			
			//commit the transaction
			transaction.commit();
			
		}catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();	
			}
		}
		
	}
	public List<Student> getAllStudents(Student student) {
		Transaction transaction=null;
		List<Student> students=null;
		try (Session session=HibernateUtil.getSessionFactory().openSession()){
			//start transaction
			transaction=session.beginTransaction();
			
			//get students
			students=session.createQuery("from Student").list();
						
			//commit the transaction
			transaction.commit();
			
		}catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();	
			}
		}
		return students;
	}*/
}
