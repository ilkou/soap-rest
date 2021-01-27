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

public class ModificationServletMod extends HttpServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String wsURL = "http://localhost:9998/module";
	        URL url = null;
	        URLConnection connection = null;
	        HttpURLConnection httpConn = null;
	        String responseString = null;
	        String outputString="";
	        OutputStream out = null;
	        InputStreamReader isr = null;
	        BufferedReader in = null;
	         
	        String xmlInput = 
	        		"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:mod=\"http://module.metiers.soap.ensakh.com/\">\n" + 
	    	        "   <soapenv:Header/>\n" + 
	    	        "   <soapenv:Body>\n" + 
	    	        "      <mod:modification>\n" + 
	    	        "         <!--Optional:-->\n" + 
	    	        "         <arg0>\n" + 
	    	        "            <!--Optional:-->\n" + 
	    	        "            <id>" + req.getParameter("id") + "</id>\n" + 
	    	        "            <!--Optional:-->\n" + 
	    	        "            <nom>" + req.getParameter("nom") + "</nom>\n" + 
	    	        "            <!--Optional:-->\n" + 
	    	        "            <desc>" + req.getParameter("desc") + "</desc>\n" + 
	    	        "            <!--Optional:-->\n" + 
	    	        "            <cni>" + req.getParameter("cni") + "</cni>\n" + 
	    	        "         </arg0>\n" + 
	    	        "      </mod:modification>\n" + 
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
	        resp.sendRedirect(req.getContextPath() + "/modificationMod.jsp");
	}
}
