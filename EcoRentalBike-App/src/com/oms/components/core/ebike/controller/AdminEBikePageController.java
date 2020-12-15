package com.oms.components.core.ebike.controller;

import java.util.List;
import java.util.Map;

import com.oms.bean.EBike;
import com.oms.bean.Core;
import com.oms.components.core.ebike.gui.EBikeSearchPane;
import com.oms.components.core.ebike.gui.EBikeSinglePane;
import com.oms.components.core.controller.AdminCorePageController;
import com.oms.components.core.gui.CoreSearchPane;
import com.oms.components.core.gui.CoreSinglePane;

import com.oms.serverapi.CoreApi;

public class AdminEBikePageController extends AdminCorePageController {

	@Override
	public List<? extends Core> search(Map<String, String> searchParams) {
		return new CoreApi().getEBikes(searchParams);
	}
	
	@Override
	public CoreSinglePane createSinglePane() {
		return new EBikeSinglePane();
	}
	
	@Override
	public CoreSearchPane createSearchPane() {
		return new EBikeSearchPane();
	}
	
	
	@Override
	public Core updateCore(Core core) {
		return new CoreApi().updateEBikes((EBike) core);
	}
	
	public Core createCore(Core core) {
		return new CoreApi().createEBike((EBike) core);
	}
	
}
