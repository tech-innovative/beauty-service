package com.techinnovative.beauty;

import com.techinnovative.beauty.integration.IntegrationTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@Tag("IntegrationTests")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = "server.port=0")
//@AutoConfigureWireMock(port = 0, stubs = "classpath:wiremockstubs/mappings", files = "classpath:wiremockstubs")
@AutoConfigureMockMvc
@ActiveProfiles(profiles = {"test"})
class BookingServiceApplicationTest {

	@Test
	void contextLoads() {
	}
}
