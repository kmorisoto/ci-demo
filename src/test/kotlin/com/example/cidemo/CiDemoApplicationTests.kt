package com.example.cidemo

import org.junit.Assert
import org.junit.Test
import java.util.*

class CiDemoApplicationTests {

    @Test
    fun test1() {
        val random = Random().nextInt(10) % 2
        Assert.assertEquals(0, random)
    }

    @Test
    fun test2() {
        val random = Random().nextInt(10) % 2
        Assert.assertEquals(0, random)
    }
}
