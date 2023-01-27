package week4.day2.assignments;

public class Automation extends MultipleLanguage implements Language,TestTool{

	
	public void Selenium() {
		System.out.println("Selenium is the testing language");
		
	}

	public void java() {
		System.out.println("java is the basic to learn Selenium");
		
	}

	@Override
	public void python() {
		System.out.println("python is same as java");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby is also one type of language");
		
	}public static void main(String[] args) {
		Automation obj=new Automation();
		obj.ruby();
		obj.python();
		obj.java();
		obj.Selenium();
		
	}

}
