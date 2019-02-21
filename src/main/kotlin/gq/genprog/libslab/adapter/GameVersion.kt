package gq.genprog.libslab.adapter

/**
 * Classifies protocol & game versions into several ranges.
 *
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
enum class GameVersion(val protocolRange: IntRange) {
    JAVA_PRE_1_8(0..5),
    JAVA_1_8(6..47),
    JAVA_PRE_FLAT(48..340),
    JAVA_1_13(341..404),
    JAVA_1_14_PRERELEASE(405..461)
    ;
}