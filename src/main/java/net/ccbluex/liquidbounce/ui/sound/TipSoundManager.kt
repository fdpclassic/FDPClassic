package net.ccbluex.liquidbounce.ui.sound

import net.ccbluex.liquidbounce.LiquidBounce
import net.ccbluex.liquidbounce.utils.FileUtils
import java.io.File

class TipSoundManager {
    var enableSound: TipSoundPlayer
    var disableSound: TipSoundPlayer

    init {
        val enableSoundFile = File(LiquidBounce.fileManager.soundsDir, "enable.wav")
        val disableSoundFile = File(LiquidBounce.fileManager.soundsDir, "disable.wav")
        val JelloEnableSoundFile = File(LiquidBounce.fileManager.soundsDir, "jello/enable.wav")
        val JelloDisableSoundFile = File(LiquidBounce.fileManager.soundsDir, "jello/disable.wav")

        if (!enableSoundFile.exists()) {
            FileUtils.unpackFile(enableSoundFile, "assets/minecraft/fdpclient/sound/enable.wav")
        }
        if (!disableSoundFile.exists()) {
            FileUtils.unpackFile(disableSoundFile, "assets/minecraft/fdpclient/sound/disable.wav")
        }
        if (!JelloEnableSoundFile.exists()) {
            FileUtils.unpackFile(JelloEnableSoundFile, "assets/minecraft/fdpclient/sound/jello/enable.wav")
        }
        if (!JelloDisableSoundFile.exists()) {
            FileUtils.unpackFile(JelloDisableSoundFile, "assets/minecraft/fdpclient/sound/jello/disable.wav")
        }

        enableSound = TipSoundPlayer(enableSoundFile)
        disableSound = TipSoundPlayer(disableSoundFile)
        JelloEnableSound = TipSoundPlayer(JelloEnableSoundFile)
        JelloDisableSound = TipSoundPlayer(JelloDisableSoundFile)
    }
}
