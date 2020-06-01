package pageObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import org.junit.Assert;

import stepDefinitions.steps;

public class HVcheckDBstatus {
	Place510HV HvDb1;
	steps st1;

	static String orderidcheck;	
	static String neworder;
	Connection conn;
		
public void HVorderStatusInDB(String env1) throws SQLException, InterruptedException{
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
	ResultSet result=null;
	
	String procStatus;
	String procStage;
	String xactive;

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
	    
	    Thread.sleep(25000);

	    Statement stmt = conn.createStatement();
	    orderidcheck=HvDb1.neworderhv;
	    System.out.println("Order Id Received is    "+orderidcheck);
	    if(orderidcheck == null)
	    {
	    	System.out.println("Order is not generated");
	    	Assert.fail ("ORDER FAILLED");
	    	conn.close();
	    	
	    }
	    
	    Thread.sleep(10000);		
	    result = stmt.executeQuery("select x_ord_proc_stage,X_ORD_PROC_STATUS,X_Active from table_contr_itm where x_order_no=" + "\'"+orderidcheck+ "\'");
	        while(result.next()){
			        System.out.println("Entering into While loop");
			        procStatus = result.getString("X_ORD_PROC_STATUS");
			        procStage= result.getString("x_ord_proc_stage");
			        xactive = result.getString("X_Active");
			        
			       // System.out.println("Processing  Status   " + orderstat);
			        System.out.println("Order Status is  " +xactive);
			        System.out.println("Order Stages   " +procStage);
			        System.out.println("Process Status is  " +procStatus);
		    
	        if(!xactive.equals("Active"))
	        {
	        	for(int i=0;i<20;i++){ 
	        		Thread.sleep(90000);
	        		result = stmt.executeQuery("select x_ord_proc_stage,X_ORD_PROC_STATUS,X_Active from table_contr_itm where x_order_no=" + "\'"+orderidcheck+ "\'");
	     	    while(result.next()){
				   System.out.println("Entering into While loop"+i);
				   procStatus = result.getString("X_ORD_PROC_STATUS");
			        procStage= result.getString("x_ord_proc_stage");
			        xactive = result.getString("X_Active");
			        
			       // System.out.println("Processing  Status   " + orderstat);
			        System.out.println("Order Status is  " +xactive);
			        System.out.println("Order Stages   " +procStage);
			        System.out.println("Process Status is  " +procStatus);
			        
			        if(procStage.equals("Portal Function Group") && procStatus.equals("Completed") && xactive.equals("In-Provisioning"))
			        {
			        	
			        	System.out.println("Work IN Progress");
			        	
			        }
			        	
			        if (xactive.equals("Active"))
			        {
			        	System.out.println("Order is completed  successfullly");
			        //	frame = new JFrame();
				    	//frame.setSize(300, 300);
				    	///frame.setVisible(true);	
				    	//frame.setLocationRelativeTo(null);
				     //  JOptionPane.showMessageDialog(frame,"Order    "+ "\'"+orderidcheck+ "\'"+"  is Successful");
			        	break;
			        }
			        else if(i==19)
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
