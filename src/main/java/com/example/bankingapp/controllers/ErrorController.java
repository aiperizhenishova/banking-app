package com.example.bankingapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/error")
    public String showErrorPage(Model model) {
        // Добавляем информацию об ошибке в объект Model
        model.addAttribute("errorMessage", "Произошла ошибка при обработке вашего запроса.");
        model.addAttribute("errorCode", "500"); // Пример кода ошибки

        // Возвращаем представление error.html
        return "error";
    }
}
