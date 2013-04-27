import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class RaxaRestCaller {

    /**
     * I am thinking to add a web Servie in our REST API which will contain two fields User Mobile number and User Unique Id.
     * We will call REST API passing user mobilenumber and will get uuid.This uuid will then be used for further 
     * 
     */
    
public String retrieveDataFromRest(int callerID){           //Make Get Request.I will use APache HTTPComponets to make requests
	// 1. Call the Rest API and fetch uuid
	//2. Call Rest API and fetch user Required Information eg.Medicine Information
	//3.Convert the JSON to String.
	// return String.
}

public void changePatientInformation(int id){			//Make a POST request and will change the Patient(based on caller ID information
	//To make a POST request user mobile number must be registered.
	//1.Call Rest API and 
}






/*
 *  static void getData(String address) throws Exception {
	
    URL page = new URL(http://localhost:8081/openmrs-standalone/ws/rest/v1/drug/uuid);
    StringBuffer text = new StringBuffer();
    HttpURLConnection conn = (HttpURLConnection) page.openConnection();
    conn.connect();
    InputStreamReader in = new InputStreamReader((InputStream) conn.getContent());
    
    BufferedReader buff = new BufferedReader(in);
    String line = buff.readLine();
    while (line != null) {
        text.append(line + "\n");
        line = buff.readLine();
       
    }
    System.out.println(text.toString());
 */

}