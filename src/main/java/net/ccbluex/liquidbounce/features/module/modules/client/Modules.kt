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
    private val toggleSoundValue = ListValue("ToggleSound", arrayOf("None", "airpods", "appleanc", "longhorn", "siri", "sparklingwater", "stephenhawking", "tesla", "win11", "winvc", "jello", "click", "Custom"), "win11")

    fun playSound(enable: Boolean) {
        when (toggleSoundValue.get().lowercase()) {
            "click" -> {
                mc.soundHandler.playSound(PositionedSoundRecord.create(ResourceLocation("random.click"), 1F))
            }

            "jello" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.jelloEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.jelloDisableSound.asyncPlay()
                }
            }

            "airpods" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.airpodsEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.airpodsDisableSound.asyncPlay()
                }
            }

            "appleanc" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.appleAncEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.appleAncDisableSound.asyncPlay()
                }
            }

            "longhorn" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.longhornEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.longhornDisableSound.asyncPlay()
                }
            }

            "siri" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.siriEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.siriDisableSound.asyncPlay()
                }
            }

            "sparklingwater" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.sparklingwaterEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.sparklingwaterDisableSound.asyncPlay()
                }
            }

            "stephenHawking" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.stephenhawkingEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.stephenhawkingDisableSound.asyncPlay()
                }
            }

            "tesla" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.teslaEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.teslaDisableSound.asyncPlay()
                }
            }

            "win11" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.win11EnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.win11DisableSound.asyncPlay()
                }
            }
            
            "winvc" -> {
                if (enable) {
                    LiquidBounce.tipSoundManager.winvcEnableSound.asyncPlay()
                } else {
                    LiquidBounce.tipSoundManager.winvcDisableSound.asyncPlay()
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