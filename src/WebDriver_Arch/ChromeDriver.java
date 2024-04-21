package WebDriver_Arch;

public class ChromeDriver implements WebDriver {
	
	//contructor
	public ChromeDriver() {
		System.out.println("launching chrome browser");
	}
	@Override
	public void get(String url) {
		System.out.println("launch url:  "+url);
	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public String getUrl() {
		return "https://www.amazon.com";
	}

	@Override
	public void click(String eleName) {
		System.out.println("click on element:  "+eleName);
	}

	@Override
	public void sendkeys(String eleName, String value) {
		System.out.println("entering values in: "+eleName + " Value: "+value);
	}

	@Override
	public void close() {
		System.out.println("browser is closed");
	}

	@Override
	public void findElement(String eleName) {
		System.out.println("find element : "+eleName);
	}

	@Override
	public void findElements() {
		System.out.println("find elements on page");
	}

}
