package com.loylap.paulconroy.kotlinmvp.mvp


/**
 * The view allows the presenter implementation to interact with the activity UI
 * Created by paulconroy on 25/04/2017.
 */
interface MainView {

    /**
     * Display a toast on the UI
     * @param string the toast message
     */
    fun showToast(string:String)

}