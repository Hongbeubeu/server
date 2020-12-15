package com.oms.components.core.twinbike.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.bean.TwinBike;
import com.oms.bean.Bike;
import com.oms.bean.Core;
import com.oms.components.core.gui.BikeEditDialog;
import com.oms.components.abstractdata.controller.IDataManageController;

public class TwinBikeEditDialog extends BikeEditDialog {

	public TwinBikeEditDialog(Core core, IDataManageController<Core> controller) {
		super(core, controller);
	}
}
