package loginpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.close();
}
}