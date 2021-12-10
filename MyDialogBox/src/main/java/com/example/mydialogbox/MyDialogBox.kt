package com.example.mydialogbox

import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

object MyDialogBox {

    fun toastMessage(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun mDialogBox(context: Context,
                   title: String,
                   message: String,
                   positiveButtonName: String,
                   NegativeButtonName: String,
                   NeutralButtonName: String,
                   onPositiveButtonToastMsg: String) : MaterialAlertDialogBuilder {
       val dialog =  MaterialAlertDialogBuilder(context)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(positiveButtonName) { p0, p1 ->
                Toast.makeText(context, onPositiveButtonToastMsg, Toast.LENGTH_SHORT).show()
                p0.dismiss()
            }
           .setNegativeButton(NegativeButtonName) { p0, p1 ->
               Toast.makeText(context, "Ok Enjoy", Toast.LENGTH_SHORT).show()
               p0.dismiss()
           }
           .setNeutralButton(NeutralButtonName) { p0, p1 ->
               Toast.makeText(context, "Ok", Toast.LENGTH_SHORT).show()
               p0.dismiss()
           }
        dialog.show()

        return dialog
    }



    fun mDialogBox(context: Context,
                   title: String,
                   message: String,
                   positiveButtonName: String,
                   NegativeButtonName: String): MaterialAlertDialogBuilder {
        val dialog = MaterialAlertDialogBuilder(context)
                    .setTitle(title)
                    .setMessage(message)
                    .setPositiveButton(positiveButtonName) { p0, p1 ->
                        Toast.makeText(context, "You Click Yes Button", Toast.LENGTH_SHORT).show()
                        p0.dismiss()
                    }
                    .setNegativeButton(NegativeButtonName) { p0, p1 ->
                        Toast.makeText(context, "Ok Enjoy", Toast.LENGTH_SHORT).show()
                        p0.dismiss()
                    }
        dialog.show()

        return dialog
    }
}