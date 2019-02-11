package com.sirniloc.yam.econ.capability;

import com.sirniloc.yam.econ.BaseEcon;
import com.sirniloc.yam.econ.capability.interfaces.IEcon;
import com.sirniloc.yam.util.SimpleCapabilityProvider;

import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class CapabilityEcon {
	public static void postInit()
	{
		CapabilityManager.INSTANCE.register(IEcon.class, new StorageEcon(), new StorageEcon.Factory());
	}	

	public static ICapabilityProvider createProvider(IEcon absCap) {		
		return new SimpleCapabilityProvider<IEcon>(BaseEcon.ECON_CAP, null, absCap);
	}
	
}
