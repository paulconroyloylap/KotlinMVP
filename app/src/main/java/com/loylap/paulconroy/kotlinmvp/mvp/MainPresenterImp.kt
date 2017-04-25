package com.loylap.paulconroy.kotlinmvp.mvp

import android.content.Context

/**
 * Created by paulconroy on 25/04/2017.
 */
class MainPresenterImp(activityView: MainView) : MainPresenter {

    var view: MainView = activityView

    fun showToast() {
        this.view.showToast("Hello")
    }

    override fun contactPresenter() {
        showToast()
    }



}