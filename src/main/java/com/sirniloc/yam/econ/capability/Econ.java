package com.sirniloc.yam.econ.capability;

import com.sirniloc.yam.econ.capability.interfaces.IEcon;
import com.sirniloc.yam.econ.nbt.EconNBT;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public class Econ implements IEcon, INBTSerializable<NBTTagCompound> {
	
	private double money=-1;

	public Econ(EntityLivingBase object) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public NBTTagCompound serializeNBT() {
		return (NBTTagCompound) EconNBT.writeNBT(null, this, null);
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		EconNBT.readNBT(null, this, null, nbt);
	}

	@Override
	public void setMoneyDouble(double d) {
		money=d;
	}

	@Override
	public double getMoney() {
		return money;
	}

	@Override
	public void cloneABS(Econ abs) {
		money = abs.getMoney();
	}

	@Override
	public Econ getEcon() {
		return this;
	}

}
