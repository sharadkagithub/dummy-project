package com.training;
//Exception Handling in Java
/*
 * try... catch...finally
 * finally block will be executed on all conditions. 
 * catch block will have handle the exception which is returned by the system as an object of a class derived from Exception.
 * throw and throws
 * throw keyword is used to raise an Exception. 
 * throws keyword is used in the function declaration to tell that this function might throw an Exception of that kind.  
 * */
public class Ex05 {

	public static void main(String[] args)  {
		/*
		 * try {
		 * System.out.println("Code that will run and occasionally get an Exception");
		 * throw new Exception("OOPS! Something wrong happened"); }catch(Exception ex) {
		 * System.out.println(ex.getMessage()); }finally { System.out.
		 * println("Execute on all conditons irrespective an exception occurs or not");
		 * }
		 */
		
		try {
			callMe("Trainee");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void callMe(String name) throws Exception{
		if((name == "Trainer") || (name == "Trainee"))
			System.out.println("welcome");
		else
			throw new Exception("Not a valid person");
	}

}
