package com.loylap.paulconroy.kotlinmvp.main


import android.os.Bundle
import android.widget.Toast
import com.loylap.paulconroy.kotlinmvp.R
import com.loylap.paulconroy.kotlinmvp.base.BaseActivity

/**
 * Example activity, in this case, the Main activity holding the UI
 * ONLY UI methods and manipulations should occur here - any other logic
 * belongs in the presenter
 *
 * Created by paul conroy on 25/04/2017.
 */
class MainActivity : BaseActivity<MainPresenter>(), MainView {

    var presenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getPresenter().invokePresenterLogic()
    }

    /**
     * return an instance of the presenter implementation class
     */
    override fun getPresenter(): MainPresenterImp {
        if (presenter == null) {
            presenter = MainPresenterImp(this, this)
        }
        return presenter as MainPresenterImp
    }

    /**
     * invoked from the presenter
     */
    override fun showToast(string: String) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show()
    }
}
