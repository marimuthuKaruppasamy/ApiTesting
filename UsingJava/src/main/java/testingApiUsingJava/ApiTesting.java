package testingApiUsingJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiTesting {

	public void getRequest() throws IOException {

		URL url=new URL("https://jsonplaceholder.typicosde.com/post");

		HttpURLConnection	connection=(HttpURLConnection) url.openConnection();

		connection.setRequestMethod("GET");

		connection.connect();

		System.out.println(	connection.getResponseCode());

		System.out.println(	connection.getResponseMessage());

		InputStream	inputStraem=connection.getInputStream();

		InputStreamReader reader=new InputStreamReader(inputStraem);

		BufferedReader buffered=new BufferedReader(reader);

		String line;

		StringBuffer buffer=new StringBuffer();

		while((line=buffered.readLine())!=null) {

			buffer.append(line);

		}

		System.out.println(buffer);



	}

	public void postRequest() throws IOException {

		URL url=new URL("http://dummy.restapiexample.com/api/v1/create");

		HttpURLConnection  connection= (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("POST");

		connection.setRequestProperty("Content-Value", "application/json");

		connection.setDoOutput(true);

		String jsonInput="{\"name\":\"hardik\",\"salary\":\"12387\",\"age\":\"27\"}";

		byte[] bytes=jsonInput.getBytes();

		OutputStream outputstream=connection.getOutputStream();

		outputstream.write(bytes);


		System.out.println(	connection.getResponseCode());

		System.out.println(	connection.getResponseMessage());

		InputStream	inputStraem=connection.getInputStream();

		InputStreamReader reader=new InputStreamReader(inputStraem);

		BufferedReader buffered=new BufferedReader(reader);

		String line;

		StringBuffer buffer=new StringBuffer();

		while((line=buffered.readLine())!=null) {

			buffer.append(line);

		}

		System.out.println(buffer);











	}

	public void putRequest() throws IOException {

		URL url=new URL("http://dummy.restapiexample.com/api/v1/update/3548");

		HttpURLConnection  connection= (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("PUT");

		connection.setRequestProperty("Content-Value", "application/json");

		connection.setDoOutput(true);

		String jsonInput="{\"name\":\"hardik\",\"salary\":\"1000000\",\"age\":\"27\"}";

		byte[] bytes=jsonInput.getBytes();

		OutputStream outputstream=connection.getOutputStream();

		outputstream.write(bytes);


		System.out.println(	connection.getResponseCode());

		System.out.println(	connection.getResponseMessage());

		InputStream	inputStraem=connection.getInputStream();

		InputStreamReader reader=new InputStreamReader(inputStraem);

		BufferedReader buffered=new BufferedReader(reader);

		String line;

		StringBuffer buffer=new StringBuffer();

		while((line=buffered.readLine())!=null) {

			buffer.append(line);

		}

		System.out.println(buffer);


	}

	public void deleteRequest() throws IOException {

		URL url=new URL("http://dummy.restapiexample.com/api/v1/delete/3548");

		HttpURLConnection  connection= (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("DELETE");

		connection.connect();


		System.out.println(	connection.getResponseCode());

		System.out.println(	connection.getResponseMessage());

		InputStream	inputStraem=connection.getInputStream();

		InputStreamReader reader=new InputStreamReader(inputStraem);

		BufferedReader buffered=new BufferedReader(reader);

		String line;

		StringBuffer buffer=new StringBuffer();

		while((line=buffered.readLine())!=null) {

			buffer.append(line);

		}

		System.out.println(buffer);




	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ApiTesting api=new ApiTesting();

		//api.getRequest();

		//api.postRequest();

		//api.putRequest();

		api.deleteRequest();

	}

}
