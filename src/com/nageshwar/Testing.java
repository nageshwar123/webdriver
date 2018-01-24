package com.nageshwar;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe")
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
	}

}
