package gq.genprog.libslab.chunk

import gq.genprog.libslab.block.Block
import gq.genprog.libslab.block.BlockType

/**
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
class Chunk {
    val blocks: Array<Array<Array<Block>>> =
        Array(16) { x ->
            Array(16) { z ->
                Array(256) { y ->
                    Block(BlockType.AIR)
                }
            }
        }
}