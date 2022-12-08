package Steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logowanie {
    private static WebDriver driver;

    @BeforeAll
    public static void setDriver() {
        driver = new ChromeDriver();

    }

    @Given("Użytkownik przechodzi na stronę {string}")
    public void użytkownik_przechodzi_na_strone(String adresStrony) {
        //adresStrony to zmienna ktora zapamieta adres strony internetowej
        System.out.println("Krok 1: Użytkownik_wpisuje_adres_strony_internetowej");
        driver.navigate().to(adresStrony);

    }

    @Given("Użytkownik sprawdza nazwe przycisku Test Step numer pierwszy")
    public void użytkownik_sprawdza_nazwe_przycisku_test_step_numer_pierwszy() {
        WebElement name1field = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[2]/td[2]/code"));
        System.out.println("Krok 2: Pobieramy nazwę z kroku pierwszego: " + name1field.getText());


    }


    @When("Użytkownik wciska właściwy przycisk")
    public void Użytkownik_sprawdza_nazwe_przycisku_Test_Step_w_No1() {
        System.out.println("Krok 3 Użytkownik_klika odpowiedni przycisk  używamy asercji");
        WebElement login1Button = driver.findElement(By.id("btnButton2"));
        String textButton = login1Button.getText();
        System.out.println("Przycisk login zawiera tekst = " + textButton);
        login1Button.click();
    }


    @Then("Zostaje dodana nazwa przycisku w przeglądarce")
    public void zostaje_dodana_nazwa_przycisku_w_przeglądarce() {

    }

    //dwa
    @Given("Użytkownik sprawdza nazwe przycisku Test Step numer drugi")
    public void użytkownik_sprawdza_nazwe_przycisku_test_step_numer_drugi() {
        WebElement name1field = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/code"));
        System.out.println("Krok 2: Pobieramy nazwę z kroku pierwszego: " + name1field.getText());
// Assert.assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
    }

    //trzy
    @Given("Użytkownik sprawdza nazwe przycisku Test Step numer trzeci")
    public void użytkownik_sprawdza_nazwe_przycisku_test_step_numer_trzeci() {
        WebElement name1field = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td[2]/code"));
        System.out.println("Krok 2: Pobieramy nazwę z kroku pierwszego: " + name1field.getText());

    }


    @AfterAll
    public static void tearDriver() {
        driver.close();
    }

}
