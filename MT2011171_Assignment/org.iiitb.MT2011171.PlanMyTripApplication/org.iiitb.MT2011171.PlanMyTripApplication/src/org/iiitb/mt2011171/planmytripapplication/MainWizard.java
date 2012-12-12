package org.iiitb.mt2011171.planmytripapplication;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.jface.wizard.Wizard;

import utils.MySqlConnection;


public class MainWizard extends Wizard {

  protected WizardOne oneForTripName;
  protected WizardTwo twoForTripDetails;
  protected WizardThree threeForTripFinalData;

  
  public MainWizard() {
    super();
    setNeedsProgressMonitor(true);
  }

  @Override
  public void addPages() {
	  oneForTripName = new WizardOne();
	  twoForTripDetails = new WizardTwo();
	  threeForTripFinalData = new WizardThree();
    addPage(oneForTripName);
    addPage(twoForTripDetails);
    addPage(threeForTripFinalData);
  }

  @Override
  public boolean performFinish() {
    // Print the result to the console
    System.out.println(oneForTripName.getTripName());
    System.out.println(twoForTripDetails.getSource());
    insertTripData();
    
    return true;
  }

private void insertTripData() {
	Statement stm = null;
	
	Connection con =  MySqlConnection.getConnection();
   
	try {
		stm = con.createStatement();
		stm.executeUpdate("insert into tripdetails (name,source,destination,via1,via2,via3,TripAgent,TripDate) values('"+oneForTripName.getTripName()+"','"+twoForTripDetails.getSource()+"','"+twoForTripDetails.getDestination()+"','"+twoForTripDetails.getViaOne()+"','"+twoForTripDetails.getViaTwo()+"','"+twoForTripDetails.getViaThree()+"','"+threeForTripFinalData.getAgentName()+"','"+threeForTripFinalData.getTravelDate()+"')");
		
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
} 