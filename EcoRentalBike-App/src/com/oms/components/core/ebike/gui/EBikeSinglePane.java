package com.oms.components.core.ebike.gui;

import javax.swing.JLabel;

import com.oms.bean.EBike;
import com.oms.bean.Core;
import com.oms.components.core.gui.BikeSinglePane;

public class EBikeSinglePane extends BikeSinglePane {

	private JLabel labelBattery;
	private JLabel labelLoadCycle;
	private JLabel labelTimeRemaining;
	
	public EBikeSinglePane() {
		super();
	}
	
	public EBikeSinglePane(Core core) {
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
		labelBattery = new JLabel();
		add(labelBattery, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelLoadCycle = new JLabel();
		add(labelLoadCycle, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelTimeRemaining = new JLabel();
		add(labelTimeRemaining, c);
	}
	
	@Override
	public void displayData() {
		super.displayData();
		
		if (t instanceof EBike) {
			EBike ebike = (EBike) t;
			
			labelBattery.setText("BatteryPercentage: " + ebike.getEstimatedUsageTimeRemaining());
			labelTimeRemaining.setText("EstimatedUsageTimeRemaining: " + ebike.getEstimatedUsageTimeRemaining());
			labelLoadCycle.setText("LoadCycles: " + ebike.getLoadCycles());

		}
	}
}
