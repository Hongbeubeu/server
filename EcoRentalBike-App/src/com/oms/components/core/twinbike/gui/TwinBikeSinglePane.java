package com.oms.components.core.twinbike.gui;

import javax.swing.JLabel;

import com.oms.bean.TwinBike;
import com.oms.bean.Core;
import com.oms.bean.EBike;
import com.oms.components.core.gui.BikeSinglePane;

public class TwinBikeSinglePane extends BikeSinglePane {
	
	private JLabel labelType;
	
	public TwinBikeSinglePane() {
		super();
	}
	
	public TwinBikeSinglePane(Core core) {
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
		labelType = new JLabel();
		add(labelType, c);
		
	}
	
	@Override
	public void displayData() {
		super.displayData();
		
		if (t instanceof TwinBike) {
			TwinBike tbike = (TwinBike) t;
			
			labelType.setText("Type: twinbike ");
			
		}
	}
}
