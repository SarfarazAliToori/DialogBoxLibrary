package com.example.mydialogbox

import android.content.Context
import android.widget.Toast

object MyDialogBox {

    fun toastMessage(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}