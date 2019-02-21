package gq.genprog.libslab.block

/**
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
enum class BlockType(val preFlatId: Int, val resource: String) {
    AIR(0, "air"),
    STONE(1, "stone"),
    GRASS(2, "grass"),
    DIRT(3, "dirt"),
    COBBLESTONE(4, "cobblestone"),
    WOODEN_PLANKS(5, "planks"),
    SAPLING(6, "sapling"),
    BEDROCK(7, "bedrock"),
    WATER_FLOWING(8, "flowing_water"),
    WATER(9, "water"),
    LAVA_FLOWING(10, "flowing_lava"),
    LAVA(11, "lava"),
    SAND(12, "sand"),
    GRAVEL(13, "gravel"),
    GOLD_ORE(14, "gold_ore"),
    IRON_ORE(15, "iron_ore"),
    COAL_ORE(16, "coal_ore"),
    LOG(17, "log"),
    LEAVES(18, "leaves"),
    SPONGE(19, "sponge"),
    GLASS(20, "glass"),
    ;

    fun getFullResource(): String {
        if (!resource.contains(':'))
            return "minecraft:$resource"

        return resource
    }
}