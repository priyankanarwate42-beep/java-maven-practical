package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {

	App app = new App();
	
	assertEqual(10, app.add(5, 5));

    }
}

