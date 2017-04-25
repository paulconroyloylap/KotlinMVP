package com.loylap.paulconroy.kotlinmvp.main

import android.content.Context
import com.loylap.paulconroy.kotlinmvp.R

/**
 * The presenter implementation implements logic methods. No UI methods are to be placed here,
 * only logic, api calls etc.
 *
 * Created by paul conroy on 25/04/2017.
 */
class MainPresenterImp(activityView: MainView, activityContext: Context) : MainPresenter {

    var view: MainView = activityView
    var context: Context = activityContext

    /**
     * logic method invoked - pass value or display UI changes to the activity using
     * the view interface
     */
    override fun invokePresenterLogic() {
        showToast()
    }

    fun showToast() {
        this.view.showToast(context.getString(R.string.toast_message))
    }

}