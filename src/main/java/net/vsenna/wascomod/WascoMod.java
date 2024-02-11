package net.vsenna.wascomod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WascoMod implements ModInitializer {
	public static final String MOD_ID = "WascoMod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//a
	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}