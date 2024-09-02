package Stringspack;


public class Stringsexercise {

	public static void main(String[] args) {
		
		
		
		String name="sliit";
		

		   System.out.println(name); //original one 
		   
		   
	

	   name= (name.toLowerCase());
	   System.out.println(name);    // Strings immutable 
	   
	   
	   String value = new String ("Sliit");
	   
	   String value2= new String ("Sliit");
	   
	   
	   System.out.println(value==value2);
	   System.out.println(value.equals(value2));
	   
	   
	   
	   //operators 
	   
	   System.out.println("value lenght is :"+value.length());
	   System.out.println("index of  is :"+value.charAt(3));
	   System.out.println("new value is :"+value.concat(" malabe center"));
	   
	   System.out.println("index of t is :"+value.indexOf("t"));
	   System.out.println("replace is :"+value.replace("i", "o"));
	   
	   System.out.println( "split is :"+value.split("")[1]);
	   
	   System.out.println("value  is :"+value.substring(0,1));
	   
	   
	   

	   int x =2+2;
	   System.out.println(x);
	   
	   String hello = ""+2+2;
	   
	   System.out.println(hello);
	   
	   
	   
	
	   
	   
	   
	   
	}

}
