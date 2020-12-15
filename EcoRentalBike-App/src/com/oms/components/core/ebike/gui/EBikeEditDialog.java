package com.oms.components.core.ebike.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.bean.EBike;
import com.oms.bean.Bike;
import com.oms.bean.Core;
import com.oms.components.core.gui.BikeEditDialog;
import com.oms.components.abstractdata.controller.IDataManageController;

public class EBikeEditDialog extends BikeEditDialog {

	private JTextField loadCycleField;
	private JTextField batteryField;
	private JTextField timeRemainingField;
	
	public EBikeEditDialog(Core core, IDataManageController<Core> controller) {
		super(core, controller);
	}
	
	@Override
	public void buildControls() {
		super.buildControls();
		
		if (t instanceof EBike) {
			EBike ebike = (EBike) t;
			
			int row = getLastRowIndex();
			JLabel loadCycleLabel = new JLabel("LoadCycle: ");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(loadCycleLabel, c);
			loadCycleField = new JTextField(15);
			loadCycleField.setText(Float.toString(ebike.getLoadCycles()));
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(loadCycleField, c);
			
			
			row = getLastRowIndex();
			JLabel batteryLabel = new JLabel("BatteryPercentage: ");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(batteryLabel, c);
			batteryField = new JTextField(15);
			batteryField.setText(Float.toString(ebike.getBatteryPercentage()));
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(batteryField, c);
			
			row = getLastRowIndex();
			JLabel timeLabel = new JLabel("TimeRemaining: ");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(timeLabel, c);
			timeRemainingField = new JTextField(15);
			timeRemainingField.setText(Float.toString(ebike.getBatteryPercentage()));
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(timeRemainingField, c);
		}
	}

	@Override
	public Core getNewData() {
		super.getNewData();
		
		if (t instanceof EBike) {
			EBike ebike = (EBike) t;
			
			ebike.setLoadCycles(Integer.parseInt(loadCycleField.getText()));
			ebike.setBatteryPercentage(Float.parseFloat(batteryField.getText()));
			ebike.setEstimatedUsageTimeRemaining(Integer.parseInt(timeRemainingField.getText()));
		}
		
		return t;
	}
}
