package net.ccbluex.liquidbounce.features.module.modules.client

import net.ccbluex.liquidbounce.LiquidBounce
import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.value.BoolValue
import net.ccbluex.liquidbounce.value.ListValue
import net.minecraft.client.audio.PositionedSoundRecord
import net.minecraft.util.ResourceLocation

@ModuleInfo(name = "Modules", category = ModuleCategory.CLIENT, canEnable = false)
object Modules : Module() {
    val toggleIgnoreScreenValue = BoolValue("ToggleIgnoreScreen", false)
    private val toggleSoundValue = ListValue("ToggleSound", arrayOf("None", "Airpods", "AppleAnc", "Longhorn", "Siri", "Sparklingwater", "StephenHawking", "Tesla", "win11", "Winvc", "jello", "Click", "Custom"), "Click")

    fun playSound(enable: Boolean) {
        when (toggleSoundValue.get().lowercase()) {
            "click" -> {
                mc.soundHandler.playSound(PositionedSoundRecord.create(ResourceLocation("random.click"), 1F))
            }

            "jello" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.JelloEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.JelloDisableSound.asyncPlay()
                }
            }

            "Airpods" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.AirpodsEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.AirpodsDisableSound.asyncPlay()
                }
            }

            "AppleAnc" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.AppleAncEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.AppleAncDisableSound.asyncPlay()
                }
            }

            "Longhorn" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.LonghornEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.LonghornDisableSound.asyncPlay()
                }
            }

            "Siri" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.SiriEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.SiriDisableSound.asyncPlay()
                }
            }

            "Sparklingwater" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.SparklingwaterEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.SparklingwaterDisableSound.asyncPlay()
                }
            }

            "StephenHawking" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.StephenHawkingEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.StephenHawkingDisableSound.asyncPlay()
                }
            }

            "Tesla" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.TeslaEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.TeslaDisableSound.asyncPlay()
                }
            }

            "win11" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.win11EnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.win11DisableSound.asyncPlay()
                }
            }
            
            "Winvc" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.WinvcEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.WinvcDisableSound.asyncPlay()
                }
            }

            "custom" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.enableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.disableSound.asyncPlay()
                }
            }
        }
    }
}