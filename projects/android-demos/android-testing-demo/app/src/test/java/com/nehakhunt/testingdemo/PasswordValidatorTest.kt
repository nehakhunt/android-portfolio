package com.nehakhunt.testingdemo

import org.junit.Assert.*
import org.junit.Test

class PasswordValidatorTest {
    private val validator = PasswordValidator()
    @Test fun rejectsShortPassword() { assertFalse(validator.isValid("Ab12")) }
    @Test fun rejectsWithoutNumber() { assertFalse(validator.isValid("Abcdefgh")) }
    @Test fun acceptsStrongPassword() { assertTrue(validator.isValid("Android123")) }
}
