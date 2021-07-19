package JavaPackages;

public class CheckEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CheckEmp());
	}

	public static String CheckEmp(){
		int ranFunction= (int) Math.floor((Math.random()*10)%2);
		String status= ranFunction == 1 ? "Present" : "Absent";
		return status;
	}
}
