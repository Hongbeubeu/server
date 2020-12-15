package com.oms.components.core.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.bean.Bike;
import com.oms.bean.Core;
import com.oms.components.abstractdata.controller.IDataManageController;

@SuppressWarnings("serial")
public class BikeEditDialog extends CoreEditDialog {

	private JTextField costField;
	private JTextField weightField;
	
	public BikeEditDialog(Core core, IDataManageController<Core> controller) {
		super(core, controller);
	}

	@Override
	public void buildControls() {
		super.buildControls();
		
		if (t instanceof Bike) {
			Bike bike = (Bike) t;
			
			int row = getLastRowIndex();
			JLabel publisherLabel = new JLabel("Cost");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(publisherLabel, c);
			costField = new JTextField(15);
			costField.setText(Float.toString(bike.getCost()));
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(costField, c);
			
			
			row = getLastRowIndex();
			JLabel languageLabel = new JLabel("Weight");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(languageLabel, c);
			weightField = new JTextField(15);
			weightField.setText(Float.toString(bike.getWeight()));
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(weightField, c);
		}
	}

	@Override
	public Core getNewData() {
		super.getNewData();
		
		if (t instanceof Bike) {
			Bike bike = (Bike) t;
			
			bike.setCost(Float.parseFloat(costField.getText()));
			bike.setWeight(Float.parseFloat(weightField.getText()));
		}
		
		return t;
	}
	
}
