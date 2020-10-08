package dhkim.project.coroutineexample.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

open class BaseActivity<B: ViewDataBinding>(@LayoutRes val layoutRes: Int) : AppCompatActivity() {
    lateinit var viewDataBinding: B
        private set

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        viewDataBinding = DataBindingUtil.setContentView(this, layoutRes)
    }

    protected fun binding(action: B.() -> Unit) {
        viewDataBinding.run(action)
    }
}