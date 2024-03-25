package com.myself223.weatherappotkrutogoparnya.ui

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide


fun Context.showToast(msg:String){
    Toast.makeText(this,msg,Toast.LENGTH_SHORT)
}
fun ImageView.loadImage(url:String){
    Glide.with(this).load(url).centerCrop().into(this)
}