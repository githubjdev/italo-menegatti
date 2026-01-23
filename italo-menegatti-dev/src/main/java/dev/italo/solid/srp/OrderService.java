package dev.italo.solid.srp;

public class OrderService {

	private OrderRepository orderRepository;
	private EmailService emailService;

	public void processarPedido() {
		orderRepository.salvarPedido();
		emailService.enviarEmailConfirmacao();
	}

}
