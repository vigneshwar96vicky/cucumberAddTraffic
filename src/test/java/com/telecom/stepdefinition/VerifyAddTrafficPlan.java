package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyAddTrafficPlan {
	public static WebDriver driver;

	@Given("User launches telecom application")
	public void user_launches_telecom_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Telecom Project']")).click();
	}

	@When("User clicks on to Add Traffic plan")
	public void user_clicks_on_to_Add_Traffic_plan() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("User fills the fields")
	public void user_fills_the_fields() {
		driver.findElement(By.id("rental1")).sendKeys("250");
		driver.findElement(By.id("local_minutes")).sendKeys("500");
		driver.findElement(By.id("inter_minutes")).sendKeys("200");
		driver.findElement(By.id("sms_pack")).sendKeys("45");
		driver.findElement(By.id("minutes_charges")).sendKeys("2");
		driver.findElement(By.id("inter_charges")).sendKeys("9");
		driver.findElement(By.id("sms_charges")).sendKeys("1");

	}

	@When("User clicks the submit button")
	public void user_clicks_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("User verifies the configuration text")
	public void user_verifies_the_configuration_text() {
		Assert.assertEquals("Congratulation you add Tariff Plan", driver.findElement(By.xpath("//h2")).getText());
		driver.close();
	}

	@When("User fills the fields using one dimenstional list")
	public void user_fills_the_fields_using_one_dimenstional_list(DataTable dataTable) {
		List<String> lt = dataTable.asList();
		driver.findElement(By.id("rental1")).sendKeys(lt.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(lt.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(lt.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(lt.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(lt.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(lt.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(lt.get(6));
	}

	@When("User fills the fields using one dimensitional Map")
	public void user_fills_the_fields_using_one_dimensitional_Map(DataTable dataTable) {
		Map<String, String> mp = dataTable.asMap(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(mp.get("mnrent"));
		driver.findElement(By.id("local_minutes")).sendKeys(mp.get("localmin"));
		driver.findElement(By.id("inter_minutes")).sendKeys(mp.get("intermin"));
		driver.findElement(By.id("sms_pack")).sendKeys(mp.get("smspck"));
		driver.findElement(By.id("minutes_charges")).sendKeys(mp.get("minchar"));
		driver.findElement(By.id("inter_charges")).sendKeys(mp.get("interchr"));
		driver.findElement(By.id("sms_charges")).sendKeys(mp.get("smschrg"));
	}

	@When("User fills the fields using two dimenstional list")
	public void user_fills_the_fields_using_two_dimenstional_list(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> ltt = dataTable.asLists();
		driver.findElement(By.id("rental1")).sendKeys(ltt.get(0).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(ltt.get(1).get(2));
		driver.findElement(By.id("inter_minutes")).sendKeys(ltt.get(2).get(3));
		driver.findElement(By.id("sms_pack")).sendKeys(ltt.get(3).get(1));
		driver.findElement(By.id("minutes_charges")).sendKeys(ltt.get(0).get(5));
		driver.findElement(By.id("inter_charges")).sendKeys(ltt.get(2).get(4));
		driver.findElement(By.id("sms_charges")).sendKeys(ltt.get(1).get(6));

	}

	@When("User fills the fields using two dimenstional Map")
	public void user_fills_the_fields_using_two_dimenstional_Map(DataTable dataTable) {
	    List<Map<String, String>> mp1 = dataTable.asMaps(String.class,String.class);
	    driver.findElement(By.id("rental1")).sendKeys(mp1.get(0).get("mnrent"));
		driver.findElement(By.id("local_minutes")).sendKeys(mp1.get(1).get("localmin"));
		driver.findElement(By.id("inter_minutes")).sendKeys(mp1.get(2).get("intermin"));
		driver.findElement(By.id("sms_pack")).sendKeys(mp1.get(3).get("smspck"));
		driver.findElement(By.id("minutes_charges")).sendKeys(mp1.get(1).get("minchar"));
		driver.findElement(By.id("inter_charges")).sendKeys(mp1.get(2).get("interchr"));
		driver.findElement(By.id("sms_charges")).sendKeys(mp1.get(0).get("smschrg"));
	}
}
