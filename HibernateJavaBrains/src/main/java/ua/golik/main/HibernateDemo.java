package ua.golik.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ua.golik.entities.Student;

public class HibernateDemo {
	public static void main(String[] args) {
		Student student = new Student("Viktor", "Kelvinov", 21);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
	}
}
