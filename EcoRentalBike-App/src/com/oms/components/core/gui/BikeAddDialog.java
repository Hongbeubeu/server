package com.oms.components.core.gui;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.bean.Bike;
import com.oms.bean.Core;
import com.oms.components.abstractdata.controller.IDataManageController;

@SuppressWarnings("serial")
public class BikeAddDialog extends CoreAddDialog {

	private JTextField typeField;
	private JTextField weightField;
	private JTextField licenseField;
	private JTextField manuafacrturingField;
	private JTextField producerField;
	private JTextField costField;
	
	public BikeAddDialog(Core core, IDataManageController<Core> controller) {
		super(core, controller);
	}
	
	public void buildControls() {
		super.buildControls();
		
		if (t instanceof Bike) {
			Bike bike = (Bike) t;
			
			int row = getLastRowIndex();
			JLabel typeLabel = new JLabel("Type");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(typeLabel, c);
			typeField = new JTextField(15);
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(typeField, c);
			
			
			row = getLastRowIndex();
			JLabel weightLabel = new JLabel("Weight");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(weightLabel, c);
			weightField = new JTextField(15);
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(weightField, c);
			
			
			row = getLastRowIndex();
			JLabel licenseLabel = new JLabel("License Plate");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(licenseLabel, c);
			licenseField = new JTextField(15);
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(licenseField, c);
			
			
			row = getLastRowIndex();
			JLabel manuafacrturingLabel = new JLabel("Manuafacrturing Date");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(manuafacrturingLabel, c);
			weightField = new JTextField(15);
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(manuafacrturingField, c);
			
			row = getLastRowIndex();
			JLabel producerLabel = new JLabel("Producer");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(producerLabel, c);
			weightField = new JTextField(15);
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(producerField, c);
			
			row = getLastRowIndex();
			JLabel costLabel = new JLabel("Cost");
			c.gridx = 0;
			c.gridy = row;
			getContentPane().add(costLabel, c);
			weightField = new JTextField(15);
			c.gridx = 1;
			c.gridy = row;
			getContentPane().add(costField, c);
			
			
		}
	}

	@Override
	public Core createNewData() {
		super.createNewData();
		
		if (t instanceof Bike) {
			Bike bike = (Bike) t;

			bike.setCost(Integer.parseInt(costField.getText()));
			bike.setWeight(Float.parseFloat(weightField.getText()));
			bike.setLicensePlate(licenseField.getText());
			bike.setProducer(producerField.getText());
		}
		
		return t;
	}
}
