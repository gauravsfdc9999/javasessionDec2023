package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkBrowserVersion();
		checkOSCompatibility();
		checkRAMSpace();
		checkUpdateAvailable();
		System.out.println("browser is launched---");
	}
	private void checkBrowserVersion() {
		System.out.println("launch browser checkBrowserVersion");
	}
	private void checkOSCompatibility() {
		System.out.println("launch browser with os compatibility");
	}
	private void checkRAMSpace() {
		System.out.println("checkRAMSpace");
	}
	private void checkUpdateAvailable() {
		System.out.println("lcheckUpdateAvailable");
	}

}
