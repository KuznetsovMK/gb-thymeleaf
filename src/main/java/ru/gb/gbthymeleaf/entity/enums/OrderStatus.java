package ru.gb.gbthymeleaf.entity.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum OrderStatus {
    ACTIVE("В работе"), DISABLED("Отменен");

    private final String title;
}
