package org.anujl;

import java.util.List;

import org.anujl.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
.addAnnotatedClass(User.class)
.buildSessionFactory();
Session session=factory.getCurrentSession();
Transaction tx=session.beginTransaction();
try {
	session.beginTransaction();
	//add
	User usersw=new User("anfwea", "wespass", "anuj", "lownashi");
	session.persist(usersw);
	
	//read
//	User user=null;
//	user=session.find(User.class, 1);
//	System.out.println(user.toString());
    
	//update
//	user.setUserName("an");
//	System.out.println(user.toString());
	
	//delete
//	user.setId(1);
//	session.remove(user);
	
	//getlist
//	List<User> users=(List<User>) session.createQuery("from User where id=2",User.class).getResultList();
//for (User user : users) {
//	System.out.println(user.toString());
//}
//    tx.commit();
	
//	session.createMutationQuery("from User where id=2").setParameter(2, "asfweadfew").executeUpdate();
	int updatedCount = session.createMutationQuery(
		    "update User set userName= :name where id = :id"
		)
		.setParameter("name", "New Name")
		.setParameter("id", 2)
		.executeUpdate();


//    System.out.println("User saved successfully: " + user);
}
finally {
	session.close();
	factory.close();
}
	}

}
