package com.loylap.paulconroy.kotlinmvp.base


import android.support.v7.app.AppCompatActivity


/**
 * Base activity to which all activities will extend on. Not needed in this example.
 *
 * Created by paul conroy on 25/04/2017.
 */
abstract class BaseActivity<out P> : AppCompatActivity() {

    private var presenter: P? = null

    open fun getPresenter(): P? {
        return presenter
    }
}
