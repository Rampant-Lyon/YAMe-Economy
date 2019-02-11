package com.sirniloc.yam.econ.capability;

import java.util.concurrent.Callable;

import com.sirniloc.yam.econ.capability.interfaces.IEcon;
import com.sirniloc.yam.econ.nbt.EconNBT;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class StorageEcon implements IStorage<IEcon>{

	@Override
	public NBTBase writeNBT(Capability<IEcon> capability, IEcon instance, EnumFacing side) {		
		return EconNBT.writeNBT(capability, instance, side);
	}

	@Override
	public void readNBT(Capability<IEcon> capability, IEcon instance, EnumFacing side, NBTBase nbt) {
		EconNBT.readNBT(capability, instance, side, nbt);		
	}
	
	public static class Factory implements Callable<IEcon> {
		@Override
		public IEcon call() throws Exception {
			return new Econ(null);
		}
	}

}
