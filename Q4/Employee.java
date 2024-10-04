package labtest03;
import java.util.*;
public class Employee  implements Comparable<Employee>{
	public int id;
	public String name;
	public int hours;
	
	public Employee() {
		id=0;
		name="";
		hours=0;
				
	}
	public Employee(int id,String name,int hours) {
		this.id=id;
		this.name=name;
		this.hours=hours;
	}
	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
	 return Integer.compare(this.hours, other.hours);
	}
	 @Override
	    public String toString() {
	        return "id=" + id + "\nname='" + name + "\nhours=" + hours+"\n";
	    }
}


class EmployeeSortingApp{
	public static void main (String[] args) {
		PriorityQueue<Employee> pq=new PriorityQueue<>();
		pq.add(new Employee(1,"Wickrama",20));
		pq.add(new Employee(2,"Arachchige",10));
		pq.add(new Employee(3,"Angeli",16));
		pq.add(new Employee(4,"Tharushika",50));
		pq.add(new Employee(5,"Fernando",12));
		
		Employee emp2 = new Employee(5,"Fernando",12);
		Employee emp1 = new Employee(5,"Fernando",3);
		System.out.println(emp2.compareTo(emp1));
		
		
		System.out.println("\n\nAll data : \n");
		 PriorityQueue<Employee> tempPQ = new PriorityQueue<>(pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		System.out.println("higest hour : \n");
		while(!tempPQ.isEmpty()) {
			 Employee emp = tempPQ.poll(); 
	            if (emp.hours > 15) {
	                System.out.println(emp);
			}
	            
	           
		}
		
		
		
		
		
	
	}
}
