Проект состоит из двух частей:

1) Автоматизация пользовательских действий на сайте http://automationpractice.com
2) Автоматизация тестирования функций web-сервиса проекта WKDA http://wkda.de

Для реализации первой части работы был использован инструмент Selenide и паттерн 
проектирования PageObject. В качестве тестового фреймворка был использован TestNG.
В тестах присутствует параметризация, все ключевые для теста переменные задаются
в файле testng.xml, в том числе средствами параметризации реализован параллельный
запуск автотестов. Тесты запускаются в Selenoid-контейнере. Если планируется запуск 
автотестов из данного проекта на другой машине не забудьте поменять host и port 
контейнера на те, что используются у вас. Отчетность в тесте реализована с помощью
maven плагина surefire-report.

Для реализации второй части работы были использована библиотека Rest Assured для тестирования
REST-сервисов, а также фреймворки Hamcrest и TestNG. Для формирования 
POST запросов используется библиотека JSON.simple. Все EndPoints для REST-сервисов
описаны с помощью Enum классов.  
