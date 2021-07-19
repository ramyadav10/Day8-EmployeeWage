package JavaPackages;

public class CalculateEmployeeWages {
	static int wagePerHr=20;
	static int hrPerDay=8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String status=CheckEmp();
		System.out.println(status);
		System.out.println(calculateWage(status));
	}

	public static String CheckEmp(){
		int ranFunction= (int) Math.floor((Math.random()*10)%2);
		String status= ranFunction == 1 ? "Present" : "Absent";
		return status;
	}
	public static int calculateWage(String status){
		int wagePerDay= status == "Present" ? wagePerHr*hrPerDay : 0;
		return wagePerDay;
	}
}
