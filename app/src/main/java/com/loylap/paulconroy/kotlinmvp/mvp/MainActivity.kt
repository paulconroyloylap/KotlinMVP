package com.loylap.paulconroy.kotlinmvp.mvp


import android.os.Bundle
import android.widget.Toast
import com.loylap.paulconroy.kotlinmvp.R
import com.loylap.paulconroy.kotlinmvp.base.BaseActivity


class MainActivity : BaseActivity<MainPresenter>(), MainView {

    var presenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getPresenter().invokePresenterLogic()
    }


     override fun getPresenter(): MainPresenterImp {
        if (presenter == null) {
            presenter = MainPresenterImp(this, this)
        }
        return presenter as MainPresenterImp
    }

    override fun showToast(string: String) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show()
    }
}
