package com.oms.components.core.station.gui;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.components.core.gui.CoreSearchPane;

@SuppressWarnings("serial")
public class StationSearchPane extends CoreSearchPane {

	private JTextField typeField;

	public StationSearchPane() {
		super();
	}
	
	@Override
	public void buildControls() {
		super.buildControls();
		
		
		JLabel typeLabel = new JLabel("Address");
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
			res.put("address", typeField.getText().trim());
		}
		
		return res;
	}
	
}
