package com.example.android.navigation.presentation


interface BasePresenter<in T> {

    fun setView(view: T)
}