package com.willowtreeapps.signinwithapplebutton

sealed class SignInWithAppleResult {
    data class Success(val authorizationCode: String, val idToken: String, val user: SignInWithAppleUser?) : SignInWithAppleResult()

    data class Failure(val error: Throwable) : SignInWithAppleResult()

    object Cancel : SignInWithAppleResult()
}
