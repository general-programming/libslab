package gq.genprog.libslab.adapter

import gq.genprog.libslab.block.Block

/**
 * Handles converting blocks to certain Minecraft version ranges
 *
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
interface IBlockAdapter {
    fun Block.getId(): Int
}