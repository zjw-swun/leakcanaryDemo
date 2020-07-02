package com.filipibrentegani.toolsdeveloperandroid

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import leakcanary.LeakCanary

class LeakCanaryCloseProvider : ContentProvider() {
    override fun onCreate(): Boolean {
        updateLeakCanaryState()
        return true
    }

    private fun updateLeakCanaryState() {
        var CanaryEnable = false
        LeakCanary.config = LeakCanary.config.copy(dumpHeap = CanaryEnable)
    }

    override fun query(
        uri: Uri,
        projection: Array<String>?,
        selection: String?,
        selectionArgs: Array<String>?,
        sortOrder: String?
    ): Cursor? {
        return null
    }

    override fun getType(uri: Uri): String? {
        return null
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        return null
    }

    override fun delete(
        uri: Uri,
        selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        return 0
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<String>?
    ): Int {
        return 0
    }

}