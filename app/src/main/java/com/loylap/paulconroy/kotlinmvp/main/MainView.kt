package com.loylap.paulconroy.kotlinmvp.main


/**
 * The view allows the presenter implementation to interact with the activity UI
 *
 * Created by paul conroy on 25/04/2017.
 */
interface MainView {

    /**
     * Display a toast on the UI
     * @param string the toast message
     */
    fun showToast(string: String)

}