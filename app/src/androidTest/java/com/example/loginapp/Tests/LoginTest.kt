package com.example.loginapp.Tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.loginapp.Page.LoginPage
import com.example.loginapp.ui.login.LoginActivity
import org.junit.Rule
import org.junit.Test

class LoginTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun checkLoginButtonIsUnableWithoutPasswordByPO() {
        LoginPage().setUserName("Vladimir")
            .checkLoginButtonIsDisable()
    }

    @Test
    fun checkLoginButtonIsUnableWithoutLoginByPO() {
        LoginPage().setPassword("123456")
            .checkLoginButtonIsDisable2()
    }

    @Test
    fun checkLoginButtonIsUnableWithoutFormEmpty() {
        LoginPage().setUserName("").setPassword("")
            .checkLoginButtonIsDisable()
    }
    @Test
    fun checkLoginButton(){
        LoginPage().setUserName("Vladimir").setPassword("123456")
            .checkLoginButtonIsEnabled()
    }
}