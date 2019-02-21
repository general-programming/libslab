package gq.genprog.libslab.chunk

import gq.genprog.libslab.block.Block
import gq.genprog.libslab.block.BlockType

/**
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
class Chunk(val height: Int = 256) {
    val blocks: Array<Array<Array<Block>>> =
        Array(16) { x ->
            Array(16) { z ->
                Array(height) { y ->
                    Block(BlockType.AIR)
                }
            }
        }
}