package com.oms.components.core.gui;

import javax.swing.JLabel;

import com.oms.bean.Bike;
import com.oms.bean.Core;
import com.oms.components.abstractdata.gui.ADataSinglePane;

@SuppressWarnings("serial")
public class BikeSinglePane extends CoreSinglePane {
	
	private JLabel labelWeight;
	private JLabel labelManuafacrturing;
	private JLabel labelCost;
	private JLabel labelLicense;
	private JLabel labelProducer;
	
	public BikeSinglePane() {
		super();
	}
	
	public BikeSinglePane(Core core) {
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
		labelWeight = new JLabel();
		add(labelWeight, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelManuafacrturing = new JLabel();
		add(labelManuafacrturing, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelCost = new JLabel();
		add(labelCost, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelWeight = new JLabel();
		add(labelWeight, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelProducer = new JLabel();
		add(labelProducer, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelLicense = new JLabel();
		add(labelLicense, c);
	}
	
	@Override
	public void displayData() {
		super.displayData();
		
		if (t instanceof Bike) {
			Bike bike = (Bike) t;
			
			labelWeight.setText("Weight: " + bike.getWeight());
			labelManuafacrturing.setText("Manuafacrturing: " + bike.getManufacturingDate());
			labelCost.setText("Cost: " + bike.getCost());
			labelLicense.setText("License: " + bike.getLicensePlate());
			labelProducer.setText("Producer: " + bike.getProducer());
		}
	}
}
