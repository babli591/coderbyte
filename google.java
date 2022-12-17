import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Connection;
import java.sql.DriverManager;



import java.sql.*;

public class google {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        /*Opening website www.amazon.in */
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        WebDriver wb = new ChromeDriver();
        wb.get("https://www.google.com");
    }}