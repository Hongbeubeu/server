package com.oms.components.core.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.bean.Core;
import com.oms.components.abstractdata.controller.IDataManageController;
import com.oms.components.abstractdata.gui.ADataAddDialog;

@SuppressWarnings("serial")
public class CoreAddDialog extends ADataAddDialog<Core>{
	
	private JTextField nameField;

	
	public CoreAddDialog(Core core, IDataManageController<Core> controller) {
		super(core, controller);
	}

	@Override
	public void buildControls() {
		int row = getLastRowIndex();
		JLabel titleLabel = new JLabel("Name");
		c.gridx = 0;
		c.gridy = row;
		getContentPane().add(titleLabel, c);
		nameField = new JTextField(15);
		add(titleLabel, c);
		c.gridx = 1;
		c.gridy = row;
		add(nameField, c);
		
	}

	@Override
	public Core createNewData() {
		t.setName(nameField.getText());
		
		return t;
	}
}

