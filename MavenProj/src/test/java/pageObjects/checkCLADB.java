package pageObjects;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import stepDefinitions.steps;

public class checkCLADB {
	PlaceP550 pl1;
	steps st1;

	static String orderidcheck;	
	static String neworder;
	Connection conn;
		
public void checkorderInDB(String env1) throws SQLException, InterruptedException{
	/*JFrame frame;
	 ResultSet result = null;
	
	System.out.println("Loading Oracle JDBC driver Now........");
	  Thread.sleep(40000);
	    try {
	    	
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    System.out.println("Oracle JDBC driver loaded ok.");

	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.205.10.163:1521:clauat","sa","g0ldf1nger");
	    System.out.println("DB Connected Successfuly");
	    
	    //Thread.sleep(100000);
	    Statement stmt = con.createStatement();
	    orderidcheck=pl1.neworder;
	    System.out.println("Order Id Received is    "+orderidcheck);

	    Thread.sleep(30000);
	    result = stmt.executeQuery("select x_ord_proc_status from table_contr_itm where x_order_no=" + "\'"+orderidcheck+ "\'");
	       
	     while(result.next()){
		   System.out.println("Entering into While loop");
	        String orderstat = result.getString("x_ord_proc_status");
	        System.out.println("orderStatus: " + orderstat);
	        Thread.sleep(3000);
	        frame = new JFrame();
	    	//frame.setSize(300, 300);
	    	frame.setVisible(true);	
	    	frame.setLocationRelativeTo(null);
	       JOptionPane.showMessageDialog(frame,"Status of    "+ "\'"+orderidcheck+ "\'"+"  is :   " +orderstat);
	        
	    }//while
	  con.close(); */
	
///=======================================================================================//
	JFrame frame;
	ResultSet result=null;
	
	String orderstat;
	String orderstat2;

	System.out.println("Loading Oracle JDBC driver Now and Environment is ........"+env1);
	
	    try {
	    	
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	 if(env1.equals("uat"))
	 {
	    conn=DriverManager.getConnection("jdbc:oracle:thin:@10.205.10.163:1521:clauat","sa","g0ldf1nger");
	    System.out.println("UAT DB Connected Successfuly");
	 }
	 else if(env1.equals("int"))
	 {
		    conn=DriverManager.getConnection("jdbc:oracle:thin:@10.205.10.164:1521:claint","sa","logint");
		    System.out.println("INT DB Connected Successfuly");
	} 
	    
	    Thread.sleep(3000);

	    Statement stmt = conn.createStatement();
	    orderidcheck=pl1.neworder;
	    System.out.println("Order Id Received is    "+orderidcheck);
	    Thread.sleep(10000);		
	    result = stmt.executeQuery("select x_active ,x_ord_proc_status from table_contr_itm where x_order_no=" + "\'"+orderidcheck+ "\'");
	        while(result.next()){
			        System.out.println("Entering into While loop");
			        orderstat = result.getString("x_ord_proc_status");
			        orderstat2= result.getString("X_ACTIVE");
			       // System.out.println("Processing  Status   " + orderstat);
			        System.out.println("Order Status is  " +orderstat2);
		    
	        if(!orderstat2.equals("Active"))
	        {
	        	for(int i=0;i<4;i++){ 
	        		Thread.sleep(3000);
	        		result = stmt.executeQuery("select x_active ,x_ord_proc_status from table_contr_itm where x_order_no=" + "\'"+orderidcheck+ "\'");
	     	    while(result.next()){
				   System.out.println("Entering into While loop"+i);
			        orderstat = result.getString("x_ord_proc_status");
			        orderstat2= result.getString("X_ACTIVE");
			      //  System.out.println("Processing Status   " + orderstat);
			        System.out.println("Order Status is  " +orderstat2);
			        if (orderstat2.equals("Active"))
			        {
			        	System.out.println("Order is completed  successfullly");
			        //	frame = new JFrame();
				    	//frame.setSize(300, 300);
				    	///frame.setVisible(true);	
				    	//frame.setLocationRelativeTo(null);
				     //  JOptionPane.showMessageDialog(frame,"Order    "+ "\'"+orderidcheck+ "\'"+"  is Successful");
			        	break;
			        }
			        else if(i==3)
			        {
			        	System.out.println("Order is not successful");
			        	//frame = new JFrame();
				    	//frame.setSize(300, 300);
				    	//frame.setVisible(true);	
				    	//frame.setLocationRelativeTo(null);
				       //JOptionPane.showMessageDialog(frame,"Order    "+ "\'"+orderidcheck+ "\'"+"  is Not Completed");
				       Assert.fail ("ORDER FAILLED");
			        	break;
			        }
	     	        }//while2
	        }//for
	        	   }
	        else{
	        	System.out.println("Order is completed  successfullly");
	        	//frame = new JFrame();
		    	//frame.setSize(300, 300);
		    	/*frame.setVisible(true);	
		    	frame.setLocationRelativeTo(null);
		       JOptionPane.showMessageDialog(frame,"Order    "+ "\'"+orderidcheck+ "\'"+"  is Successful");*/
	        	break;
	        	
	            }
	        }
	        conn.close();
	        
	        
       }
}


	    
	    

	   

	    


