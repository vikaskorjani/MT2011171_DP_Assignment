package org.iiitb.mt2011171.planmytripapplication;



import java.util.Vector;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class WizardThree extends WizardPage {
  
 Vector<String> languages = new Vector<String>();
  ListViewer listviewer;
  DateTime date;
  String agentName;
  public String getAgentName() {
	return agentName;
}

public String getTravelDate() {
	return travelDate;
}

String travelDate;
  boolean flag;
  
  private Composite container;

  public WizardThree() {
    super("Agent Details");
    setTitle("Agent Details");
    setDescription("Agent and Date of Trip Details");
    
  }

  @Override
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NULL);
    GridLayout layout = new GridLayout();
    container.setLayout(layout);
    layout.numColumns = 2;
    Label agentname = new Label(container, SWT.NULL);
    agentname.setText("Select the Agent Name :");

    
    languages.add("Go Indigo");
    languages.add("Yatra.com");
    languages.add("IRCTC");
    languages.add("Make My Trip");
    
    
    listviewer = new ListViewer(container,SWT.SINGLE);
    
    listviewer.setContentProvider(new ArrayContentProvider());  
    
  listviewer.setInput(languages);

  GridData griddata = new GridData(GridData.FILL_HORIZONTAL);
  griddata.minimumWidth = 50;
  
  listviewer.getControl().setLayoutData(griddata);
  
  

  
  
  
    
  listviewer.setSorter(new ViewerSorter() {
      public int compare(
         Viewer viewer, Object p1, Object p2) {
         return (p1.toString().compareToIgnoreCase(p2.toString()));
      }
   });
  	
  listviewer.addSelectionChangedListener(
	         new ISelectionChangedListener() {
	         public void selectionChanged(	        		 
	        		 SelectionChangedEvent event) {

	        	flag = true;
	               
	        	 
	        	 IStructuredSelection selection =
	               (IStructuredSelection) event.getSelection();
	            System.out.println("Selected: "
	               + selection.getFirstElement());
	            agentName=selection.getFirstElement()+"";
	         }
	      });
	      
  Label setDate = new Label(container, SWT.NULL);
  setDate.setText("Select Date");
    date = new DateTime(container,SWT.CALENDAR);
    
    
    
    
    
    date.addSelectionListener (
    		new SelectionAdapter () {
        public void widgetSelected (SelectionEvent e) {
         
          System.out.println(date.getYear());
         travelDate=date.getDay()+"/"+(date.getMonth()+1)+"/"+date.getYear();
          if (date.getEnabled()&&flag) {
              setPageComplete(true);

            }
                    
        }
    }); 
 
    setControl(container);
    setPageComplete(false);
  }

  
} 