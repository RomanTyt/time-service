package ru.tyutyakov.timeservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tyutyakov.timeservice.service.TimeService;

import java.time.LocalDateTime;


@Slf4j
@RestController
@RequestMapping(value = "api/v1/times", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:8080")
public class TimeController {
    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping
    @Operation(summary = "Получить текущую дату и время")
    public ResponseEntity<LocalDateTime> getCurrentTime() {
        LocalDateTime now = timeService.getTime();
        log.info("Метод вызван в: " + now);
        return ResponseEntity.ok(now);
    }
}

