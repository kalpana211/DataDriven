package org.tcs;


	

	import java.io.IOException;

	import org.openqa.selenium.WebElement;

	public class Grocery extends BaseClass {
		public static void main(String[] args) throws InterruptedException, IOException {
			Grocery g = new Grocery();
			g.project();
		}

		public void project() throws IOException, InterruptedException {
			BrowserLaunchChrome();
			GetUrl("https://www.omrbranch.com/");
			MaximizeWindow();
			implicitwait();
			WebElement txtemail = FindByid("email");
			SendKeys(txtemail, GetCellData("Grocery", 1, 0));
			WebElement txtpass = FindByid("pass");
			SendKeys(txtpass, GetCellData("Grocery", 1, 1));
			WebElement btnlogin = FindByXpath("//button [@value='login']");
			Click(btnlogin);
			implicitwait();
			WebElement printuser = FindByXpath("//a [@class='icoTwitter mr-2 dropdown-toggle']");
			String txt = GetText(printuser);
			System.out.println(txt);
			WebElement txtsearch = FindByid("search");
			SendKeys(txtsearch, GetCellData("Grocery", 1, 2));
			WebElement btnsearch = FindByXpath("//button[@data-testid='searchbtn']");
			Click(btnsearch);
			WebElement btnadd = FindByXpath(
					"//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-17']");
			ClickJs(btnadd);
			implicitwait();
			WebElement btnadd1 = FindByXpath(
					"(//button[@data-product='17'])[1]");
			ClickJs(btnadd1);
			implicitwait();
			WebElement btncart = FindByXpath("//a[@class='hover1']");
			ClickJs(btncart);
			WebElement PrintCart = FindByXpath("//div[@class='cartProdDetail mb-md-0 mb-3']");
			String txt1 = GetText(PrintCart);
			System.out.println(txt1);
			WebElement btnaddress = FindByXpath(
					"//div [@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']");
			Click(btnaddress);
			implicitwait();
			WebElement txtaddtype = FindByid("address_type");
			SendKeys(txtaddtype, GetCellData("Grocery", 1, 3));
			WebElement txtname = FindByName("first_name");
			SendKeys(txtname, GetCellData("Grocery", 1, 4));
			WebElement txtname1 = FindByName("last_name");
			SendKeys(txtname1, GetCellData("Grocery", 1, 5));
			WebElement txtphno = FindByName("mobile");
			SendKeys(txtphno, GetCellData("Grocery", 1, 6));
			WebElement txthmeno = FindByName("apartment");
			SendKeys(txthmeno, GetCellData("Grocery", 1, 7));
			WebElement txtadd1 = FindByName("address");
			SendKeys(txtadd1, GetCellData("Grocery", 1, 8));
			WebElement txtcountry = FindByName("country");
			SendKeys(txtcountry, GetCellData("Grocery", 1, 9));
			WebElement txtstate = FindByName("state");
			SendKeys(txtstate, GetCellData("Grocery", 1, 10));
			implicitwait();
			WebElement txtcity = FindByName("city");
			SelectOptionByText(txtcity, GetCellData("Grocery", 1, 11));
			WebElement txtcode = FindByName("zipcode");
			SendKeys(txtcode, GetCellData("Grocery", 1, 12));
			WebElement btnsave = FindByXpath(
					"//button [@class='saveAddress font18 fontSemiBold colorWhite bgTheme radius50 borderNone px-5 py-2 hover1']");
			ClickJs(btnsave);
			Thread.sleep(6000);
			WebElement txtpayment = FindByXpath("//select[@id='payment_type']");
			SelectOptionByText(txtpayment, GetCellData("Grocery", 1, 13));
			WebElement rdobtn = FindByXpath("(//label [@class='custom-control-label font14 color20'])[2]");
			Click(rdobtn);
			WebElement txtcardno = FindByName("card_no");
			SendKeys(txtcardno, GetCellData("Grocery", 1, 14));
			WebElement txtmonth = FindByName("month");
			SelectOptionByText(txtmonth, GetCellData("Grocery", 1, 15));
			WebElement txtyear = FindByid("year");
			SelectOptionByText(txtyear, GetCellData("Grocery", 1, 16));
			WebElement txtccv = FindByXpath("(//input [@type='password'])[1]");
			SendKeys(txtccv, GetCellData("Grocery", 1, 17));
			WebElement btnplaceorder = FindByid("placeOrder");
			ClickJs(btnplaceorder);
			implicitwait();
			GetUrl("https://www.omrbranch.com/");
			MaximizeWindow();
			implicitwait();
			WebElement btnusername = FindByXpath("//a [@class='icoTwitter mr-2 dropdown-toggle']");
			Click(btnusername);
			implicitwait();
			WebElement btnmyacc = FindByXpath("//a [text()='My Account']");
			ClickJs(btnmyacc);
			WebElement btnorder1 = FindByXpath("//a [@class='nav-link font16 fontSemiBold text-capitalize']");
			ClickJs(btnorder1);
			WebElement Printorderid = FindByXpath("(//span[@class='font16 ml-2'])[1]");
			String id = GetText(Printorderid);
			System.out.println(id);
			WriteCellData(id, "Grocery", 2, 0);
		}
	
	}


