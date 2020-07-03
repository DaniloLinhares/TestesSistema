import infrastructure.DriverFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.concurrent.TimeUnit;

public class Main {

    private WebDriver driver = DriverFactory.getDriver();

//    @Test
//    public void atividadeschool( ) {
//        driver.get("https://www.cesar.school");
//        WebElement elemento_nome = driver.findElement(By.cssSelector(".NomeCompleto input"));
//        elemento_nome.sendKeys("Danilo");
//        elemento_nome.getAttribute("NomeCompleto".);
//
//
//
//        System.out.println("What is the URL? " + driver.getCurrentUrl());
//        DriverFactory.quitDriver();
//   }

//    @Test
//    public void atividade20( ) {
//        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
//        WebElement elemento_nome = driver.findElement(By.cssSelector("#contact_form .inputGroupContainer [name='first_name']"));
//        elemento_nome.sendKeys("Danilo");
//
//        WebElement elemento_lastName = driver.findElement(By.cssSelector("#contact_form .inputGroupContainer [name='last_name']"));
//        elemento_lastName.sendKeys("Ferreira");
//
//        WebElement elemento_email = driver.findElement(By.cssSelector("#contact_form .inputGroupContainer [name='email']"));
//        elemento_email.sendKeys("d@gmail.com");
//
//        WebElement elemento_phone = driver.findElement(By.cssSelector("#contact_form .inputGroupContainer [name='phone']"));
//        elemento_phone.sendKeys("81-5588-5555");
//
//        WebElement elemento_endereco = driver.findElement(By.cssSelector("#contact_form .inputGroupContainer [name='address']"));
//        elemento_endereco.sendKeys("Rua aqui");
//
//        WebElement elemento_cidade = driver.findElement(By.cssSelector("#contact_form .inputGroupContainer [name='city']"));
//        elemento_cidade.sendKeys("Recife");
//
//        WebElement elemento_zip = driver.findElement(By.cssSelector("#contact_form .inputGroupContainer [name='zip']"));
//        elemento_zip.sendKeys("8854");
//
//        WebElement elemento_website = driver.findElement(By.cssSelector("#contact_form .inputGroupContainer [name='website']"));
//        elemento_website.sendKeys("www.you.com.br");
//
//        WebElement elemento_radio = driver.findElement(By.cssSelector("#contact_form .form-group .radio input"));
//        elemento_radio.click();
//
//        WebElement elemento_textArea = driver.findElement(By.cssSelector("#contact_form .form-group textarea"));
//        elemento_textArea.sendKeys("www.you.com.br");
//
//        WebElement elemento_send = driver.findElement(By.cssSelector("#contact_form .form-group:last-child button"));
//        elemento_send.click();
//
//        System.out.println("What is the URL? " + driver.getCurrentUrl());
//        DriverFactory.quitDriver();
//    }

//    @Test
//      public void atividade22( ) {
//      driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
//      WebElement elemento_tabela = driver.findElement(By.cssSelector("#task-table tbody tr td:nth:child(2)"));
//      elemento_tabela.getText();
//      System.out.println("What is the URL? " + driver.getCurrentUrl());
//      DriverFactory.quitDriver();
//    }
//
//
//        @Test
//        public void atividade222( ) {
//        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
//        WebElement elemento_Assignee = driver.findElement(By.cssSelector("#task-table thead tr th:nth-child(3)"));
//        System.out.println(elemento_Assignee.getText());
//
//        WebElement elemento_nomaAssignee = driver.findElement(By.cssSelector("#task-table tbody tr td:nth-child(3)"));
//        System.out.println(elemento_nomaAssignee.getText());
//        System.out.println("What is the URL? " + driver.getCurrentUrl());
//        DriverFactory.quitDriver();
//   }

//    @Test
//    public void atividade23( ) {
//        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
//        WebElement elemento_botao = driver.findElement(By.cssSelector(".filterable .panel-heading button"));
//        elemento_botao.click();
//
//        WebElement elemento_username = driver.findElement(By.cssSelector(".table thead tr th:nth-child(2) input"));
//        elemento_username.sendKeys("m");
//
//        WebElement elemento_fname = driver.findElement(By.cssSelector(".table thead tr th:nth-child(3) input"));
//        elemento_fname.sendKeys("b");
//
//        WebElement elemento_line1Assignee = driver.findElement(By.cssSelector("#task-table tbody tr td:nth-child(3)"));
//        System.out.println(elemento_line1Assignee.getText());
//
//        System.out.println("What is the URL? " + driver.getCurrentUrl());
//        DriverFactory.quitDriver();
//   }



    @Test
    public void atividade23( ) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        WebElement elemento_botao = driver.findElement(By.cssSelector("#block_top_menu .submenu-container"));
        DriverFactory.quitDriver();
   }


}
