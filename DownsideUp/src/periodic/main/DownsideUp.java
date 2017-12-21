package periodic.main;

public class DownsideUp {

	public static boolean joshOnline = true;
	public static boolean grantOnline = false;
	public static boolean edwardOnline = false;
	public static boolean scottOnline = false;
	
	public static void main(String[] args) {
		if (joshOnline) System.out.println("Hello from Josh");
		if (grantOnline) System.out.println("Hello from Grant");
		if (edwardOnline) System.out.println("Hello from Edward");
		if (scottOnline) System.out.println("Hello from Scott");
		
		if (joshOnline && grantOnline && edwardOnline && scottOnline) {
			System.out.println("Ready to go!");
		}
		
	}
	
}
