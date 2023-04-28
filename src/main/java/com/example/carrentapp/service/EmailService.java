package com.example.carrentapp.service;

public interface EmailService {
    void send(String toEmail, String subject, String text);
}
