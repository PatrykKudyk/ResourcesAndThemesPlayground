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
                    R.color.colorYellowDark,
                    R.color.colorYellowDarkDark,
                    R.color.colorBlack,
                    R.color.colorDirtyOrangeDark,
                    R.color.colorDirtyOrangeDarkDark,
                    R.color.colorEcru,
                    R.color.colorRedDarkDark
                )
            ),
            Theme(
                ThemeEnum.Default.name,
                arrayListOf(
                    R.color.colorYellowDark,
                    R.color.colorYellowDarkDark,
                    R.color.colorBlack,
                    R.color.colorDirtyOrangeDark,
                    R.color.colorDirtyOrangeDarkDark,
                    R.color.colorEcru,
                    R.color.colorRedDarkDark
                )
            ),
            Theme(
                ThemeEnum.Default.name,
                arrayListOf(
                    R.color.colorYellowDark,
                    R.color.colorYellowDarkDark,
                    R.color.colorBlack,
                    R.color.colorDirtyOrangeDark,
                    R.color.colorDirtyOrangeDarkDark,
                    R.color.colorEcru,
                    R.color.colorRedDarkDark
                )
            ),
            Theme(
                ThemeEnum.Default.name,
                arrayListOf(
                    R.color.colorYellowDark,
                    R.color.colorYellowDarkDark,
                    R.color.colorBlack,
                    R.color.colorDirtyOrangeDark,
                    R.color.colorDirtyOrangeDarkDark,
                    R.color.colorEcru,
                    R.color.colorRedDarkDark
                )
            ),
            Theme(
                ThemeEnum.Default.name,
                arrayListOf(
                    R.color.colorYellowDark,
                    R.color.colorYellowDarkDark,
                    R.color.colorBlack,
                    R.color.colorDirtyOrangeDark,
                    R.color.colorDirtyOrangeDarkDark,
                    R.color.colorEcru,
                    R.color.colorRedDarkDark
                )
            ),
            Theme(
                ThemeEnum.Default.name,
                arrayListOf(
                    R.color.colorYellowDark,
                    R.color.colorYellowDarkDark,
                    R.color.colorBlack,
                    R.color.colorDirtyOrangeDark,
                    R.color.colorDirtyOrangeDarkDark,
                    R.color.colorEcru,
                    R.color.colorRedDarkDark
                )
            ),
            Theme(
                ThemeEnum.Default.name,
                arrayListOf(
                    R.color.colorYellowDark,
                    R.color.colorYellowDarkDark,
                    R.color.colorBlack,
                    R.color.colorDirtyOrangeDark,
                    R.color.colorDirtyOrangeDarkDark,
                    R.color.colorEcru,
                    R.color.colorRedDarkDark
                )
            )
        )
    }

    companion object {
        var theme: ThemeEnum = ThemeEnum.Default
    }
}