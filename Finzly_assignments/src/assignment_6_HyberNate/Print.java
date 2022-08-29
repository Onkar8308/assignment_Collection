package assignment_6_HyberNate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Print {
	public static void main(String[] args) {
		System.out.println("Starting...!!!");
		
		//we use Configuration class to activate the HybeNnate network
		Configuration cnf=new Configuration();
		cnf.configure();
		System.out.println("step 2");
		
		//adding our table to implement operation using HyberNate framework
		cnf.addAnnotatedClass(employee.class);
		
		//we use SessionFactory to build session for the database and HyberNate
		SessionFactory sf=cnf.buildSessionFactory();
		System.err.println("all set to go");
		
		//session open
		Session session=sf.openSession();
		
		//we use load function to fetch  the object  from database table to print
		try   {
		employee ee=session.load(employee.class,405);
		System.out.println(ee.getId() + " " + ee.getName() + " " + ee.getDept());
		}
		catch(Exception e) {
			System.out.println("no row found");
		}
		
		
		
		//session close
		session.close();
	}
}
