/*
 * Copyright (C) 2015 sinjo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package objectconverter;

/**
 *
 * @author sinjo
 * 
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServiceCode {
    
    private String tid, rawData;
    
    public ServiceCode(String tid) {
        this.tid = tid;
        rawData = postRequest(tid);
    }
    
    public String getServiceCode(String tid) {
        int start = rawData.indexOf("Service kode: ") + "Service kode: ".length();
        String code = rawData.substring(start, start+4);
        return code;
    }
    
    public String getRetailCode(String tid) {
        int start = rawData.indexOf("Retailer kode: ") + "Retailer kode: ".length();
        String code = rawData.substring(start, start+4);
        return code;
    }
    
    public String postRequest(String tid) {
        try {
            String url = "http://termweb/cgi-bin/servcalc";
            URL obj = new URL(url);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
 
		String urlParameters = "tid="+tid;
 
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		return response.toString();
        } catch (Exception e) {
            
        }
        return "";
    }
}
