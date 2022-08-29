package assignment_6_HyberNate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;


public class fetch_Multiple_rec {
	public static void main(String[] args) {
		System.out.println("starting...!!!");
		Configuration cnfg=new Configuration();
		cnfg.configure();
		
		System.out.println("step 2");
		
		cnfg.addAnnotatedClass(employee.class);
		
		SessionFactory sf=cnfg.buildSessionFactory();
		System.out.println("all set to go");
		
		
		Session session=sf.openSession();
		System.out.println("a");
		Transaction tr=session.beginTransaction();
		System.out.println("b");
		Criteria cr=session.createCriteria(employee.class);
		
		cr.add(Restrictions.lt("id",405));
		List<employee> list=cr.list();
		for(employee emp:list)
			System.out.println(emp);
		
		
		/*System.out.println("---Expression Classs---");
	
		cr.add(Expression.isEmpty("dept"));
		cr.add(Expression.isNotEmpty("onkar"));
		cr.add(Expression.isNull("onkar"));
		cr.add(Expression.gt("onkar",401));
		
		
		
		
		---Restriction Class----
		
		
		cr.add(Restrictions.isNull("name"));
		cr.add(Restrictions.like("Name", "rutu%"));
		cr.add(Restrictions.isNotEmpty("department"));
		cr.add(Restriction.between("id",401,404));
	
		*/
		tr.commit();
		session.close();
	}
}
