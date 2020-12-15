package com.oms.db;

import java.util.ArrayList;

import com.oms.bean.Core;
import com.oms.db.seed.EcoBikeRentalSeed;

public class JsonCoreDatabase implements ICoreDatabase{
	private static ICoreDatabase singleton = new JsonCoreDatabase();
	
	private ArrayList<Core> cores = EcoBikeRentalSeed.singleton().getCores();
	
	private JsonCoreDatabase() {
	}
	
	public static ICoreDatabase singleton() {
		return singleton;
	}

	@Override
	public ArrayList<Core> searchCore(Core core) {
		ArrayList<Core> res = new ArrayList<Core>();
		for (Core c: cores) {
			if (c.match(core)) {
				res.add(c);
			}
		}
		return res;
	}

	@Override
	public Core updateCore(Core core) {
		for (Core c: cores) {
			if (c.equals(core)) {
				cores.remove(c);
				cores.add(core);
				return core;
			}
		}
		return null;
	}
}
