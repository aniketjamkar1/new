package pomPagefactoryEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RegistrationPage {

	// 3 steps
	// 1.declaration ==>you have to declare all webelements i.e locators,xpaths,elements 
	// 2.initialization==>you have to initialize webelements using pagefactory==> initelements
	// 3.usage ==>you have to right down the methods for every individual verification point.(webelements)
	
	
	// 1.declaration
	//@FindBy (xpath="value") private WebElement name;  // name should be in small case and action specific
	
	@FindBy(xpath ="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy(xpath ="//img[@class='fb_logo _registrationPage__fbLogo img']") private WebElement reg_fblogo;
	@FindBy(xpath ="//a[@aria-label='Already have an account?']") private WebElement alredyacc;
	@FindBy(name ="firstname") private WebElement firstname;
	@FindBy(name ="lastname") private WebElement surname;
	@FindBy(name ="reg_email__") private WebElement mobile_email;
	@FindBy(name ="reg_passwd__") private WebElement password;
	@FindBy(id ="day") private WebElement birthday;
	@FindBy(id ="month") private WebElement birthmonth;
	@FindBy(id ="year") private WebElement birthyear;
	@FindBy(xpath ="//input[@value='1']") private WebElement gender_female;
	@FindBy(xpath ="//input[@value='2']") private WebElement gender_male;
	@FindBy(name ="websubmit") private WebElement signup_btn;



	// 2.initialization ==> you have to create a class constructor ==>pagefactory.initelements
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);  //this keyword pointout to this RegistrationPage(class)
	}
	
	// 3. usage ==> methods ==> Testing methods ==> assertions + actions
	// rules==>action name ==> action+domain name+page+element ==> nomenclature should be camelcase
	// design ==> verify all static method
	
	//Click on signup button/link
	
	public void clickFacebookSignupLink() {
		signuplink.click();
		Reporter.log("clickFacebookSignupLink",true);
	}
	
	//verify registration page fb logo
	public void verifyFacebookRegistrationPagefbLogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(), "Facebook logo on registration page is not displayed");
		Reporter.log("verifyFacebookRegistrationPagefbLogo",true);
	}
	
	//verify alredy have an accountlink
	public void verifyFacebookRegistrationPageAlredyaccLink() {
		Assert.assertTrue(alredyacc.isDisplayed(), "Facebook Alredy have an account link not displyed");
		Reporter.log("verifyFacebookRegistrationPageAlredyaccLink",true);
	}
	
	//Set firstname
	public void setFacebookRegistrationPageFirstName() {
		firstname.sendKeys("aniket");	
		Reporter.log("setFacebookRegistrationPageFirstName",true);
	}
	
	//Set lasttname
	public void setFacebookRegistrationPageLastName() {
		surname.sendKeys("jamkar");	
		Reporter.log("setFacebookRegistrationPageLastName",true);
	}
	
	//Set mobile_email
	public void setFacebookRegistrationPagemobileEmail() {
		mobile_email.sendKeys("879865412");	
		Reporter.log("setFacebookRegistrationPagemobileEmail",true);
	}
	
	//password
	public void setFacebookRegistrationPageNewPassword() {
		password.sendKeys("abc@124578");
		Reporter.log("setFacebookRegistrationPageNewPassword",true);
	}
	
	//birthday
	public void setFacebookRegistrationPageBirthDay() {
		Select bday = new Select(birthday);
		Assert.assertTrue(birthday.isDisplayed());
		bday.selectByVisibleText("19");
		Reporter.log("setFacebookRegistrationPageBirthDay",true);
	}
		
	//birthmonth
	public void setFacebookRegistrationPageBirthMonth() {
		Select bmonth = new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed());
		bmonth.selectByVisibleText("Jan");
		Assert.assertEquals(bmonth.getFirstSelectedOption().getText(), "Jan"); // this for cross check you can apply validate your action
	    Reporter.log("setFacebookRegistrationPageBirthMonth",true);
	}
	
	//birthyear
	public void setFacebookRegistrationpageBirthYear() {
		Select byear = new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed());
		byear.selectByVisibleText("1952");
		Assert.assertEquals(byear.getFirstSelectedOption().getText(), "1952");
	    Reporter.log("setFacebookRegistrationpageBirthYear",true);
	}
	
	//gender selection
	public void setFacebookRegistrationpageGender(String gender) {  //parameteraistion method accept parameter return nothig bcoz void type
		
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
			Assert.assertFalse(gender_female.isSelected(),"female gender is selected");
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else {
			System.out.println("wrong gender selected");
		}
		Reporter.log("setFacebookRegistrationpageGender",true);
	}

	//click on signup button
	public void clickFacebookRegistrationpageSignUpBtn() {
		signup_btn.click();
		Reporter.log("clickFacebookRegistrationpageSignUpBtn");
	}

		
}
