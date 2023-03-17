package Demo1;

public class DataTypes extends Vars{
	
	static int add(float english, short science, double maths) {
		return (int) (english+science+ maths); //typecasting
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Rahul";
		int age = 20;
		float english = 78.5f;
		double maths = 80.2;
		short science = 60;
		long total = add(english,science,maths);
		boolean pass;
		if (english >= 35 && maths >=35 && science >= 35) pass = true; else pass = false;
		
		System.out.println("Student Details : " + '\n' + "Name : " + name + '\n' +  "Age : " +age + '\n' +  "Total Marks: " +total + '\n' +  "Pass status :" +pass );
		
		
		
		
	}

}
