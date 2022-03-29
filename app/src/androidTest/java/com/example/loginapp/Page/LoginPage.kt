package com.example.loginapp.Page

import android.os.Trace.isEnabled

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId

import com.example.loginapp.R
import org.hamcrest.Matchers.not


class LoginPage {
    fun setUserName(name: String): LoginPage {
        Espresso.onView(withId(R.id.username)).perform(typeText(name))
        return this
    }

    fun checkLoginButtonIsDisable(): LoginPage {
        Espresso.onView(withId(R.id.login))
            .check(matches(not(isEnabled())))
        return this
    }
    fun setPassword(password: String): LoginPage {
        Espresso.onView(withId(R.id.password)).perform(typeText(password))
        return this
    }
    fun checkLoginButtonIsDisable2(): LoginPage {
        Espresso.onView(withId(R.id.password))
            .check(matches(not(isEnabled())))
        return this
    }
    fun checkLoginButtonIsEnabled(): LoginPage {
        Espresso.onView(withId(R.id.login))
            .perform(click())
        return this
    }


}


