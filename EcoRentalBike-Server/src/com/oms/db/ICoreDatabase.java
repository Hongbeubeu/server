package com.oms.db;

import java.util.ArrayList;

import com.oms.bean.Core;

public interface ICoreDatabase {
	public ArrayList<Core> searchCore(Core core);
	public Core updateCore(Core core);
}
