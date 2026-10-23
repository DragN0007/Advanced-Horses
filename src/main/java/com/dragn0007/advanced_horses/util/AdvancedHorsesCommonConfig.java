package com.dragn0007.advanced_horses.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class AdvancedHorsesCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("General");
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
