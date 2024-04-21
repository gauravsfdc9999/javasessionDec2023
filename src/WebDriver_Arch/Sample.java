package WebDriver_Arch;

public abstract class Sample implements SearchContext{
	
	@Override
	public void findElement(String eleName) {
		System.out.println("Sample ----- findElement"+eleName);
	}

}
