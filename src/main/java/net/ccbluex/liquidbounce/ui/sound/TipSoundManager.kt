package net.ccbluex.liquidbounce.ui.sound

import net.ccbluex.liquidbounce.LiquidBounce
import net.ccbluex.liquidbounce.utils.FileUtils
import net.minecraft.util.ResourceLocation
import java.io.File


class TipSoundManager {
    var enableSound: TipSoundPlayer
    var disableSound: TipSoundPlayer
    var JelloEnableSound: TipSoundPlayer
    var JelloDisableSound: TipSoundPlayer

    init {
        val enableSoundFile = File(LiquidBounce.fileManager.soundsDir, "enable.wav")
        val disableSoundFile = File(LiquidBounce.fileManager.soundsDir, "disable.wav")
        val JelloEnableSoundFile = ResourceLocation("assets/minecraft/fdpclient/sound/jello/enable.wav")
        val JelloDisableSoundFile = ResourceLocation("assets/minecraft/fdpclient/sound/jello/disable.wav")

        if (!enableSoundFile.exists()) {
            FileUtils.unpackFile(enableSoundFile, "assets/minecraft/fdpclient/sound/enable.wav")
        }
        if (!disableSoundFile.exists()) {
            FileUtils.unpackFile(disableSoundFile, "assets/minecraft/fdpclient/sound/disable.wav")
        }

        enableSound = TipSoundPlayer(enableSoundFile)
        disableSound = TipSoundPlayer(disableSoundFile)
        JelloEnableSound = TipSoundPlayer(JelloEnableSoundFile)
        JelloDisableSound = TipSoundPlayer(JelloDisableSoundFile)
    }
}
