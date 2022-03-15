package myfirstpackage2022;

public class myJavaclass {
	String nme = "sakthee";
	int emp_idd = 555;
	double salary = 1500.00;
	
			
	
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("My name is : "+nme);

	}
	
	public void id() {
		System.out.println("employee ID would be : "+emp_idd);
		
	}
	public void salary() {
		System.out.println("salaries/wages is "+salary);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myJavaclass morn = new myJavaclass();
		morn.name();
		morn.id();
		morn.salary();

	}

}
