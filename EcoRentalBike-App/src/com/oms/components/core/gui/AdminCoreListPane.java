package com.oms.components.core.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.oms.bean.Core;
import com.oms.components.abstractdata.controller.ADataPageController;
import com.oms.components.abstractdata.controller.IDataManageController;
import com.oms.components.abstractdata.gui.ADataListPane;
import com.oms.components.abstractdata.gui.ADataSinglePane;
import com.oms.components.core.gui.BikeEditDialog;
import com.oms.components.core.controller.AdminCorePageController;

@SuppressWarnings("serial")
public class AdminCoreListPane extends ADataListPane<Core> {

	public AdminCoreListPane(ADataPageController<Core> controller) {
		this.controller = controller;
	}
	
	@Override
	public void decorateSinglePane(ADataSinglePane<Core> singlePane) {
		JButton button = new JButton("Edit");
		singlePane.addDataHandlingComponent(button);
		
		IDataManageController<Core> manageController = new IDataManageController<Core>() {
			@Override
			public void update(Core t) {
				if (controller instanceof AdminCorePageController) {
					Core newCore = ((AdminCorePageController) controller).updateCore(t);
					singlePane.updateData(newCore);
				}
			}

			@Override
			public void create(Core t) {
			}

			@Override
			public void read(Core t) {
			}

			@Override
			public void delete(Core t) {
				
			}
		};
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new BikeEditDialog(singlePane.getData(), manageController);
			}
		});	
	}
}
