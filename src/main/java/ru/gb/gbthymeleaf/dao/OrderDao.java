package ru.gb.gbthymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.gbthymeleaf.entity.Order;

public interface OrderDao extends JpaRepository<Order, Long> {
}
