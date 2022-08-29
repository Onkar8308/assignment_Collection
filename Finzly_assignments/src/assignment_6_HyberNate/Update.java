package assignment_6_HyberNate;


import org.hibernate.Session;	
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
		public static void main(String[] args) {
			System.out.println("Strting...!!!");
			
			//we use Configuration class to activate the HybeNnate network
			Configuration cnf=new Configuration();
			cnf.configure();
			System.out.println("Step 2");
			
			//adding our table to implement operation using HyberNate framework
			cnf.addAnnotatedClass(employee.class);
			
			
			//we use SessionFactory to build session for the database and HyberNate
			SessionFactory sf = cnf.buildSessionFactory();
			System.out.println("is all set");
			
			//session open
			Session session = sf.openSession();
			
			//Transaction is the java object to give the command  to the database
			Transaction tr=session.beginTransaction();
			employee emp=new employee();
			emp.setDept("development");
			emp.setId(402);
			emp.setName("rutuja");
			
			//we use update function to provide  the object to update in database table
			session.update(emp);
			
			//Commit is transaction function used to push changes in databas
			tr.commit();
			
			//session close
			session.close();
			System.out.println("Record updated succefully");
			
		}
}
