# Time Service

Time Service - сервис, предназначенный для предоставления текущей даты и времени, построенный на Spring Boot.

## Требования

- Java 17
- Maven 3.x

## Установка

1. Склонируйте репозиторий:

    ```bash
    git clone https://github.com/RomanTyt/time-service.git
    cd time-service
    ```

2. Соберите проект с помощью Maven:

    ```bash
    mvn clean install
    ```

3. Запустите приложение:

    ```bash
    java -jar target\time-service-0.0.1-SNAPSHOT.war
    ```

Приложение будет доступно по адресу [http://localhost:8181](http://localhost:8181).

## В проекте подключены (автоматически подтягиваются):

* _Swagger_ - автоматически генерирует спецификацию проекта

## Использование

Проект предоставляет REST API для предоставления текущей даты и времени. Документация API доступна по адресу [http://localhost:8181/swagger-ui/index.html#/](http://localhost:8181/swagger-ui/index.html#/).
