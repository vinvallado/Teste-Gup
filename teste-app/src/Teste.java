
public class Teste {

	public static void main(String[] args) {
		if (isOn()) {
			System.out.println("Executando o processo ...");
		}
	}
	
	public static boolean isOn() {
		return (isOff()) ?  false : true;
	}
	
	public static boolean  isOff() {
		 
		 if (processo() > 5) {
			 return false;
		 }
		 
		 return true;
	}
	
	public static int processo() {
		int min = 0;
		int max = 10;
		 
		return (int)Math.floor(Math.random()*(max-min+1)+min);
	}

}
