package com.example.bankingapp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleGlobalException(Exception ex) {
        ModelAndView modelAndView = new ModelAndView("error"); // Указываем представление для ошибки
        modelAndView.addObject("errorMessage", "Произошла ошибка: " + ex.getMessage()); // Добавляем сообщение об ошибке в объект ModelAndView
        return modelAndView; // Возвращаем объект ModelAndView с данными об ошибке
    }
}
