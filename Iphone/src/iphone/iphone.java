package iphone;
import interfacePackage.webBrowser;
import interfacePackage.telephone;
import interfacePackage.mainInterface;
import interfacePackage.mediaPlayer;

public class iphone {
	public static void main(String[] args) {
		mainInterface in = new mainInterface();
		mediaPlayer mediaPlayer = in;
		telephone telephone = in;
		webBrowser webBrowser = in;
		
		mediaPlayer.mediaPlayerApp();
		telephone.telephoneApp();
		webBrowser.webBrowserApp();
	}
}
