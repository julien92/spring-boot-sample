package fr.liberit.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Autowired private TestRestTemplate testRestTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void should_get_orders() {
		ResponseEntity<Order[]> response = testRestTemplate.getForEntity("/orders", Order[].class);

		final var orders = response.getBody();
		Assertions.assertThat(orders).isNotNull().hasSize(1);
	}


}
