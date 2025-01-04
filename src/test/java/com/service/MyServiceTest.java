package com.example.project.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {
    @Test
    void testProcess() {
        MyService service = new MyService();
        String result = service.process("TestInput");
        assertEquals("Processed: TestInput", result);
    }
}
