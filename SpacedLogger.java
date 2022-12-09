package week5_project;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String string1) {
		 String s = string1.replaceAll(".", "$0 ");
		System.out.println("***"+ s+"***");	
	}

	@Override
	public void Error(String string2) {
		String p = string2.replaceAll(".","$0 ");
	System.out.println("***********************"+"\n***"+"Error: "+ p+"***"+"\n***********************");
		
	}

	

}
