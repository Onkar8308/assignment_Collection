package assignment_6_HyberNate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//entity used to make this class as an object for database
@Entity
public class employee {
	int id;
	String name,dept;
	
	//to get the output in values
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	/*Generating getters and setters to set and get the values
	*Notation for
	*
	***/
	
	//ID is used to make id as a primary  key 
	@Id
	
	//column is used for column mapping
	@Column
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Column
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
