package com.oms.components.core.station.controller;

import java.util.List;
import java.util.Map;

import com.oms.bean.Station;
import com.oms.bean.Core;
import com.oms.components.core.station.gui.StationSearchPane;
import com.oms.components.core.station.gui.StationSinglePane;
import com.oms.serverapi.CoreApi;
import com.oms.components.core.controller.AdminCorePageController;
import com.oms.components.core.gui.CoreSearchPane;
import com.oms.components.core.gui.CoreSinglePane;

public class AdminStationPageController extends AdminCorePageController {

	
	@Override
	public List<? extends Core> search(Map<String, String> searchParams) {
		return new CoreApi().getStations(searchParams);
	}
	
	@Override
	public CoreSinglePane createSinglePane() {
		return new StationSinglePane();
	}
	
	@Override
	public CoreSearchPane createSearchPane() {
		return new StationSearchPane();
	}
	
	
	@Override
	public Core updateCore(Core core) {
		return new CoreApi().updateStations((Station) core);
	}
	
	public Core createCore(Core core) {
		return new CoreApi().createStation((Station) core);
	}
	
}
