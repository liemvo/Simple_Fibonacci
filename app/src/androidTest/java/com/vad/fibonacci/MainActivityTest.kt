package com.vad.fibonacci

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest

class MainActivityTest {

    @Rule @JvmField
    val activityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.vad.fibonacci", appContext.packageName)
    }

    @Test
    fun clickNext() {
        // verify original view
        onView(withId(R.id.resultTextView)).check(matches(withText("2 = 1 + 1")))

        // next
        onView(withId(R.id.next)).perform(click())
        // verify
        onView(withId(R.id.resultTextView)).check(matches(withText("3 = 2 + 1")))

        // next
        onView(withId(R.id.next)).perform(click())
        // verify
        onView(withId(R.id.resultTextView)).check(matches(withText("5 = 3 + 2")))
    }
}