package com.nehakhunt.testingdemo

class PasswordValidator { fun isValid(value: String): Boolean = value.length >= 8 && value.any(Char::isDigit) && value.any(Char::isUpperCase) }
