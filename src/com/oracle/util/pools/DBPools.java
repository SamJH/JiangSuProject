package com.oracle.util.pools;

import java.util.ArrayList;
import java.util.List;

import com.oracle.util.ConfigManager;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class DBPools {
	
	@OneToMany
	private static List<PoolConnection> pclist = new ArrayList<PoolConnection>();
	
	
	static {
		for(int i=0;i<ConfigManager.SIZE;i++){
		  pclist.add(new PoolConnection());
		}
	}
	public static PoolConnection getPoolConnection(){
		for(PoolConnection pc:pclist){
			if(!pc.isState()){
				return pc;
			}
		}
		return null;
	}

}
