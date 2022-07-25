package net.ccbluex.liquidbounce.ui.sound

import net.ccbluex.liquidbounce.LiquidBounce
import net.ccbluex.liquidbounce.utils.FileUtils
import java.io.File


class TipSoundManager {
    //custom
    var enableSound: TipSoundPlayer
    var disableSound: TipSoundPlayer
    // jello
    var JelloEnableSound: TipSoundPlayer
    var JelloDisableSound: TipSoundPlayer
    init {
        // custom
        val enableSoundFile = File(LiquidBounce.fileManager.soundsDir, "enable.wav")
        val disableSoundFile = File(LiquidBounce.fileManager.soundsDir, "disable.wav")

        if (!enableSoundFile.exists()) {
            FileUtils.unpackFile(enableSoundFile, "assets/minecraft/fdpclient/sound/enable.wav")
        }
        if (!disableSoundFile.exists()) {
            FileUtils.unpackFile(disableSoundFile, "assets/minecraft/fdpclient/sound/disable.wav")
        }
        //jello
        val JelloEnableSoundFile = File(LiquidBounce.fileManager.JelloSoundsDir, "enable.wav")
        val JelloDisableSoundFile = File(LiquidBounce.fileManager.JelloSoundsDir, "disable.wav")

        if (!JelloEnableSoundFile.exists()) {
            FileUtils.unpackFile(JelloEnableSoundFile, "assets/minecraft/fdpclient/sound/jello/enable.wav")
        }
        if (!JelloDisableSoundFile.exists()) {
            FileUtils.unpackFile(JelloDisableSoundFile, "assets/minecraft/fdpclient/sound/jello/disable.wav")
        }


        // custom
        enableSound = TipSoundPlayer(enableSoundFile)
        disableSound = TipSoundPlayer(disableSoundFile)
        // jello
        JelloEnableSound = TipSoundPlayer(JelloEnableSoundFile)
        JelloDisableSound = TipSoundPlayer(JelloDisableSoundFile)
    }
}
