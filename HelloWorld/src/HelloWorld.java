/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you now? :)");
		System.out.print("Please enter your name: ");
		String userName = System.console().readLine();
		HelloUser User = new HelloUser(userName);
		User.greetUser();
	}

}
