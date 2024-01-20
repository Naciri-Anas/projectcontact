package com.app;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MainAppTest {
    @Test
    void contextLoads() {
        // This test method checks that the Spring application context loads successfully.
        // If the context loads without any issues, the test will pass.
        assertNotNull("The Spring context should not be null");
    }

}