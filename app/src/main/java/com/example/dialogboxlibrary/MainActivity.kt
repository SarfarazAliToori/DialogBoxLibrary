package com.example.dialogboxlibrary

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.mydialogbox.MyDialogBox
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setContentView(myDialogBox.libraryUi(this))
//        frameLayout = findViewById(R.id.fram)
        //val myDialogBox = MyDialogBox(this)
        //myDialogBox.mExitDialogBoxWithCustomLayout(this,R.layout.dialog_box_design, R.id.btn_yes,R.id.btn_no)
//        myDialogBox.mExitDialogBoxWithCustomLayout(this,"Hello Title","Hello dialog message","Exit", "Ok Enjoy",
//            Color.CYAN,Color.GREEN)
        //myDialogBox.libraryUi(this)


    }


}