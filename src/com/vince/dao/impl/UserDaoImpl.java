package com.vince.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.AnnotationConfiguration;
import com.vince.dao.UserDao;
import com.vince.model.UserModel;

public class UserDaoImpl implements UserDao {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {// 单例
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory(
					new StandardServiceRegistryBuilder().build());
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	Session session = getSessionFactory().getCurrentSession();

	@Override
	public void addUser(UserModel user) {
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

	@Override
	public boolean Verification(UserModel user) {
		session.beginTransaction();

		Query query = session
				.createQuery("from User u where u.name = :userName and u.password = :userPassword");
		query.setString(user.getUemployeeId(), "userName").setString(
				user.getUpassword(),"userPassword");
		boolean exist = !(query.list().isEmpty());
		System.out.println(exist);
		/*
		 * for(Object o : query.list()){ User u = (User)o;
		 * System.out.println(u.getId() + "-" + u.getName()); }
		 */
		session.getTransaction().commit();
		return exist;
	}

}
