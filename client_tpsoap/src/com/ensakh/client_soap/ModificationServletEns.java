package com.ensakh.client_soap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModificationServletEns extends HttpServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String wsURL = "http://localhost:9997/enseignant";
	        URL url = null;
	        URLConnection connection = null;
	        HttpURLConnection httpConn = null;
	        String responseString = null;
	        String outputString="";
	        OutputStream out = null;
	        InputStreamReader isr = null;
	        BufferedReader in = null;
	         
	        String xmlInput =
	        		"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ens=\"http://enseignant.metiers.soap.ensakh.com/\">\n" + 
	        		"   <soapenv:Header/>\n" + 
	        		"   <soapenv:Body>\n" + 
	        		"      <ens:modification>\n" + 
	        		"         <!--Optional:-->\n" + 
	        		"         <arg0>\n" + 
	        		"            <!--Optional:-->\n" + 
	        		"            <cni>" + req.getParameter("cni") + "</cni>\n" + 
					"            <!--Optional:-->\n" + 
					"            <nom>" + req.getParameter("nom") + "</nom>\n" + 
					"            <!--Optional:-->\n" + 
					"            <prenom>" + req.getParameter("prenom") + "</prenom>\n" + 
					"            <!--Optional:-->\n" + 
					"            <age>" + req.getParameter("age") + "</age>\n" + 
					"            <!--Optional:-->\n" + 
					"            <addresse>" + req.getParameter("addresse") + "</addresse>\n" + 
					"            <!--Optional:-->\n" + 
					"            <ville>" + req.getParameter("ville") + "</ville>\n" + 
					"            <!--Optional:-->\n" + 
					"            <photo>" + req.getParameter("photo") + "</photo>\n" + 
					"            <!--Optional:-->\n" + 
					"            <sexe>" + req.getParameter("sexe") + "</sexe>\n" + 
	        		"         </arg0>\n" + 
	        		"      </ens:modification>\n" + 
	        		"   </soapenv:Body>\n" + 
	        		"</soapenv:Envelope>";
	         
	        try
	        {
	            url = new URL(wsURL);
	            connection = url.openConnection();
	            httpConn = (HttpURLConnection) connection;
	 
	            byte[] buffer = new byte[xmlInput.length()];
	            buffer = xmlInput.getBytes();
	 
	            String SOAPAction = "";
	            // Set the appropriate HTTP parameters.
	             httpConn.setRequestProperty("Content-Length", String
	                     .valueOf(buffer.length));
	            httpConn.setRequestProperty("Content-Type",
	                    "text/xml; charset=utf-8");
	             
	             
	            httpConn.setRequestProperty("modification", SOAPAction);
	            httpConn.setRequestMethod("POST");
	            httpConn.setDoOutput(true);
	            httpConn.setDoInput(true);
	            out = httpConn.getOutputStream();
	            out.write(buffer);
	            out.close();
	             
	            // Read the response and write it to standard out.
	            isr = new InputStreamReader(httpConn.getInputStream());
	            in = new BufferedReader(isr);
	             
	            while ((responseString = in.readLine()) != null) 
	            {
	                outputString = outputString + responseString;
	            }
	            System.out.println(outputString);
	            System.out.println("");
	              
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	        resp.sendRedirect(req.getContextPath() + "/modificationEns.jsp");
	}
	
}
