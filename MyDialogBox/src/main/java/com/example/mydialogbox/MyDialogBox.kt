package com.example.mydialogbox

import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintSet
import com.google.android.material.dialog.MaterialAlertDialogBuilder

object MyDialogBox {

    fun mToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
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
                p0.dismiss()
            }
            .setNegativeButton(NegativeButtonName) { p0, p1 ->
                p0.dismiss()
            }
        dialog.show()

        return dialog
    }

    fun mDialogBox(context: Context,
                   title: String,
                   message: String,
                   positiveButtonName: String,
                   NegativeButtonName: String,
                   NeutralButtonName: String,
                   onPositiveButtonToastMsg: String,
                   onNegativeButtonMsg: String) : MaterialAlertDialogBuilder {
       val dialog =  MaterialAlertDialogBuilder(context)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(positiveButtonName) { p0, p1 ->
                Toast.makeText(context, onPositiveButtonToastMsg, Toast.LENGTH_SHORT).show()
                p0.dismiss()
            }
           .setNegativeButton(NegativeButtonName) { p0, p1 ->
               Toast.makeText(context, onNegativeButtonMsg, Toast.LENGTH_SHORT).show()
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
                   NegativeButtonName: String,
                   NeutralButtonName: String,
                   onPositiveButtonToastMsg: String,
                   onNegativeButtonToastMsg: String,
                   onNeutralButtonToastMsg: String) : MaterialAlertDialogBuilder {
        val dialog =  MaterialAlertDialogBuilder(context)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(positiveButtonName) { p0, p1 ->
                Toast.makeText(context, onPositiveButtonToastMsg, Toast.LENGTH_SHORT).show()
                p0.dismiss()
            }
            .setNegativeButton(NegativeButtonName) { p0, p1 ->
                Toast.makeText(context, onNegativeButtonToastMsg, Toast.LENGTH_SHORT).show()
                p0.dismiss()
            }
            .setNeutralButton(NeutralButtonName) { p0, p1 ->
                Toast.makeText(context, onNeutralButtonToastMsg, Toast.LENGTH_SHORT).show()
                p0.dismiss()
            }
        dialog.show()

        return dialog
    }


    fun mExitDialogBoxWithCustomLayout(
        context: Context,
        layoutResourceId: Int,
        yesButtonId: Int,
        noButtonId: Int,
    ): AlertDialog {
        val mDialogView = View.inflate(context,layoutResourceId,null)
        val exit = mDialogView.findViewById<Button>(yesButtonId)
        val no = mDialogView.findViewById<Button>(noButtonId)
        val mAlertDialog = AlertDialog.Builder(context)
            .setView(mDialogView).show()
//        mAlertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        // action perform on buttons
        exit.setOnClickListener(View.OnClickListener {
            mAlertDialog.ownerActivity?.finish()
            Toast.makeText(context, "Exit", Toast.LENGTH_SHORT).show()
        })

        no.setOnClickListener(View.OnClickListener {
            mAlertDialog.dismiss()
            Toast.makeText(context, "Ok Enjoy", Toast.LENGTH_SHORT).show()
        })

        return mAlertDialog
    }


}