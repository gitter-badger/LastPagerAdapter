package io.github.rakshakhegde.lastpageradapter

import android.databinding.ViewDataBinding
import java.lang.ref.SoftReference

/**
 * Created by rakshakhegde on 01/02/17.
 */
internal class PagerItem(
		val layoutId: Int,
		val model: Any?,
		val title: CharSequence?,
		val width: Float
) {
	var bindingRef: SoftReference<ViewDataBinding?>? = null
		private set

	fun bindingRef(viewDataBinding: ViewDataBinding) {
		bindingRef = SoftReference(viewDataBinding)
	}
}