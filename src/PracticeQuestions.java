import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class PracticeQuestions {

	public void tryArrayList(){
    
    	Employee emp1 = new Employee(8861, "Aman Tiwari", 'M', 8448179216L, false, 85000, LocalDate.of(1999, 4, 22),LocalDateTime.now());
		Employee emp2 = new Employee(8862, "Priya Sharma", 'F', 9876543210L, true, 92000, LocalDate.of(1995, 7, 15),LocalDateTime.now());
		Employee emp3 = new Employee(8863, "Ravi Mehra", 'M', 9090909090L, false, 78000, LocalDate.of(1992, 2, 9),LocalDateTime.now());
		Employee emp4 = new Employee(8864, "Sneha Das", 'F', 8888888888L, false, 83000, LocalDate.of(1996, 12, 1),LocalDateTime.now());
		Employee emp5 = new Employee(8865, "Arjun Reddy", 'M', 9988776655L, true, 95000, LocalDate.of(1988, 3, 20),LocalDateTime.now());
		Employee emp6 = new Employee(8866, "Neha Verma", 'F', 9123456789L, false, 73000, LocalDate.of(1993, 10, 8),LocalDateTime.now());

        List<Employee> empList = new ArrayList<>();

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
        empList.add(emp5);
		empList.add(emp6);


		//-------SplitIterator-----------------------
		// Spliterator<Employee> s=empList.spliterator();
		// Spliterator<Employee> p=s.trySplit();

		// System.out.println("First Half: ");
		// s.forEachRemaining(System.out::println);
		// System.out.println("Second Half: ");
		// p.forEachRemaining(e->System.out.println(e));

		//------ListIterator-----------------------
		// ListIterator<Employee> l=empList.listIterator();
		// while(l.hasNext()){
		// 	System.out.println(l.next());
		// }

		//------------Print the list in reverse-----------------------
		// ListIterator<Employee> l=empList.listIterator(empList.size());
		// while(l.hasPrevious()){
		// 	System.out.println(l.previous());
		// }

		//----Add a new Employee to the list at a specific index-------
		// empList.add(2, emp6);    //Question2

		//----Remove an Employee object from the list by its ID-------
		// empList.removeIf(e->e.getId()==8863);   //Question 3

		//-------Replace an existing employee in the list with another one at a given index-------
		// empList.set(0,emp6);      //Question5

		//-----  Create an ArrayList of 10 Employee objects and display all employee details using a for-each loop------
		// empList.forEach(e->System.out.println(e));    //Question1

		//----Add a new Employee to the list at a specific index----
		// for(Employee emp:empList){                                 //Question4
		// 	if(emp.getName().equals("Priya Sharma")){
		// 		System.out.println("Employee is: "+ emp);
		// 	}
		// }

		//------Print names of all employees who are *female* -------
		// ArrayList<Employee> females=new ArrayList<>();      //Question6
		// for (Employee emp : empList) {
		// 	if (emp.getGender() == 'F') {
		// 		females.add(emp);
		// 	}
		// }
		// System.out.println("Female Employees are: " + females);
		

		//-------Find all *employees with salary greater than ₹80,000*.------
		// ArrayList<Employee> salary=new ArrayList<>();      //Question7

		// for (Employee emp : empList) {
		// 	if (emp.getSalary()>80000) {
		// 		salary.add(emp);
		// 	}
		// }
		// System.out.println("Employees with above 80,000 salary are: " + salary);


		//-------Count how many employees are *married*-------
		// int count=0;                               //Question8
		// for(Employee emp:empList){
		// 	if(emp.isMarried()==true){
		// 		count++;
		// 	}
		// }
		// System.out.println("Married Employees are: "+ count);

		
		//----- Print all employees whose name *starts with 'A'*------
		// empList.forEach(e->{                         //Question10
		// 	if(e.getName().startsWith("A")){
		// 		System.out.println(e);
		// 	}
		// });


        // empList.removeIf(e->{
        //     if(e.getSalary>=80000){
        //         System.out.println(e.getName()+" Deleted Data...");
        //     }
        // });
}
}
