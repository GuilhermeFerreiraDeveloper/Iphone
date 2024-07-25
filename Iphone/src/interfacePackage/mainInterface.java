package interfacePackage;
import interfacePackage.webBrowser;
import interfacePackage.telephone;
import interfacePackage.mediaPlayer;

public class mainInterface implements mediaPlayer, telephone, webBrowser{
	public void webBrowserApp() {
		System.out.println("Starting internet browsing application.");		
	}
	
	public void telephoneApp() {
		System.out.println("Starting telephone application.");
	}

	public void mediaPlayerApp() {
		System.out.println("Starting media player application.");
		
	}
}
