package san.learn.javaprojects.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//"https://restmock.techgig.com/news?author="+author+"&page=10"
public class URLCheck {

	public static void main(String[] args) {
		String strURL = "https://restmock.techgig.com/news?author=sama&page=1";
		try {
			URL url = new URL(strURL);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			http.setRequestMethod("GET");
			int response = http.getResponseCode();
			System.out.println();
			if(response == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
				String input;
				while((input = br.readLine()) != null) {
					String title;
					System.out.println(input);
					if(input.contains("title"))
					{
						title = input.substring(input.indexOf("title")+8, input.indexOf("link") - 3);
					}
					if(input.contains("link"))
					{
						title = input.substring(input.indexOf("link")+7, input.indexOf("points") - 3);
					}
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
