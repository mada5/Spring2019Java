import java.util.Scanner;

public class Task04_HTTPS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Status Code:");
		int StatusCode = scan.nextInt();
		
		if(StatusCode == 200) {
			System.out.println("OK");
		}else if(StatusCode == 201) {
			System.out.println("Accepted");
		}else if(StatusCode == 301) {
			System.out.println("Moved Permanently");
		}else if(StatusCode == 303) {
			System.out.println("See Other");
		}else if(StatusCode == 304) {
			System.out.println("Not Modified");
		}else if(StatusCode == 307) {
			System.out.println("Temporary Redirect");
		}else if(StatusCode == 400) {
			System.out.println("Bad Request");
		}else if(StatusCode == 401) {
			System.out.println("Unauthorized");
		}else if(StatusCode == 403) {
			System.out.println("Forbidden");
		}else if(StatusCode == 404) {
			System.out.println("Not Found");
		}else if(StatusCode == 410) {
			System.out.println("Gone");
		}else if(StatusCode == 500) {
			System.out.println("Internal Server Error");
		}else if(StatusCode == 503) {
			System.out.println("Service Unavailable");
		}else
			System.out.println("You entered an unknown status code, please check and try again!");
	}
}
