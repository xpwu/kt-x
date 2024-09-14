package com.github.xpwu.x

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

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

fun FileInfo(popStack:Int = 0): String {
	val st = Throwable().stackTrace[popStack+1]
	val first = if (st.fileName.length >= 15) st.fileName.length-15 else 0
	return "${st.fileName.slice(first until st.fileName.length)}:${st.lineNumber}"
}

@RequiresApi(Build.VERSION_CODES.O)
class PrintlnLogger(private val popStack:Int = 0): Logger {
	override fun Debug(tag: String, msg: String) {
		println("${LocalDateTime.now()} ${FileInfo(popStack+1)} Debug: $tag  --->  $msg")
	}

	override fun Error(tag: String, msg: String) {
		println("${LocalDateTime.now()} ${FileInfo(popStack+1)} Error: $tag  --->  $msg")
	}

	override fun Info(tag: String, msg: String) {
		println("${LocalDateTime.now()} ${FileInfo(popStack+1)} Info: $tag  --->  $msg")
	}

	override fun Warning(tag: String, msg: String) {
		println("${LocalDateTime.now()} ${FileInfo(popStack+1)} Warning: $tag  --->  $msg")
	}
}
