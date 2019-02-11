package com.sirniloc.yam.econ.nbt;

import com.sirniloc.yam.econ.capability.interfaces.IEcon;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class EconNBT {
	public static void readNBT(Capability<IEcon> capability, IEcon instance, EnumFacing side, NBTBase nbt) {
		if(nbt instanceof NBTTagCompound) {
			NBTTagCompound tag = (NBTTagCompound)nbt;
			instance.setMoneyDouble(tag.getDouble("wallet"));
		}
	}
	
	public static NBTBase writeNBT(Capability<IEcon> capability, IEcon instance, EnumFacing side) {
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setDouble("wallet", instance.getMoney());
		return nbt;		
	}
}
