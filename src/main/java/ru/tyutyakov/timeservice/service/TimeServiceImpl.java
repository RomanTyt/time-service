package ru.tyutyakov.timeservice.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TimeServiceImpl implements TimeService{
    @Override
    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }
}
