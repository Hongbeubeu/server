package com.oms.components.core.station.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.bean.Station;
import com.oms.bean.Bike;
import com.oms.bean.Core;
import com.oms.components.abstractdata.controller.IDataManageController;
import com.oms.components.core.gui.CoreEditDialog;

public class StationEditDialog extends CoreEditDialog {

	private JTextField numOfBikesField;
	private JTextField numOfEBikesField;
	private JTextField numOfTwinBikesField;
	private JTextField numOfEmptyDocksField;
	
	public StationEditDialog(Core core, IDataManageController<Core> controller) {
		super(core, controller);
	}
	
	@Override
	public void buildControls() {
		super.buildControls();
		
		if (t instanceof Station) {
			Station station = (Station) t;
			
			int row = getLastRowIndex();
			JLabel numOfBikesLabel = new JLabel("NumberOfBikes");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(numOfBikesLabel, c);
			numOfBikesField = new JTextField(15);
			numOfBikesField.setText(Float.toString(station.getNumberOfBikes()));
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(numOfBikesField, c);
			
			
			row = getLastRowIndex();
			JLabel numOfEBikesLabel = new JLabel("NumberOfEBikes");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(numOfEBikesLabel, c);
			numOfEBikesField = new JTextField(15);
			numOfEBikesField.setText(Float.toString(station.getNumberOfEBikes()));
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(numOfEBikesField, c);
			
			row = getLastRowIndex();
			JLabel numOfTwinBikesLabel = new JLabel("NumberOfTwinBikes");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(numOfTwinBikesLabel, c);
			numOfTwinBikesField = new JTextField(15);
			numOfTwinBikesField.setText(Float.toString(station.getNumberOfTwinBikes()));
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(numOfTwinBikesField, c);
			
			row = getLastRowIndex();
			JLabel numOfEmptyDocksLabel = new JLabel("NumberOfEmptyDocks");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(numOfEmptyDocksLabel, c);
			numOfEmptyDocksField = new JTextField(15);
			numOfEmptyDocksField.setText(Float.toString(station.getNumberOfTwinBikes()));
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(numOfEmptyDocksField, c);
		}
	}

	@Override
	public Core getNewData() {
		super.getNewData();
		
		if (t instanceof Station) {
			Station station = (Station) t;
			
			station.setNumberOfBikes(Integer.parseInt(numOfBikesField.getText()));
			station.setNumberOfEBikes(Integer.parseInt(numOfEBikesField.getText()));
			station.setNumberOfTwinBikes(Integer.parseInt(numOfTwinBikesField.getText()));
			station.setNumberOfEmptyDocks(Integer.parseInt(numOfEmptyDocksField.getText()));
		}
		
		return t;
	}
	
}
