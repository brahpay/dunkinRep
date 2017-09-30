package loginpackage;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		Logger log=Logger.getLogger("devpinoylogger");
driver.get("https://www.facebook.com/");
log.debug("Facebook Application is opened");
String a=driver.getTitle();
log.debug("Facebook Title is printed");
System.out.println(a);
System.out.println("welcome");
driver.close();

}
}