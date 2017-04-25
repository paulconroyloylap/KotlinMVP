package com.loylap.paulconroy.kotlinmvp.base

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.loylap.paulconroy.kotlinmvp.R
import java.lang.ref.WeakReference

abstract class BaseActivity<out P> : AppCompatActivity() {
    private var presenter: P? = null
    private var weakRefContext: WeakReference<out Context>? = null

    fun getPresenter(): P? {
        return presenter
    }


    val viewContext: WeakReference<out Context>
        get() {
            if (weakRefContext == null) {
                weakRefContext = WeakReference(this@BaseActivity)
            }
            return weakRefContext as WeakReference<out Context>
        }
}
