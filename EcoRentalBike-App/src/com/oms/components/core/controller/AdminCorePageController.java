package com.oms.components.core.controller;

import com.oms.bean.Core;
import com.oms.components.abstractdata.controller.ADataPageController;
import com.oms.components.abstractdata.gui.ADataListPane;
import com.oms.components.core.gui.AdminCoreListPane;

public abstract class AdminCorePageController extends ADataPageController<Core> {
	public AdminCorePageController() {
		super();
	}
	
	@Override
	public ADataListPane<Core> createListPane() {
		return new AdminCoreListPane(this);
	}
	
	public abstract Core updateCore(Core core);
	
	public abstract Core createCore(Core core);
}
