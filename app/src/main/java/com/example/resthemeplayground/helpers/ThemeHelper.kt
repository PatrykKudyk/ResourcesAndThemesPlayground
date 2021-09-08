package com.example.resthemeplayground.helpers

import com.example.resthemeplayground.R
import com.example.resthemeplayground.enums.ThemeEnum
import com.example.resthemeplayground.models.Theme

class ThemeHelper {

    fun getThemesList(): ArrayList<Theme> {
        return arrayListOf(
            Theme(
                ThemeEnum.Default.name,
                arrayListOf(
                    R.color.colorYellow,
                    R.color.colorYellowDark,
                    R.color.colorBlack,
                    R.color.colorDirtyOrange,
                    R.color.colorDirtyOrangeDark,
                    R.color.colorEcru,
                    R.color.colorRedDarkDark
                )
            ),
            Theme(
                ThemeEnum.Light.name,
                arrayListOf(
                    R.color.colorYellowLightLight,
                    R.color.colorYellowLight,
                    R.color.colorBlack,
                    R.color.colorDirtyOrangeLightLight,
                    R.color.colorDirtyOrangeLightLight,
                    R.color.colorBlack,
                    R.color.colorRed
                )
            ),
            Theme(
                ThemeEnum.Dark.name,
                arrayListOf(
                    R.color.colorYellowDark,
                    R.color.colorYellowDarkDark,
                    R.color.colorBlack,
                    R.color.colorDirtyOrangeDark,
                    R.color.colorDirtyOrangeDarkDark,
                    R.color.colorBlack,
                    R.color.colorRedDarkDarkDark
                )
            ),
            Theme(
                ThemeEnum.Green.name,
                arrayListOf(
                    R.color.colorGreen,
                    R.color.colorGreenDark,
                    R.color.colorEcruDarkDark,
                    R.color.colorDirtyGreenDark,
                    R.color.colorDirtyGreenDarkDark,
                    R.color.colorEcruDarkDark,
                    R.color.colorGreyDarkDark
                )
            ),
            Theme(
                ThemeEnum.Red.name,
                arrayListOf(
                    R.color.colorRed,
                    R.color.colorRedDark,
                    R.color.colorEcruDarkDark,
                    R.color.colorRedDarkDark,
                    R.color.colorRedDarkDarkDark,
                    R.color.colorEcruDarkDark,
                    R.color.colorBlack
                )
            ),
            Theme(
                ThemeEnum.Rasta.name,
                arrayListOf(
                    R.color.colorYellowDark,
                    R.color.colorGreen,
                    R.color.colorRed,
                    R.color.colorYellowDarkDark,
                    R.color.colorGreenDarkDark,
                    R.color.colorRedDark,
                    R.color.colorRedDarkDarkDark
                )
            )
        )
    }

    companion object {
        var theme: ThemeEnum = ThemeEnum.Default
        var selectedThemePosition = 0
    }
}