package gq.genprog.libslab.adapter

import gq.genprog.libslab.block.Block

/**
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
@VersionRange(GameVersion.JAVA_1_13)
class PostFlatBlockAdapter: IBlockAdapter {

    override fun Block.getId(): Int {
        this.type.getFullResource()

        return 0
    }
}