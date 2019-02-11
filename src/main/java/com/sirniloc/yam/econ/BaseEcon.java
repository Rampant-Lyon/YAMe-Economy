package com.sirniloc.yam.econ;

import com.sirniloc.yam.econ.capability.CapabilityEcon;
import com.sirniloc.yam.econ.capability.interfaces.IEcon;
import com.sirniloc.yam.econ.events.EconEvents;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = BaseEcon.MODID, version = BaseEcon.VERSION)
public class BaseEcon
{
    public static final String MODID = "yam.econ";
    public static final String VERSION = "0.1";
    
    
    @CapabilityInject(IEcon.class)
	public static Capability<IEcon> ECON_CAP = null;	
	
	public static final ResourceLocation ECON_ID = new ResourceLocation(BaseEcon.MODID, "CAPABILITY_ECON");

    
    @EventHandler
    public void preInit(FMLInitializationEvent event)    {
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new EconEvents());
    }
    @EventHandler
    public void postInit(FMLInitializationEvent event)    {
    	CapabilityEcon.postInit();
    }
    
}
