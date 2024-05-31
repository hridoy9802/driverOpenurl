package com.br24.com;
import org.testng.annotations.Test;
public class openUrl extends baseDriver {
    
	
	@Test
    
	public void open() throws InterruptedException {
		driver.get("https://27.54.150.30:8112/");	
		Thread.sleep(5000);
	}
	
	
}
