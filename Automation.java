package week5.day2;

public class Automation extends MultipleLangauge implements Language, TestTool 
{

	public static void main(String[] args) 
	{
		Automation au=new Automation();
		au.Java();
		au.Selenium();
		au.python();
		//au.ruby();


	}

	public void python() {
		// TODO Auto-generated method stub
		
	}

	public void Java() {
		System.out.println("java");

	}

	public void Selenium() 
	{
		System.out.println("selenium");



	}

	public void ruby() {
		// TODO Auto-generated method stub

	} 

}
