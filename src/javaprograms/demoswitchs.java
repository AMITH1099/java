package javaprograms;

public class demoswitchs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="def";
		switch(day)
		{
		case "jan","mar","may","july","oct","dec":
			System.out.println("31 days");
			
			break;
		
		case "apr","jun","sep","nov": 
			System.out.println("30 days");
			break;
		
		default: System.out.println("28 days");
			
		}

	}

}
