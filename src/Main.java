import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws InterruptedException{
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\JAVA Projects\\selenium-test\\chromedriver.exe");
    	
    	ChromeOptions opt  = new ChromeOptions();
    	opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
    	
    	WebDriver driver = new ChromeDriver(opt);
    	driver.manage().window().minimize();
        
    	
    	
        
        
        System.out.println("Mail yada Kullanıcı Adı:");
        Scanner inputMailOrKullaniciAdi = new Scanner(System.in);
        
        String mailOrKullaniciAdi = inputMailOrKullaniciAdi.nextLine();
        
        System.out.println("Şifre: ");
        Scanner inputSifre  =new Scanner(System.in);
        
        String sifre = inputSifre.nextLine();
        
        System.out.println("Kullanıcı Adı:");
        Scanner inputKullaniciAdi = new Scanner(System.in);
        String kullaniciAdi = inputKullaniciAdi.nextLine();
        
        
        driver.manage().window().maximize();
        
        
        driver.get("https://twitter.com/i/flow/login");	
        
        
        
        Thread.sleep(randomNumber());
        
      
        	
        	
        WebElement userNameElement = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input"));
        userNameElement.sendKeys(mailOrKullaniciAdi.toString());
                    
            
        WebElement ileriTikla = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div"));
        ileriTikla.click(); 
        
        //
        
    	
    	try {
    		Thread.sleep(randomNumber());
    		 WebElement kullaniciAdiGirUyari = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div/div/div/span/span"));
    	      	
          	 if (kullaniciAdiGirUyari.isDisplayed()) {
               	
               	WebElement uyariBilgiGir2 = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input"));
               	uyariBilgiGir2.sendKeys(kullaniciAdi.toString());
            
          	 }
    		
    		
		} catch (Exception e) {
			
		}
    	
      	
      	 //
      	 
        randomNumber();
        
        WebElement passwordElement = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input"));
        passwordElement.sendKeys(sifre.toString());
        
        //
      	try {
      		
      		Thread.sleep(randomNumber());
    		 WebElement kullaniciAdiGirUyari = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div/div/div/span/span"));
    	      	
          	 if (kullaniciAdiGirUyari.isDisplayed()) {
               	
               	WebElement uyariBilgiGir2 = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input"));
               	uyariBilgiGir2.sendKeys(kullaniciAdi.toString());
            
          	 }
    		
    		
		} catch (Exception e) {
			
		}
    	
      	Thread.sleep(randomNumber());
      	
        
       WebElement girisYap = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div"));
        	
       girisYap.click();
                	
        
     
        
       Thread.sleep(randomNumber());
        
        
        
        
    }
    
    
 public static int  randomNumber() {
    	
    	Random rand = new Random();
    	int randomSayi = rand.nextInt(6000, 10100);
    	
    	
    	
    	
    	return randomSayi;
    }
    
    
    
    
    
    
}


