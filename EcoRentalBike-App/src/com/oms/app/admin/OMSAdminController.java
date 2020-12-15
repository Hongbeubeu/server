package com.oms.app.admin;

import javax.swing.JPanel;

import com.oms.bean.Core;
import com.oms.components.abstractdata.controller.ADataPageController;
import com.oms.components.core.bike.controller.AdminBikePageController;
import com.oms.components.core.ebike.controller.AdminEBikePageController;
import com.oms.components.core.twinbike.controller.AdminTwinBikePageController;
import com.oms.components.core.station.controller.AdminStationPageController;

public class OMSAdminController {

	public OMSAdminController() {
	}
	
	public JPanel getBikePage() {
		ADataPageController<Core> controller = new AdminBikePageController();
		return controller.getDataPagePane();
	}
	
	public JPanel getEBikePage() {
		ADataPageController<Core> controller = new AdminEBikePageController();
		return controller.getDataPagePane();
	}
	
	public JPanel getTwinBikePage() {
		ADataPageController<Core> controller = new AdminTwinBikePageController();
		return controller.getDataPagePane();
	}
	
	public JPanel getStationPage() {
		ADataPageController<Core> controller = new AdminStationPageController();
		return controller.getDataPagePane();
	}
}
