package com.oms.components.core.station.gui;

import javax.swing.JLabel;

import com.oms.bean.Bike;
import com.oms.bean.Core;
import com.oms.bean.Station;
import com.oms.components.core.gui.CoreSinglePane;

public class StationSinglePane extends CoreSinglePane {
	
	private JLabel labelAddress;
	private JLabel labelNumberOfBikes;
	private JLabel labelNumberOfEBikes;
	private JLabel labelnumberOfTwinBikes;
	private JLabel labelNumberOfEmptyDocks;
	
	
	public StationSinglePane() {
		super();
	}
	
	public StationSinglePane(Core core) {
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
		labelAddress = new JLabel();
		add(labelAddress, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNumberOfBikes = new JLabel();
		add(labelNumberOfBikes, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNumberOfEBikes = new JLabel();
		add(labelNumberOfEBikes, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelnumberOfTwinBikes = new JLabel();
		add(labelnumberOfTwinBikes, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNumberOfEmptyDocks = new JLabel();
		add(labelNumberOfEmptyDocks, c);

	}
	
	
	@Override
	public void displayData() {
		
		super.displayData();
		
		if(t instanceof Station) {
			Station station = (Station) t;
			labelAddress.setText("Address: " + station.getAddress() );
			labelNumberOfBikes.setText("NumberOfBikes: " + station.getNumberOfBikes());
			labelNumberOfEBikes.setText("NumberOfEBikes: " + station.getNumberOfEBikes());
			labelnumberOfTwinBikes.setText("NumberOfTwinBikes: " + station.getNumberOfTwinBikes());
			labelNumberOfEmptyDocks.setText("EmptyDocks: " + station.getNumberOfEmptyDocks() );
		}
		
	}
}
