package com.raven.mobile.nidda

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}