package com.loylap.paulconroy.kotlinmvp.base


import android.support.v7.app.AppCompatActivity


/**
 * Base activity to which all activities will extend on.
 */
abstract class BaseActivity<out P> : AppCompatActivity() {

    private var presenter: P? = null

    open fun getPresenter(): P? {
        return presenter
    }
}
