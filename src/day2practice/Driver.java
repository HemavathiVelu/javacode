package day2practice;

public class Driver {

	public static void main(String[] args) {
		Customerentity c1=new Customerentity();
		Customerentity c2=new Customerentity();
		Customerentity c3=new Customerentity();
		Customerentity c4=new Customerentity();
		Customerentity c5=new Customerentity();
		
		c1.setCid(44);
		c1.setCname("Sam");
		c1.setCity("Cuddalore");
		c1.setAddress("No:169,Nehru Street,Cuddalore");
		
		c2.setCid(24);
		c2.setCname("Dhass");
		c2.setCity("Villupuram");
		c2.setAddress("No:25,A.G.S Street,Villupuram");
		
		
		
		
		//System.out.println("ID:" + c1.getCid()+" Employee Name:"+c1.getCname()+" Employee City:"+c1.getCity()+ " EMployee Address" + c1.getAddress());
		System.out.println(c1);
		System.out.println(c2);
		
		

	}

}
