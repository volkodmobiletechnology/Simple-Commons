package com.volkod.commons.extensions

import android.content.Context
import com.volkod.commons.models.FileDirItem

fun FileDirItem.isRecycleBinPath(context: Context): Boolean {
    return path.startsWith(context.recycleBinPath)
}
