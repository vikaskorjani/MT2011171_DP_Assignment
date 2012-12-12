import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.iiitb.mt2011171.planmytripapplication.MainWizard;



public class MyTripAddition extends AbstractHandler {
	WizardDialog wizardDialog;
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		wizardDialog = new WizardDialog(HandlerUtil.getActiveShell(event),new MainWizard());
	    if (wizardDialog.open() == Window.OK) {
	      System.out.println("Ok pressed");
	    } else {
	      System.out.println("Cancel pressed");
	       }
	    return wizardDialog;
	}	
}
