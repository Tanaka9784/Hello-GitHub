/*
 *
 * javac 1.8.0_60
 *
 *
 *
 *
 *
 *
 **/
public class Hello{

	enum Greeting{
		HELLO("Hello"), SPACE(" "), WORLD("World"), EXCLAMATION("!");	
		private String value;
		private Greeting(String value){
			this.value = value;
		};
		public String getValue(){
			return value;
		}
	};
	public static void main(String[] args){
	
		for(Greeting v: Greeting.values()){
			System.out.print(v.getValue());
		}
		System.out.println();
	}
}
