package com.github.xpwu.x

import android.util.Log

interface Logger {
	fun Debug(tag: String, msg: String)
	fun Info(tag: String, msg: String)
	fun Warning(tag: String, msg: String)
	fun Error(tag: String, msg: String)
}

class AndroidLogger: Logger {
	override fun Debug(tag: String, msg: String) {
		Log.d(tag, msg)
	}

	override fun Info(tag: String, msg: String) {
		Log.i(tag, msg)
	}

	override fun Warning(tag: String, msg: String) {
		Log.w(tag, msg)
	}

	override fun Error(tag: String, msg: String) {
		Log.e(tag, msg)
	}

}
