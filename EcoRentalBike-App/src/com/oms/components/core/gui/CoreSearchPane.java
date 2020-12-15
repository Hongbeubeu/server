package com.oms.components.core.gui;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.oms.components.abstractdata.gui.ADataSearchPane;

@SuppressWarnings("serial")
public class CoreSearchPane extends ADataSearchPane {

	private JTextField nameField;
	
	public CoreSearchPane() {
		super();
	}
	
	@Override
	public void buildControls() {
		JLabel nameLabel = new JLabel("Name");
		nameField = new JTextField(15);
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(nameLabel, c);
		c.gridx = 1;
		c.gridy = row;
		add(nameField, c);

	}
	
	@Override
	public Map<String, String> getQueryParams() {
		Map<String, String> res = super.getQueryParams();
		
		if (!nameField.getText().trim().equals("")) {
			res.put("name", nameField.getText().trim());
		}
		
		return res;
	}
	
}
