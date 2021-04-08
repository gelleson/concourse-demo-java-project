package epam.altynbek.spring_boot.rest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void getValue() {
        assertEquals(Demo.getValue(), 12L);
    }
}