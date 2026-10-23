package com.dragn0007.advanced_horses.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class AdvancedHorsesClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Client");
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
