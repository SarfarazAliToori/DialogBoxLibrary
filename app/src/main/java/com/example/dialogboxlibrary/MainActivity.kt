package com.example.dialogboxlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mydialogbox.MyDialogBox
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDialogBox = MyDialogBox(this)
        myDialogBox.mExitDialogBoxWithCustomLayout(this,R.layout.dialog_box_design, R.id.btn_yes,R.id.btn_no)
    }


}