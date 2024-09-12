package com.github.xpwu.x

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
  @Test
  fun addition_isCorrect() {
    assertEquals(4, 2 + 2)
  }

  @Test
  fun toHex() {
    val ba = ByteArray(6) {
      when(it) {
        0 -> 0x34
        1 -> 0x01
        2 -> 0xa0.toByte()
        3 -> 0xff.toByte()
        4 -> 0x3d
        5 -> 0xc0.toByte()
        else -> 0x00
      }
    }

    assertEquals("3401a0ff3dc0", ba.toHex())
  }
}


