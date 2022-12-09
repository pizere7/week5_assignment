package week5_project;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String string1) {
		System.out.println("***"+ string1+"***");
		
	}

	@Override
	public void Error(String string2) {
		System.out.println("******************"+"\n***"+"Error: "+string2+"***"+"\n******************");
		
	}

}
