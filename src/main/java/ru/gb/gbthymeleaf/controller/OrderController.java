package ru.gb.gbthymeleaf.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.gbthymeleaf.service.OrderService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public String saveOrder() {
        orderService.save();
        return "redirect:/order";
    }

    @GetMapping
    public String getOrderList(Model model) {
        model.addAttribute("orderList", orderService.findAll());
        return "order-list";
    }
}
