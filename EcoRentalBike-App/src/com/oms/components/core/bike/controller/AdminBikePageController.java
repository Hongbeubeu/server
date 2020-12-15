package com.oms.components.core.bike.controller;

import java.util.List;
import java.util.Map;

import com.oms.bean.Bike;
import com.oms.bean.Core;
import com.oms.components.core.gui.BikeSearchPane;
import com.oms.components.core.gui.BikeSinglePane;
import com.oms.components.core.controller.AdminCorePageController;
import com.oms.components.core.gui.CoreSearchPane;
import com.oms.components.core.gui.CoreSinglePane;

import com.oms.serverapi.CoreApi;

public class AdminBikePageController extends AdminCorePageController {

	@Override
	public List<? extends Core> search(Map<String, String> searchParams) {
		return new CoreApi().getBikes(searchParams);
	}
	
	@Override
	public CoreSinglePane createSinglePane() {
		return new BikeSinglePane();
	}
	
	@Override
	public CoreSearchPane createSearchPane() {
		return new BikeSearchPane();
	}
	
	
	@Override
	public Core updateCore(Core core) {
		return new CoreApi().updateBikes((Bike) core);
	}
	
	public Core createCore(Core core) {
		return new CoreApi().createBike((Bike) core);
	}
}
