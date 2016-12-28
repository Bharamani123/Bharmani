package kk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		  driver.switchTo().frame(0);  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement dragElement=driver.findElement(By.id("draggable"));
		  WebElement dropElement=driver.findElement(By.id("droppable"));
		    
		  Actions builder = new Actions(driver);  // Configure the Action
		  Action dragAndDrop = builder.clickAndHold(dragElement)
		    .moveToElement(dropElement)
		    .release(dropElement)
		    .build(); // Get the action
		  Thread.sleep(5000);
		    dragAndDrop.perform(); // Execute the Action
		    driver.close();

	}

}
