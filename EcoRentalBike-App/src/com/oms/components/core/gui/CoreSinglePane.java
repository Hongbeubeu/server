package com.oms.components.core.gui;

import javax.swing.JLabel;
import com.oms.bean.Core;
import com.oms.components.abstractdata.gui.ADataSinglePane;

@SuppressWarnings("serial")
public class CoreSinglePane extends ADataSinglePane<Core> {
	
	private JLabel labelName;
	
	public CoreSinglePane() {
		super();
	}
	
	public CoreSinglePane(Core core) {
		this();
		this.t = core;
		
		displayData();
	}
	
	@Override
	public void buildControls() {
		super.buildControls();
		
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelName = new JLabel();
		add(labelName, c);
		

	}
	
	
	@Override
	public void displayData() {
		labelName.setText("Name: " + t.getName());
	}
}
