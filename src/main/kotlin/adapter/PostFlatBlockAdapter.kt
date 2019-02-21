package gq.genprog.libslab.adapter

import gq.genprog.libslab.block.Block

/**
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
@VersionRange(GameVersion.JAVA_1_13)
class PostFlatBlockAdapter: IBlockAdapter {
    val fs: dynamic = js("require('fs')")
    val mappings: Map<String, BlockDefinition> = JSON.parse(fs.readFileSync("resources/main/1.13.blocks.json", "UTF-8") as String)

    override fun Block.getId(): Int {
        val def = mappings[this.type.getFullResource()]

        if (def != null)
            return def.getDefaultState().id  // TODO: Handle metadata

        return 0
    }

    data class BlockDefinition(val states: Array<BlockState>) {
        fun getDefaultState(): BlockState {
            for (state in states) {
                if (state.default)
                    return state
            }

            return states[0]
        }
    }


    data class BlockState(val id: Int, val default: Boolean = false, val properties: Map<String, String>)
}