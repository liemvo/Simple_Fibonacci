package com.vad.fibonacci



import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    lateinit var sut : MainViewModel
    @Before
    fun setUp() {
        sut = MainViewModel()
    }

    @Test
    operator fun next() {
        sut.next()
        assertEquals("2 = 1 + 1", sut.text.get())

        sut.next()
        assertEquals("3 = 2 + 1", sut.text.get())

        sut.next()
        assertEquals("5 = 3 + 2", sut.text.get())

        sut.next()
        assertEquals("8 = 5 + 3", sut.text.get())

        sut.next()
        assertEquals("13 = 8 + 5", sut.text.get())
    }
}