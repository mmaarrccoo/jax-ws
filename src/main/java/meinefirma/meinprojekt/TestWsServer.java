package meinefirma.meinprojekt;

import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

import meinefirma.meinprojekt.ws.BuecherServiceImpl;

/**
 * Testserver für den Webservice
 */
public class TestWsServer {

	public static void main(final String[] args) {
		String url = (args.length > 0) ? args[0] : "http://127.0.0.1:4434/buecherservice";
		Endpoint ep = Endpoint.publish(url, new BuecherServiceImpl());
		JOptionPane.showMessageDialog(null, "TestWsServer beenden");
		ep.stop();
	}
}
