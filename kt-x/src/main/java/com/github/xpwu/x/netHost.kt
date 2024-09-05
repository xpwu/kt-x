package com.github.xpwu.x

fun Net2Host(data: ByteArray, pos: Int = 0, end: Int = data.size): Long {
  var ret: Long = 0
  for (i in pos until end) {
    ret = (ret shl 8) + (data[i].toInt() and 0xff)
  }
  return ret
}


fun Host2Net(value: Long, ret: ByteArray, pos: Int = 0, end: Int = ret.size) {
  var v1 = value
  for (i in end - 1 downTo pos) {
    ret[i] = (v1 and 0xffL).toByte()
    v1 = v1 shr 8
  }
}


