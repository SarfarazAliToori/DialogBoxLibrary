package com.example.mydialogbox

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MyDialogBox(ap : AppCompatActivity) {
    val mAppContex = ap

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
        noButtonId: Int
    ): AlertDialog {
        val mDialogView = View.inflate(context,layoutResourceId,null)
        val exit = mDialogView.findViewById<Button>(yesButtonId)
        val no = mDialogView.findViewById<Button>(noButtonId)
        val mAlertDialog = AlertDialog.Builder(context)
            .setView(mDialogView).show()
//        mAlertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        // action perform on buttons
        exit.setOnClickListener(View.OnClickListener {
            mAppContex.finish()
            Toast.makeText(context, "Exit", Toast.LENGTH_SHORT).show()
            mAlertDialog.dismiss()
        })

        no.setOnClickListener(View.OnClickListener {
            mAlertDialog.dismiss()
            Toast.makeText(context, "Ok Enjoy", Toast.LENGTH_SHORT).show()
        })

        return mAlertDialog
    }


    ///////////


    fun mExitDialogBoxWithCustomLayout(
        context: Context,
        layoutResourceId: Int,
        yesButtonId: Int,
        noButtonId: Int,
        onExitButtonToastMsg: String,
        onNoButtonToastMsg: String
    ): AlertDialog {
        val mDialogView = View.inflate(context,layoutResourceId,null)
        val exit = mDialogView.findViewById<Button>(yesButtonId)
        val no = mDialogView.findViewById<Button>(noButtonId)
        val mAlertDialog = AlertDialog.Builder(context)
            .setView(mDialogView).show()
//        mAlertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        // action perform on buttons
        exit.setOnClickListener(View.OnClickListener {
            mAppContex.finish()
            Toast.makeText(context, onExitButtonToastMsg, Toast.LENGTH_SHORT).show()
            mAlertDialog.dismiss()
        })

        no.setOnClickListener(View.OnClickListener {
            mAlertDialog.dismiss()
            Toast.makeText(context, onNoButtonToastMsg, Toast.LENGTH_SHORT).show()
        })

        return mAlertDialog
    }

    //////


    fun mExitDialogBoxWithCustomLayout(
        context: Context,
        title: String,
        message: String,
        onExitButtonToastMsg: String,
        onNoButtonToastMsg: String
    ): AlertDialog {
        val mDialogView = View.inflate(context,R.layout.mdialog_box_design,null)
        val yes = mDialogView.findViewById<Button>(R.id.btn_yes)
        val no = mDialogView.findViewById<Button>(R.id.btn_no)
        val mtitle = mDialogView.findViewById<TextView>(R.id.tv_title)
        val mmessage = mDialogView.findViewById<TextView>(R.id.tv_message)
        mtitle.text = title
        mmessage.text = message
        val mAlertDialog = AlertDialog.Builder(context)
            .setView(mDialogView).show()
        mAlertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        // action perform on buttons
        yes.setOnClickListener(View.OnClickListener {
            mAppContex.finish()
            Toast.makeText(context, onExitButtonToastMsg, Toast.LENGTH_SHORT).show()
            mAlertDialog.dismiss()
        })

        no.setOnClickListener(View.OnClickListener {
            mAlertDialog.dismiss()
            Toast.makeText(context, onNoButtonToastMsg, Toast.LENGTH_SHORT).show()
        })

        return mAlertDialog
    }

    fun mExitDialogBoxWithCustomLayout(
        context: Context,
        title: String,
        message: String,
        onExitButtonToastMsg: String,
        onNoButtonToastMsg: String,
        backgroundColor: Int,
        buttonsBackgroundColor: Int
    ): AlertDialog {
        val mDialogView = View.inflate(context,R.layout.mdialog_box_design,null)
        mDialogView.setBackgroundColor(backgroundColor)
        val yes = mDialogView.findViewById<Button>(R.id.btn_yes)
        val no = mDialogView.findViewById<Button>(R.id.btn_no)
        yes.setBackgroundColor(buttonsBackgroundColor)
        no.setBackgroundColor(buttonsBackgroundColor)
        val mtitle = mDialogView.findViewById<TextView>(R.id.tv_title)
        val mmessage = mDialogView.findViewById<TextView>(R.id.tv_message)
        mtitle.text = title
        mmessage.text = message
        val mAlertDialog = AlertDialog.Builder(context)
            .setView(mDialogView).show()
        mAlertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        // action perform on buttons
        yes.setOnClickListener(View.OnClickListener {
            mAppContex.finish()
            Toast.makeText(context, onExitButtonToastMsg, Toast.LENGTH_SHORT).show()
            mAlertDialog.dismiss()
        })

        no.setOnClickListener(View.OnClickListener {
            mAlertDialog.dismiss()
            Toast.makeText(context, onNoButtonToastMsg, Toast.LENGTH_SHORT).show()
        })

        return mAlertDialog
    }


    // this function is accessing mdialog_box_design in your project.
    fun libraryUi(
        context: Context
    ): View {
       val mDialogView = View.inflate(context,R.layout.mdialog_box_design,null)
        return mDialogView
    }


}