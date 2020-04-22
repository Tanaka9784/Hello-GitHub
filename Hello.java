

//This is made like singleton because of my plactice. 	

public class Hello <T>{

	//The meaning of type parameter T is nothing.

	private static Hello<?> hello;
	private String message;
	private String something;

	static{
		hello = new Hello<Object>();
	}

	private Hello(){
		super();
		this.message = "Hello world!";
	}

	public static Hello getInstance(){
		return hello;
	}

	public String getMessage(){
		return this.message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}

	public void setSomething(String something){
		this.something = something;
	}

	public static void main(String[] args){
		System.out.println(getInstance().getMessage());
	}
}
