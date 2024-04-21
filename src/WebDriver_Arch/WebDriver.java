package WebDriver_Arch;

public interface WebDriver extends SearchContext{
	
	public void get(String url);
	public String getTitle();
	
	public String getUrl();
	
	public void click(String eleName);
	public void sendkeys(String eleName, String value);
	
	public void close();
	
	//overridding searchcontext interface methods
	@Override
	public void findElement(String eleName);
	@Override
	public void findElements();

}
