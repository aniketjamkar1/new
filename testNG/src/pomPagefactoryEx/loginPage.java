package pomPagefactoryEx;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class loginPage {
	
    	//declaration
	
        @FindBy(xpath="//img[@class='fb_logo _8ilh img']") private WebElement loginfblogo;	
        @FindBy(xpath="//h2[@class='_8eso']") private WebElement loginfbtagline;
        @FindBy(id="email") private WebElement loginusername;
        @FindBy(id="pass") private WebElement login_password;
        @FindBy(xpath="//button[@name='login']") private WebElement login_btn;
        @FindBy(xpath="//a[text()='Forgotten password?']") private WebElement forgaotpassword;
        @FindBy(xpath="//a[@data-testid='open-registration-form-button']") private WebElement creatnewaccount;
        @FindBy(xpath="//a[text()='Create a Page']") private WebElement createpage_link;
        @FindBys({@FindBy(xpath="//ul[contains(@class,'uiList pageFooterLinkList')]/li/a")}) private List<WebElement> footer_links;
        
        //initialization 
        public loginPage(WebDriver driver) {
        	PageFactory.initElements(driver, this);
        }
        
        //usage
        public void verifyFacebookLoginPageFbLogo() {
        	Assert.assertTrue(loginfblogo.isDisplayed(), "facebook page logo is not displyed");
        	Reporter.log("verifyFacebookLoginPageFbLogo",true);
        }
        
        public void verifyFacebookLoginPageTagline() {
        	Assert.assertTrue(loginfbtagline.isDisplayed(), "Facebook page tagline is not displyed");
        	Assert.assertEquals(loginfbtagline.getText(), "Facebook helps you connect and share with the people in your life.");
        	Reporter.log("verifyFacebookLoginPageTagline",true);
        }
        
        public void verifyFacebookLoginPageForgotPasswdLink() {
        	Assert.assertTrue(forgaotpassword.isDisplayed());
        	Assert.assertEquals(forgaotpassword.getText(), "Forgotten password?");
        	Reporter.log("verifyFacebookLoginPageForgotPasswdLink",true);
        }
        	
        public void verifyFacebookLoginPageCreatPageLink() {
        	Assert.assertTrue(createpage_link.isDisplayed());
        	Reporter.log("verifyFacebookLoginPageCreatPageLink",true);
        }
        
        public void setFacebookLoginPageUsername() {
        	loginusername.click();
        	Reporter.log("setFacebookLoginPageUsername",true);
        }
        
        public void setFacebookLoginPagePassword() {
        	login_password.click();
        	Reporter.log("setFacebookLoginPagePassword",true);
        }
        
        public void clickFacebookLoginPageLoginBtn() {
//        	login_btn.click();
        	Assert.assertTrue(login_btn.isDisplayed(), "loginbtn is not displayd");
        	Reporter.log("clickFacebookLoginPageLoginBtn",true);
        }
        
        public void clickFacebookLoginPageCreateNewAccBtn() {
        	Assert.assertTrue(creatnewaccount.isDisplayed());
        	Assert.assertEquals(creatnewaccount.getText(), "Create New Account");
        	Reporter.log("clickFacebookLoginPageCreateNewAccBtn",true);
        }
        
        public void verifyFacebookLoginPageFooterlinkSize() {
        	Assert.assertEquals(footer_links.size(), 30);
            Reporter.log("verifyFacebookLoginPageFooterlinkSize");
        }
        

}
