package org.iiitb.mt2011171.planmytripapplication;



import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class WizardTwo extends WizardPage {
  private Text source;
  public String getSource() {
	return source.getText();
}

public String getDestination() {
	return destination.getText();
}

public String getViaOne() {
	return viaOne.getText();
}

public String getViaTwo() {
	return viaTwo.getText();
}

public String getViaThree() {
	return viaThree.getText();
}

private Text destination;
  private Text viaOne;
  private Text viaTwo;
  private Text viaThree;
  
  private Composite container;

  public WizardTwo() {
    super("Trip Details");
    setTitle("Trip Details");
    setDescription("Trip Details to be Entered here for further Processing");
    setControl(source);
  }

  @Override
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NULL);
    GridLayout layout = new GridLayout();
    container.setLayout(layout);
    layout.numColumns = 2;
    Label nameOfSource = new Label(container, SWT.NULL);
    nameOfSource.setText("Enter Source Location :");

    source = new Text(container, SWT.BORDER | SWT.SINGLE);
    source.setText("");

    
    Label nameOfDest = new Label(container, SWT.NULL);
    nameOfDest.setText("Enter Destination Location :");

    destination = new Text(container, SWT.BORDER | SWT.SINGLE);
    destination.setText("");
    


    Label viaName = new Label(container, SWT.NULL);
    viaName.setText("VIA");

    viaOne = new Text(container, SWT.BORDER | SWT.SINGLE);
    viaOne.setText("");
    


    Label viaName2 = new Label(container, SWT.NULL);
    viaName2.setText("");

    viaTwo = new Text(container, SWT.BORDER | SWT.SINGLE);
    viaTwo.setText("");
    

    Label viaName3 = new Label(container, SWT.NULL);
    viaName3.setText("");

    viaThree = new Text(container, SWT.BORDER | SWT.SINGLE);
    viaThree.setText("");

    
    
    
    
    
    viaOne.addKeyListener(new KeyListener() {

    	@Override
      public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
    		
      }

      
    	  
        
            	
    	
    	@Override

      
      
      public void keyReleased(KeyEvent e) {
        if (!source.getText().isEmpty() && !destination.getText().isEmpty() && !viaOne.getText().isEmpty()) {
          setPageComplete(true);
        }
      }

    });
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    source.setLayoutData(gd);
    destination.setLayoutData(gd);
    viaOne.setLayoutData(gd);
    viaTwo.setLayoutData(gd);
    viaThree.setLayoutData(gd);
    //Label labelCheck = new Label(container, SWT.NONE);
    //labelCheck.setText("This is a check");
    //Button check = new Button(container, SWT.CHECK);
    //check.setSelection(true);
    // Required to avoid an error in the system	
    setControl(container);
    setPageComplete(false);
  }

 
} 