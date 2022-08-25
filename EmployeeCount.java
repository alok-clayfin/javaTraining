package clayfinTrainee;


class Admin extends EmployeeCount{
	
}
class Manager extends EmployeeCount{
	
}
public class EmployeeCount {
	static int count=0;
	EmployeeCount(){
		count++;
	}
	
	public static void main(String[] args) {
		EmployeeCount employeeCount = new EmployeeCount();
		EmployeeCount employeeCount1 = new EmployeeCount();
		EmployeeCount employeeCount2 = new EmployeeCount();
		
		Manager mangaer = new Manager();
		Manager manager1 = new Manager();
		
		Admin admin = new Admin();
		Admin admin1 = new Admin();
		
		System.out.println("Total number of Employee: "+count);
	}
}
