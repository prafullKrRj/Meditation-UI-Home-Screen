package com.example.meditationui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path

fun Path.standardQuadFromTo(from: Offset, to: Offset) {
    quadraticBezierTo(
        from.x,
        from.y,
        kotlin.math.abs(from.x + to.x) / 2f,
        kotlin.math.abs(from.y + to.y) / 2f
    )
}