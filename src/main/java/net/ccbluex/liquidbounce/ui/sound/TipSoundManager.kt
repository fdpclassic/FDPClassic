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
    // Airpods
    var AirpodsEnableSound: TipSoundPlayer
    var AirpodsDisableSound: TipSoundPlayer
    // AppleAnc
    var AppleAncEnableSound: TipSoundPlayer
    var AppleAncDisableSound: TipSoundPlayer
    // Longhorn
    var LonghornEnableSound: TipSoundPlayer
    var LonghornDisableSound: TipSoundPlayer
    // Siri
    var SiriEnableSound: TipSoundPlayer
    var SiriDisableSound: TipSoundPlayer
    // Sparklingwater
    var SparklingwaterEnableSound: TipSoundPlayer
    var SparklingwaterDisableSound: TipSoundPlayer
    // StephenHawking
    var StephenHawkingEnableSound: TipSoundPlayer
    var StephenHawkingDisableSound: TipSoundPlayer
    // Tesla
    var TeslaEnableSound: TipSoundPlayer
    var TeslaDisableSound: TipSoundPlayer
    // win11
    var win11EnableSound: TipSoundPlayer
    var win11DisableSound: TipSoundPlayer
    // Winvc
    var WinvcEnableSound: TipSoundPlayer
    var WinvcDisableSound: TipSoundPlayer

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
        val JelloEnableSoundFile = File(LiquidBounce.fileManager.JelloSoundsDir, "enable.wav")
        val JelloDisableSoundFile = File(LiquidBounce.fileManager.JelloSoundsDir, "disable.wav")

        if (!JelloEnableSoundFile.exists()) {
            FileUtils.unpackFile(JelloEnableSoundFile, "assets/minecraft/fdpclient/sound/jello/enable.wav")
        }
        if (!JelloDisableSoundFile.exists()) {
            FileUtils.unpackFile(JelloDisableSoundFile, "assets/minecraft/fdpclient/sound/jello/disable.wav")
        }
        // Airpods
        val AirpodsEnableSoundFile = File(LiquidBounce.fileManager.AirpodsSoundsDir, "enable.wav")
        val AirpodsDisableSoundFile = File(LiquidBounce.fileManager.AirpodsSoundsDir, "disable.wav")

        if (!AirpodsEnableSoundFile.exists()) {
            FileUtils.unpackFile(AirpodsEnableSoundFile, "assets/minecraft/fdpclient/sound/airpods/enable.wav")
        }
        if (!AirpodsDisableSoundFile.exists()) {
            FileUtils.unpackFile(AirpodsDisableSoundFile, "assets/minecraft/fdpclient/sound/airpods/disable.wav")
        }
        // AppleAnc
        val AppleAncEnableSoundFile = File(LiquidBounce.fileManager.AppleAncSoundsDir, "enable.wav")
        val AppleAncDisableSoundFile = File(LiquidBounce.fileManager.AppleAncSoundsDir, "disable.wav")

        if (!AppleAncEnableSoundFile.exists()) {
            FileUtils.unpackFile(AppleAncEnableSoundFile, "assets/minecraft/fdpclient/sound/appleanc/enable.wav")
        }
        if (!AppleAncDisableSoundFile.exists()) {
            FileUtils.unpackFile(AppleAncDisableSoundFile, "assets/minecraft/fdpclient/sound/appleanc/disable.wav")
        }
        // Longhorn
        val LonghornEnableSoundFile = File(LiquidBounce.fileManager.LonghornSoundsDir, "enable.wav")
        val LonghornDisableSoundFile = File(LiquidBounce.fileManager.LonghornSoundsDir, "disable.wav")

        if (!LonghornEnableSoundFile.exists()) {
            FileUtils.unpackFile(LonghornEnableSoundFile, "assets/minecraft/fdpclient/sound/longhorn/enable.wav")
        }
        if (!LonghornDisableSoundFile.exists()) {
            FileUtils.unpackFile(LonghornDisableSoundFile, "assets/minecraft/fdpclient/sound/longhorn/disable.wav")
        }
        // Siri
        val SiriEnableSoundFile = File(LiquidBounce.fileManager.SiriSoundsDir, "enable.wav")
        val SiriDisableSoundFile = File(LiquidBounce.fileManager.SiriSoundsDir, "disable.wav")

        if (!SiriEnableSoundFile.exists()) {
            FileUtils.unpackFile(SiriEnableSoundFile, "assets/minecraft/fdpclient/sound/siri/enable.wav")
        }
        if (!SiriDisableSoundFile.exists()) {
            FileUtils.unpackFile(SiriDisableSoundFile, "assets/minecraft/fdpclient/sound/siri/disable.wav")
        }
        // Sparklingwater
        val SparklingwaterEnableSoundFile = File(LiquidBounce.fileManager.SparklingwaterSoundsDir, "enable.wav")
        val SparklingwaterDisableSoundFile = File(LiquidBounce.fileManager.SparklingwaterSoundsDir, "disable.wav")

        if (!SparklingwaterEnableSoundFile.exists()) {
            FileUtils.unpackFile(SparklingwaterEnableSoundFile, "assets/minecraft/fdpclient/sound/sparklingwater/enable.wav")
        }
        if (!SparklingwaterDisableSoundFile.exists()) {
            FileUtils.unpackFile(SparklingwaterDisableSoundFile, "assets/minecraft/fdpclient/sound/sparklingwater/disable.wav")
        }
        // StephenHawking
        val StephenHawkingEnableSoundFile = File(LiquidBounce.fileManager.StephenHawkingSoundsDir, "enable.wav")
        val StephenHawkingDisableSoundFile = File(LiquidBounce.fileManager.StephenHawkingSoundsDir, "disable.wav")

        if (!StephenHawkingEnableSoundFile.exists()) {
            FileUtils.unpackFile(StephenHawkingEnableSoundFile, "assets/minecraft/fdpclient/sound/stephenhawking/enable.wav")
        }
        if (!StephenHawkingDisableSoundFile.exists()) {
            FileUtils.unpackFile(StephenHawkingDisableSoundFile, "assets/minecraft/fdpclient/sound/stephenhawking/disable.wav")
        }
        // Tesla
        val TeslaEnableSoundFile = File(LiquidBounce.fileManager.TeslaSoundsDir, "enable.wav")
        val TeslaDisableSoundFile = File(LiquidBounce.fileManager.TeslaSoundsDir, "disable.wav")

        if (!TeslaEnableSoundFile.exists()) {
            FileUtils.unpackFile(TeslaEnableSoundFile, "assets/minecraft/fdpclient/sound/tesla/enable.wav")
        }
        if (!TeslaDisableSoundFile.exists()) {
            FileUtils.unpackFile(TeslaDisableSoundFile, "assets/minecraft/fdpclient/sound/tesla/disable.wav")
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
        // Winvc
        val WinvcEnableSoundFile = File(LiquidBounce.fileManager.WinvcSoundsDir, "enable.wav")
        val WinvcDisableSoundFile = File(LiquidBounce.fileManager.WinvcSoundsDir, "disable.wav")

        if (!WinvcEnableSoundFile.exists()) {
            FileUtils.unpackFile(WinvcEnableSoundFile, "assets/minecraft/fdpclient/sound/winvc/enable.wav")
        }
        if (!WinvcDisableSoundFile.exists()) {
            FileUtils.unpackFile(WinvcDisableSoundFile, "assets/minecraft/fdpclient/sound/winvc/disable.wav")
        }



        // custom
        enableSound = TipSoundPlayer(enableSoundFile)
        disableSound = TipSoundPlayer(disableSoundFile)
        // jello
        JelloEnableSound = TipSoundPlayer(JelloEnableSoundFile)
        JelloDisableSound = TipSoundPlayer(JelloDisableSoundFile)
        // Airpods
        AirpodsEnableSound = TipSoundPlayer(AirpodsEnableSoundFile)
        AirpodsDisableSound = TipSoundPlayer(AirpodsDisableSoundFile)
        // AppleAnc
        AppleAncEnableSound = TipSoundPlayer(AppleAncEnableSoundFile)
        AppleAncDisableSound = TipSoundPlayer(AppleAncDisableSoundFile)
        // Longhorn
        LonghornEnableSound = TipSoundPlayer(LonghornEnableSoundFile)
        LonghornDisableSound = TipSoundPlayer(LonghornDisableSoundFile)
        // Siri
        SiriEnableSound = TipSoundPlayer(SiriEnableSoundFile)
        SiriDisableSound = TipSoundPlayer(SiriDisableSoundFile)
        // Sparklingwater
        SparklingwaterEnableSound = TipSoundPlayer(SparklingwaterEnableSoundFile)
        SparklingwaterDisableSound = TipSoundPlayer(SparklingwaterDisableSoundFile)
        // StephenHawking
        StephenHawkingEnableSound = TipSoundPlayer(StephenHawkingEnableSoundFile)
        StephenHawkingDisableSound = TipSoundPlayer(StephenHawkingDisableSoundFile)
        // Tesla
        TeslaEnableSound = TipSoundPlayer(TeslaEnableSoundFile)
        TeslaDisableSound = TipSoundPlayer(TeslaDisableSoundFile)
        // win11
        win11EnableSound = TipSoundPlayer(win11EnableSoundFile)
        win11DisableSound = TipSoundPlayer(win11DisableSoundFile)
        // Winvc
        WinvcEnableSound = TipSoundPlayer(WinvcEnableSoundFile)
        WinvcDisableSound = TipSoundPlayer(WinvcDisableSoundFile)
    }
}
