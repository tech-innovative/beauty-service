package com.techinnovative.beauty.integration;

import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ActiveProfiles;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Tag("IntegrationTests")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = "server.port=0")
//@AutoConfigureWireMock(port = 0, stubs = "classpath:wiremockstubs/mappings", files = "classpath:wiremockstubs")
@AutoConfigureMockMvc
@ActiveProfiles(profiles = {"test"})
@Retention(RetentionPolicy.RUNTIME)
public @interface IntegrationTest {

    @AliasFor(annotation = SpringBootTest.class, attribute = "webEnvironment")
    SpringBootTest.WebEnvironment webEnvironment() default SpringBootTest.WebEnvironment.RANDOM_PORT;

    @AliasFor(annotation = SpringBootTest.class, attribute = "properties")
    String[] properties() default {};
}
