package com.oms.components.core.gui;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class BikeSearchPane extends CoreSearchPane {
	
	private JTextField typeField;

	public BikeSearchPane() {
		super();
	}
	
	@Override
	public void buildControls() {
		super.buildControls();
		
		
		JLabel typeLabel = new JLabel("Type");
		typeField = new JTextField(15);
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(typeLabel, c);
		c.gridx = 1;
		c.gridy = row;
		add(typeField, c);
	}

	@Override
	public Map<String, String> getQueryParams() {
		Map<String, String> res = super.getQueryParams();
		
		if (!typeField.getText().trim().equals("")) {
			res.put("type", typeField.getText().trim());
		}
		
		return res;
	}
}
