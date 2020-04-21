public class Hello
{
	//This is made like singleton because of my plactice. 	

	private static Hello hello;
	private static String message;
	private String something;

	static{
		hello = new Hello();
		message = "Hello world!";
	}	

	private Hello(){
		super();
	}

	public static Hello getInstance(){
		return hello;
	}

	public String getMessage(){
		return this.message;
	}
	
	public static void main(String[] args){
		System.out.println(getInstance().getMessage());
	}
}
