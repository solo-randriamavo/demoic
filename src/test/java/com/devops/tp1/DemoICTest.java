package com.devops.tp1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoICTest {
    @Test
    void greetsTheProvidedName() {
        assertEquals("Bonjour, Jenkins !", DemoIC.greeting("Jenkins"));
    }

    @Test
    void usesDefaultNameForBlankInput() {
        assertEquals("Bonjour, DevOps !", DemoIC.greeting("  "));
    }
}
