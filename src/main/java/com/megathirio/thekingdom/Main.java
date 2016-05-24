package com.megathirio.thekingdom;

import com.megathirio.thekingdom.utilities.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by TheJackyl on 5/24/2016.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Main {
    @Mod.Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide= Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        System.out.println("Called method: preInit");
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        System.out.println("Called method: init");
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        System.out.println("Called method: postInit");
        proxy.postInit(e);
    }
}