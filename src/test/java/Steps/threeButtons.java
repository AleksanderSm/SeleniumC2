package Steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class threeButtons {
    private static WebDriver driver;

    @BeforeAll
    public static void setDriver() {
        driver = new ChromeDriver();

    }

    @Given("Użytkownik jest na stronie")
    public void użytkownik_jest_na_stronie() {
        driver.navigate().to("https://antycaptcha.amberteam.pl/exercises/exercise1");
    }

    @When("Użytkownik pierwszy raz klika w odpowiedni przycisk")
    public void użytkownik_pierwszy_raz_klika_w_odpowiedni_przycisk() throws InterruptedException {
        WebElement pierwszyElement = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/code"));
        String pierwszyTekst = pierwszyElement.getText();
        System.out.println(pierwszyTekst);
        if (pierwszyTekst.equals("B1")) {
            // kliknij w przycisk B1
            driver.findElement(By.id("btnButton1")).click();
        } else {
            // kliknij w przycisk B2
            driver.findElement(By.id("btnButton2")).click();
        }
        Thread.sleep(1000);
    }

    @Given("Użytkownik drugi raz klika w odpowiedni przycisk")
    public void użytkownik_drugi_raz_klika_w_odpowiedni_przycisk() throws InterruptedException {
        String drugiTekst = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[2]/code")).getText();
        System.out.println(drugiTekst);
        if (drugiTekst.equals("B1")) {
            // kliknij w przycisk B1
            driver.findElement(By.id("btnButton1")).click();
        } else {
            // kliknij w przycisk B2
            driver.findElement(By.id("btnButton2")).click();
        }
        Thread.sleep(1000);
    }

    @When("Użytkownik trzeci raz klika w odpowiedni przycisk")
    public void użytkownik_trzeci_raz_klika_w_odpowiedni_przycisk() throws InterruptedException {
        String trzeciTekst = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[4]/td[2]/code")).getText();
        System.out.println(trzeciTekst);
        if (trzeciTekst.equals("B1")) {
            // kliknij w przycisk B1
            driver.findElement(By.id("btnButton1")).click();
        } else {
            // kliknij w przycisk B2
            driver.findElement(By.id("btnButton2")).click();
        }
        Thread.sleep(1000);
    }

    @When("Użytkownik klika w przycisk check solution")
    public void klika_w_przycisk_check_solution() throws InterruptedException {
        driver.findElement(By.name("end")).click();
        Thread.sleep(1000);
    }
    @Then("Użytkownikowi pokazuje się napis OK. Good answer")
    public void użytkownikowi_pokazuje_się_napis_ok_good_answer() {
       String poprawnyTekst = driver.findElement(By.className("wrap")).getText();
        Assert.assertEquals("OK. Good answer",poprawnyTekst);
    }

//    @AfterAll
//    public static void tearDriver() {
//        driver.close();
//    }

}



//    @Given("Użytkownik przechodzi na stronę {string}")
//    public void użytkownik_przechodzi_na_strone(String adresStrony) {
//        //adresStrony to zmienna ktora zapamieta adres strony internetowej
//        System.out.println("Krok 1: Użytkownik_wpisuje_adres_strony_internetowej");
//        driver.navigate().to(adresStrony);
//
//    }
//
//    @Given("Użytkownik sprawdza nazwe przycisku Test Step numer pierwszy")
//    public void użytkownik_sprawdza_nazwe_przycisku_test_step_numer_pierwszy() {
//        WebElement name1field = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[2]/td[2]/code"));
//        System.out.println("Krok 2: Pobieramy nazwę z kroku pierwszego: " + name1field.getText());
//
//
//    }
//
//
//    @When("Użytkownik wciska właściwy przycisk")
//    public void Użytkownik_sprawdza_nazwe_przycisku_Test_Step_w_No1() {
//        System.out.println("Krok 3 Użytkownik_klika odpowiedni przycisk  używamy asercji");
//        WebElement login1Button = driver.findElement(By.id("btnButton2"));
//        String textButton = login1Button.getText();
//        System.out.println("Przycisk login zawiera tekst = " + textButton);
//        login1Button.click();
//    }
//
//
//    @Then("Zostaje dodana nazwa przycisku w przeglądarce")
//    public void zostaje_dodana_nazwa_przycisku_w_przeglądarce() {
//
//    }
//
//    //dwa
//    @Given("Użytkownik sprawdza nazwe przycisku Test Step numer drugi")
//    public void użytkownik_sprawdza_nazwe_przycisku_test_step_numer_drugi() {
//        WebElement name1field = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/code"));
//        System.out.println("Krok 2: Pobieramy nazwę z kroku pierwszego: " + name1field.getText());
//// Assert.assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
//    }
//
//    //trzy
//    @Given("Użytkownik sprawdza nazwe przycisku Test Step numer trzeci")
//    public void użytkownik_sprawdza_nazwe_przycisku_test_step_numer_trzeci() {
//        WebElement name1field = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td[2]/code"));
//        System.out.println("Krok 2: Pobieramy nazwę z kroku pierwszego: " + name1field.getText());
//
//    }


