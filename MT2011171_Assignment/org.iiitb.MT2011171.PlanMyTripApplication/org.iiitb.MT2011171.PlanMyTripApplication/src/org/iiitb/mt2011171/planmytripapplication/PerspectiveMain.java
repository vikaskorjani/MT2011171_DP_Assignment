package org.iiitb.mt2011171.planmytripapplication;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PerspectiveMain implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub
		layout.setEditorAreaVisible(false);
		layout.addView("org.iiitb.MT2011171.PlanMyTripApplication.mainView", 0, 0.5f, "");

	}

}
