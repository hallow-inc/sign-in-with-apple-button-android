package com.willowtreeapps.signinwithapplebutton

import org.json.JSONObject

data class SignInWithAppleUser(private var jsonStr: String) {
    val email: String
    val firstName: String
    val lastName: String

    init {
        val jsonObj = JSONObject(jsonStr)
        this.email = jsonObj.getString("email")
        this.firstName = jsonObj.getJSONObject("name").getString("firstName")
        this.lastName = jsonObj.getJSONObject("name").getString("lastName")
    }
}