package com.github.xpwu.x

private const val LOWER_CASE_HEX_DIGITS = "0123456789abcdef"

fun ByteArray.toHex(): String {
	val strB = StringBuilder()
	for (i in indices) {
		strB.append(LOWER_CASE_HEX_DIGITS[(this[i].toInt() shr 4) and 0x0f])
		strB.append(LOWER_CASE_HEX_DIGITS[this[i].toInt() and 0x0f])
	}

	return strB.toString()
}



