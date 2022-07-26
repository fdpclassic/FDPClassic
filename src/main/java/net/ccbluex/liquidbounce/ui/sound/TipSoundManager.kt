package net.ccbluex.liquidbounce.ui.sound

import net.ccbluex.liquidbounce.LiquidBounce
import net.ccbluex.liquidbounce.utils.FileUtils
import java.io.File


class TipSoundManager {
    //custom
    var enableSound: TipSoundPlayer
    var disableSound: TipSoundPlayer
    // jello
    var jelloEnableSound: TipSoundPlayer
    var jelloDisableSound: TipSoundPlayer
    // Airpods
    var airpodsEnableSound: TipSoundPlayer
    var airpodsDisableSound: TipSoundPlayer
    // AppleAnc
    var appleancEnableSound: TipSoundPlayer
    var appleancDisableSound: TipSoundPlayer
    // Longhorn
    var longhornEnableSound: TipSoundPlayer
    var longhornDisableSound: TipSoundPlayer
    // Siri
    var siriEnableSound: TipSoundPlayer
    var siriDisableSound: TipSoundPlayer
    // Sparklingwater
    var sparklingwaterEnableSound: TipSoundPlayer
    var sparklingwaterDisableSound: TipSoundPlayer
    // StephenHawking
    var stephenhawkingEnableSound: TipSoundPlayer
    var stephenhawkingDisableSound: TipSoundPlayer
    // Tesla
    var teslaEnableSound: TipSoundPlayer
    var teslaDisableSound: TipSoundPlayer
    // win11
    var win11EnableSound: TipSoundPlayer
    var win11DisableSound: TipSoundPlayer
    // Winvc
    var winvcEnableSound: TipSoundPlayer
    var winvcDisableSound: TipSoundPlayer

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
        // jello
        val jelloEnableSoundFile = File(LiquidBounce.fileManager.jelloSoundsDir, "enable.wav")
        val jelloDisableSoundFile = File(LiquidBounce.fileManager.jelloSoundsDir, "disable.wav")

        if (!jelloEnableSoundFile.exists()) {
            FileUtils.unpackFile(jelloEnableSoundFile, "assets/minecraft/fdpclient/sound/jello/enable.wav")
        }
        if (!jelloDisableSoundFile.exists()) {
            FileUtils.unpackFile(jelloDisableSoundFile, "assets/minecraft/fdpclient/sound/jello/disable.wav")
        }
        // Airpods
        val airpodsEnableSoundFile = File(LiquidBounce.fileManager.airpodsSoundsDir, "enable.wav")
        val airpodsDisableSoundFile = File(LiquidBounce.fileManager.airpodsSoundsDir, "disable.wav")

        if (!airpodsEnableSoundFile.exists()) {
            FileUtils.unpackFile(airpodsEnableSoundFile, "assets/minecraft/fdpclient/sound/airpods/enable.wav")
        }
        if (!airpodsDisableSoundFile.exists()) {
            FileUtils.unpackFile(airpodsDisableSoundFile, "assets/minecraft/fdpclient/sound/airpods/disable.wav")
        }
        // AppleAnc
        val appleancEnableSoundFile = File(LiquidBounce.fileManager.appleancSoundsDir, "enable.wav")
        val appleancDisableSoundFile = File(LiquidBounce.fileManager.appleancSoundsDir, "disable.wav")

        if (!appleancEnableSoundFile.exists()) {
            FileUtils.unpackFile(appleancEnableSoundFile, "assets/minecraft/fdpclient/sound/appleanc/enable.wav")
        }
        if (!appleancDisableSoundFile.exists()) {
            FileUtils.unpackFile(appleancDisableSoundFile, "assets/minecraft/fdpclient/sound/appleanc/disable.wav")
        }
        // Longhorn
        val longhornEnableSoundFile = File(LiquidBounce.fileManager.longhornSoundsDir, "enable.wav")
        val longhornDisableSoundFile = File(LiquidBounce.fileManager.longhornSoundsDir, "disable.wav")

        if (!longhornEnableSoundFile.exists()) {
            FileUtils.unpackFile(longhornEnableSoundFile, "assets/minecraft/fdpclient/sound/longhorn/enable.wav")
        }
        if (!longhornDisableSoundFile.exists()) {
            FileUtils.unpackFile(longhornDisableSoundFile, "assets/minecraft/fdpclient/sound/longhorn/disable.wav")
        }
        // Siri
        val siriEnableSoundFile = File(LiquidBounce.fileManager.siriSoundsDir, "enable.wav")
        val siriDisableSoundFile = File(LiquidBounce.fileManager.siriSoundsDir, "disable.wav")

        if (!siriEnableSoundFile.exists()) {
            FileUtils.unpackFile(siriEnableSoundFile, "assets/minecraft/fdpclient/sound/siri/enable.wav")
        }
        if (!siriDisableSoundFile.exists()) {
            FileUtils.unpackFile(siriDisableSoundFile, "assets/minecraft/fdpclient/sound/siri/disable.wav")
        }
        // Sparklingwater
        val sparklingwaterEnableSoundFile = File(LiquidBounce.fileManager.sparklingwaterSoundsDir, "enable.wav")
        val sparklingwaterDisableSoundFile = File(LiquidBounce.fileManager.sparklingwaterSoundsDir, "disable.wav")

        if (!sparklingwaterEnableSoundFile.exists()) {
            FileUtils.unpackFile(sparklingwaterEnableSoundFile, "assets/minecraft/fdpclient/sound/sparklingwater/enable.wav")
        }
        if (!sparklingwaterDisableSoundFile.exists()) {
            FileUtils.unpackFile(sparklingwaterDisableSoundFile, "assets/minecraft/fdpclient/sound/sparklingwater/disable.wav")
        }
        // StephenHawking
        val stephenhawkingEnableSoundFile = File(LiquidBounce.fileManager.stephenhawkingSoundsDir, "enable.wav")
        val stephenhawkingDisableSoundFile = File(LiquidBounce.fileManager.stephenhawkingSoundsDir, "disable.wav")

        if (!stephenhawkingEnableSoundFile.exists()) {
            FileUtils.unpackFile(stephenhawkingEnableSoundFile, "assets/minecraft/fdpclient/sound/stephenhawking/enable.wav")
        }
        if (!stephenhawkingDisableSoundFile.exists()) {
            FileUtils.unpackFile(stephenhawkingDisableSoundFile, "assets/minecraft/fdpclient/sound/stephenhawking/disable.wav")
        }
        // Tesla
        val teslaEnableSoundFile = File(LiquidBounce.fileManager.teslaSoundsDir, "enable.wav")
        val teslaDisableSoundFile = File(LiquidBounce.fileManager.teslaSoundsDir, "disable.wav")

        if (!teslaEnableSoundFile.exists()) {
            FileUtils.unpackFile(teslaEnableSoundFile, "assets/minecraft/fdpclient/sound/tesla/enable.wav")
        }
        if (!teslaDisableSoundFile.exists()) {
            FileUtils.unpackFile(teslaDisableSoundFile, "assets/minecraft/fdpclient/sound/tesla/disable.wav")
        }
        // win11
        val win11EnableSoundFile = File(LiquidBounce.fileManager.win11SoundsDir, "enable.wav")
        val win11DisableSoundFile = File(LiquidBounce.fileManager.win11SoundsDir, "disable.wav")

        if (!win11EnableSoundFile.exists()) {
            FileUtils.unpackFile(win11EnableSoundFile, "assets/minecraft/fdpclient/sound/win11/enable.wav")
        }
        if (!win11DisableSoundFile.exists()) {
            FileUtils.unpackFile(win11DisableSoundFile, "assets/minecraft/fdpclient/sound/win11/disable.wav")
        }
        // winvc
        val winvcEnableSoundFile = File(LiquidBounce.fileManager.winvcSoundsDir, "enable.wav")
        val winvcDisableSoundFile = File(LiquidBounce.fileManager.winvcSoundsDir, "disable.wav")

        if (!winvcEnableSoundFile.exists()) {
            FileUtils.unpackFile(winvcEnableSoundFile, "assets/minecraft/fdpclient/sound/winvc/enable.wav")
        }
        if (!winvcDisableSoundFile.exists()) {
            FileUtils.unpackFile(winvcDisableSoundFile, "assets/minecraft/fdpclient/sound/winvc/disable.wav")
        }



        // custom
        enableSound = TipSoundPlayer(enableSoundFile)
        disableSound = TipSoundPlayer(disableSoundFile)
        // jello
        jelloEnableSound = TipSoundPlayer(jelloEnableSoundFile)
        jelloDisableSound = TipSoundPlayer(jelloDisableSoundFile)
        // Airpods
        airpodsEnableSound = TipSoundPlayer(airpodsEnableSoundFile)
        airpodsDisableSound = TipSoundPlayer(airpodsDisableSoundFile)
        // AppleAnc
        appleancEnableSound = TipSoundPlayer(appleancEnableSoundFile)
        appleancDisableSound = TipSoundPlayer(appleancDisableSoundFile)
        // Longhorn
        longhornEnableSound = TipSoundPlayer(longhornEnableSoundFile)
        longhornDisableSound = TipSoundPlayer(longhornDisableSoundFile)
        // Siri
        siriEnableSound = TipSoundPlayer(siriEnableSoundFile)
        siriDisableSound = TipSoundPlayer(siriDisableSoundFile)
        // Sparklingwater
        sparklingwaterEnableSound = TipSoundPlayer(sparklingwaterEnableSoundFile)
        sparklingwaterDisableSound = TipSoundPlayer(sparklingwaterDisableSoundFile)
        // StephenHawking
        stephenhawkingEnableSound = TipSoundPlayer(stephenhawkingEnableSoundFile)
        stephenhawkingDisableSound = TipSoundPlayer(stephenhawkingDisableSoundFile)
        // Tesla
        teslaEnableSound = TipSoundPlayer(teslaEnableSoundFile)
        teslaDisableSound = TipSoundPlayer(teslaDisableSoundFile)
        // win11
        win11EnableSound = TipSoundPlayer(win11EnableSoundFile)
        win11DisableSound = TipSoundPlayer(win11DisableSoundFile)
        // Winvc
        winvcEnableSound = TipSoundPlayer(winvcEnableSoundFile)
        winvcDisableSound = TipSoundPlayer(winvcDisableSoundFile)
    }
}
