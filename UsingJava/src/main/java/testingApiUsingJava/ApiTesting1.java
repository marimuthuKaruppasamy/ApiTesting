package testingApiUsingJava;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ApiTesting1 {
	
	public void getRequest() throws UnirestException {
		
		HttpResponse<JsonNode>	json=Unirest.get("http://dummy.restapiexample.com/api/v1/employee/1").header("Content-Value", "application/json").asJson();
		
		System.out.println(json.getStatus());
		
		System.out.println(json.getStatusText());
		
		System.out.println(json.getBody());
	}
	
	public void postRequest() throws UnirestException {
		
		
		HttpResponse<JsonNode> json=	Unirest.post("http://dummy.restapiexample.com/api/v1/create").header("Content-Value", "application/json").body("{\"name\":\"dhoni\",\"salary\":\"12365\",\"age\":\"36\"}").asJson();
		
        System.out.println(json.getStatus());
		
		System.out.println(json.getStatusText());
		
		System.out.println(json.getBody());
	}
	
	public void putRequest() throws UnirestException {
		
HttpResponse<JsonNode> json=	Unirest.put("http://dummy.restapiexample.com/api/v1/update/77").header("Content-Value", "application/json").body("{\"name\":\"dhoni\",\"salary\":\"2000000\",\"age\":\"36\"}").asJson();
		
        System.out.println(json.getStatus());
		
		System.out.println(json.getStatusText());
		
		System.out.println(json.getBody());
	}
	
	public void deleteRequest() throws UnirestException {
		
HttpResponse<JsonNode> json=	Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/2").header("Content-Value", "application/json").body("{\"name\":\"dhoni\",\"salary\":\"2000000\",\"age\":\"36\"}").asJson();
		
        System.out.println(json.getStatus());
		
		System.out.println(json.getStatusText());
		
		System.out.println(json.getBody());
		
		
	}

	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub
		
		ApiTesting1 api=new ApiTesting1();
		
		//api.getRequest();
		
		//api.postRequest();
		
		//api.putRequest();
		
		api.deleteRequest();

	}

}
