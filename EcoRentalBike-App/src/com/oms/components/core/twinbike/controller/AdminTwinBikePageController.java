package com.oms.components.core.twinbike.controller;

import java.util.List;
import java.util.Map;

import com.oms.bean.TwinBike;
import com.oms.bean.Core;
import com.oms.components.core.twinbike.gui.TwinBikeSearchPane;
import com.oms.components.core.twinbike.gui.TwinBikeSinglePane;
import com.oms.components.core.controller.AdminCorePageController;
import com.oms.components.core.gui.CoreSearchPane;
import com.oms.components.core.gui.CoreSinglePane;
import com.oms.serverapi.CoreApi;

public class AdminTwinBikePageController extends AdminCorePageController {

	@Override
	public List<? extends Core> search(Map<String, String> searchParams) {
		return new CoreApi().getTwinBikes(searchParams);
	}
	
	@Override
	public CoreSinglePane createSinglePane() {
		return new TwinBikeSinglePane();
	}
	
	@Override
	public CoreSearchPane createSearchPane() {
		return new TwinBikeSearchPane();
	}
	
	
	@Override
	public Core updateCore(Core core) {
		return new CoreApi().updateTwinBikes((TwinBike) core);
	}
	
	public Core createCore(Core core) {
		return new CoreApi().createTwinBike((TwinBike) core);
	}
	
}
