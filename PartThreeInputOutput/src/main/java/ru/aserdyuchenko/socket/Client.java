package main.java.ru.aserdyuchenko.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * @author Anton Serdyuchenko (anton415@gmail.com)
 */
public class Client {
/**
 * @param NUMBERONE - NUMBERONE.
 */
public static final int NUMBERONE = 5000;

/**
 * @throws IOException	 		IOException.
 */
	public void seeDirectory() throws IOException {
		Server server = new Server();
		server.startServer();
	}
/**
 * Start client.
 */
	public void startClient() {
		try {
			Socket socket = new Socket("127.0.0.1", NUMBERONE);

			OutputStream outputStream = socket.getOutputStream();
			DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

			String clientInput = "src";
			dataOutputStream.writeUTF(clientInput);
			dataOutputStream.flush();
			socket.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
