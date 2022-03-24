package Miscellaneous;

 class Human{
	
	 int id;
	 String name;
	 
	 Human(int id, String name){
		 this.id = id;
		 this.name = name;
	 }
	
	
}
public class HashcodeExample {

	public static void main(String[] args) {
		Human somal = new Human(1, "Somalpreet Singh");
		Human romey = new Human(1, "Somalpreet Singh");
		Human ravi = somal;
		boolean b = somal.equals(romey);
		System.out.println("bollean result of equal is "+b);

		System.out.println("Somal hashcode is " +somal.hashCode());
		System.out.println("Romey hashcode is " +romey.hashCode());
		System.out.println("Romey hashcode is " +ravi.hashCode());
		
		String s1 = "somal";
		String s2 = "somal";
		System.out.println("string equals result "+s1.equals(s2));
		System.out.println("s1 hashcode is " +s1.hashCode());
		System.out.println("s2 hashcode is " +s2.hashCode());
		
		

	}

}
