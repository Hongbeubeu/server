package com.oms.components.core.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.bean.Core;
import com.oms.components.abstractdata.controller.IDataManageController;
import com.oms.components.abstractdata.gui.ADataEditDialog;

public class CoreEditDialog extends ADataEditDialog<Core> {

	private JTextField nameField;
	
	public CoreEditDialog(Core core, IDataManageController<Core> controller) {
		super(core, controller);
	}
	
	@Override
	public void buildControls() {
		int row = getLastRowIndex();
		JLabel nameLabel = new JLabel("Name");
		c.gridx = 0;
		c.gridy = row;
		getContentPane().add(nameLabel, c);
		nameField = new JTextField(15);
		nameField.setText(t.getName());
		c.gridx = 1;
		c.gridy = row;
		getContentPane().add(nameField, c);
		
	
	}

	@Override
	public Core getNewData() {
		t.setName(nameField.getText());
		return t;
	}
}
