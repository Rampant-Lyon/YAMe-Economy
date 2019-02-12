package com.sirniloc.yam.econ.events;

import com.sirniloc.yam.BaseYAM;
import com.sirniloc.yam.econ.BaseEcon;
import com.sirniloc.yam.econ.capability.CapabilityEcon;
import com.sirniloc.yam.econ.capability.Econ;
import com.sirniloc.yam.econ.capability.interfaces.IEcon;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EconEvents {

	@SubscribeEvent
	public void onAttachCapabilityEntity(AttachCapabilitiesEvent<Entity> event) {
		if(event.getObject() instanceof EntityPlayer) {
			
			final IEcon absCap = new Econ((EntityLivingBase) event.getObject());
			event.addCapability(BaseEcon.ECON_ID, CapabilityEcon.createProvider(absCap));
		}
			
	}
	
	@SubscribeEvent
	public void onPlayerRespawn(PlayerEvent.Clone event) {		
		event.getEntityLiving().getCapability(BaseYAM.ABS_CAP, null).cloneABS(event.getOriginal().getCapability(BaseYAM.ABS_CAP, null).getCharacter());		
	}	
}
