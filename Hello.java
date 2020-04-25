

//This is made like singleton because of my plactice. 	

public class Hello <T>{

	//The meaning of type parameter T is nothing.
	
	public enum Greeting{
		Hello, GoodMorning, GoodEvening;	
	};

	private static Hello<?> hello;
	private String message;
	private T something;

	static{
		hello = new Hello<Object>();
	}

	private Hello(){
		super();
		//this.message = "Hello world!";
	}

	public static Hello getInstance(){
		return hello;
	}

	public String getMessage(){
		return this.message;
	}
	

	public T getSomething(){
		return this.something;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public void setSomething(T something){
		this.something = something;
	}

	public static void main(String[] args){
		Hello hello = getInstance();
		hello.setMessage(Greeting.Hello + " World!");
		System.out.println(hello.getMessage());
	}
}
