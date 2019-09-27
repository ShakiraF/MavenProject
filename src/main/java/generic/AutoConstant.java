package generic;

public interface AutoConstant {

	public final static String CHROME_KEY="webdriver.chrome.driver";
	public final static String CHROME_VALUE="./src/main/resources/Drivers/chromedriver.exe";
	public final static String GECKO_KEY="webdriver.gecko.driver";
	public final static String GECKO_VALUE="./src/main/resources/Drivers/geckodriver.exe";
	public final static String XL_INPUT_PATH="./src/main/resources/input.xlsx";
	public final static String XL_REPORT_PATH="./src/test/resources/reports.xlsx";
	public final static String URL="http://localhost/login.do";
	public final static String SCREENSHOT_PATH="./ScreenShot/";
	public final static int IMPLICITWAIT=10;
	public final static int EXPLICITWAIT=10;
	
	

}
