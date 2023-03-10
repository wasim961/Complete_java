package Number_Class;

public class ToString {

	public static void main(String[] args) {

		Integer x = 5;

		  String s = Integer.toString(x);
	      System.out.println(x.toString()); 
	      System.out.println(s + " is of type " + ((Object)s).getClass().getSimpleName());
	      System.out.println(Integer.toString(12)); 
	}

}
