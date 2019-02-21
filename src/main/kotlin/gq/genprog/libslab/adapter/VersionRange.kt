package gq.genprog.libslab.adapter

/**
 * Written by @offbeatwitch.
 * Licensed under MIT.
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class VersionRange(val value: GameVersion)