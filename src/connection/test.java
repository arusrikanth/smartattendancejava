package connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Random;

import ServertMarkin.LoginServlet;

public class test {
	public String GetMacid()
	{
//		StringBuilder sb = new StringBuilder();
//		InetAddress ip=null;
//        try {
//
//            ip = InetAddress.getLocalHost();
//            System.out.println("Current IP address : " + ip.getHostAddress());
//
//            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
//
//            byte[] mac = network.getHardwareAddress();
//
//            System.out.print("Current MAC address : ");
//
//            
//            for (int i = 0; i < mac.length; i++) {
//                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? ":" : ""));
//            }
//           
//            System.out.println(sb.toString());
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//		 
//        return ip.getHostAddress();
		
//		InetAddress my_localhost = null;
//		try {
//			my_localhost = InetAddress.getLocalHost();
//		} catch (UnknownHostException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	      System.out.println("The IP Address of client is : " + (my_localhost.getHostAddress()).trim());
//	      String my_system_address = "";
//	      try{
//	         URL my_url = new URL("http://bot.whatismyipaddress.com");
//	         BufferedReader my_br = new BufferedReader(new
//	         InputStreamReader(my_url.openStream()));
//	         my_system_address = my_br.readLine().trim();
//	         System.out.println("The IP Address of Mobile is : " + my_system_address);
//	      }
//	      catch (Exception e){
//	         my_system_address = "Cannot Execute Properly";
//	      }
		LoginServlet f=new LoginServlet();
		
	      return f.username3;
		
	}
	

	
	
	

}
