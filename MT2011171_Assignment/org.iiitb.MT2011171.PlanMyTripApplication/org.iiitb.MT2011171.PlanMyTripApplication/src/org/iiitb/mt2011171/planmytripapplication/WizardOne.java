package org.iiitb.mt2011171.planmytripapplication;



import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class WizardOne extends WizardPage {
  private Text tripName;
  private Composite container;

  public WizardOne() {
    super("Plan Your Trip");
    setTitle("Plan Your Trip");
    setDescription("Trip Name to be entered for beginning your planning");
  }

  @Override
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NULL);
    GridLayout layout = new GridLayout();
    container.setLayout(layout);
    layout.numColumns = 2;
    Label enterTripName = new Label(container, SWT.NULL);
    enterTripName.setText("Please Enter Trip Name :");

    tripName = new Text(container, SWT.BORDER | SWT.SINGLE);
    tripName.setText("");
    tripName.addKeyListener(new KeyListener() {

      @Override
      public void keyPressed(KeyEvent e) {
      }

      @Override
      public void keyReleased(KeyEvent e) {
        if (!tripName.getText().isEmpty()) {
          setPageComplete(true);

        }
      }

    });
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    tripName.setLayoutData(gd);
    // Required to avoid an error in the system
    setControl(container);
    setPageComplete(false);

  }

  public String getTripName() {
    return tripName.getText();
  }
} 