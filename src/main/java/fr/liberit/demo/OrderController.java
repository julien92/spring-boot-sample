package fr.liberit.demo;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
@Slf4j
public class OrderController {

	final OrderRepository orderRepository;

	@GetMapping
	public List<Order> getOrders() {
		log.info("Get orders");
		return orderRepository.findAll();
	}

}
