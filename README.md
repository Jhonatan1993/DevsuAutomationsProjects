# DevsuAutomationsProjects
Este repositorio contiene dos proyectos de automatizacion uno E2E del lado del Frontend y otro de API del lado del Backend.
a continuacion podra encontrar una guia paso a paso de como ejecutar los protectos.


## 1. Proyecto de automatización de pruebas para <SauceDemo_Front_Test>
Este proyecto Gradle - Java usando Serenity, Selenium Web Driver, Cucumber, libreria de bonigarcia y a través del patrón 
de automatización ScreenPlay, implementa diferentes escenarios de prueba para
asegurar la calidad del sistema bajo prueba.
#### Url pagina web saucedemo: 
```
https://www.saucedemo.com/
```


Para ejecutar el proyecto por favor importar el build.gradle en el IDE Java de su
preferencia. Para ejecutar todos los casos de prueba por favor ejecutar el comando:


```
./gradlew clean test aggregate
```

## Los escenarios de prueba implementados son:

### Escenario:
#Feature: As a saucedemo user I want to enter the website to buy products online
- Validate the purchase flow of products on the saucedemo pageEscenario de prueba 1

## Reporte
<img width="1417" alt="image" src="https://github.com/Jhonatan1993/DevsuAutomationsProjects/assets/12676799/2b07622e-915c-45ce-b040-1ba1ddc5efd4">
<img width="1377" alt="image" src="https://github.com/Jhonatan1993/DevsuAutomationsProjects/assets/12676799/279ba527-37df-48b8-9aae-9f64b7ee8e45">

## 2. Proyecto de automatización de pruebas para <Swagger_Petstore_Api_Test>
Este proyecto Gradle - Java usando SerenityRest, cucumber y a través del patrón 
de automatización ScreenPlay, implementa diferentes escenarios de prueba para
asegurar la calidad del servicio Rest bajo prueba.
#### Url pagina web saucedemo: 
```
  https://petstore.swagger.io/
```

Para ejecutar el proyecto por favor importar el build.gradle en el IDE Java de su
preferencia. Para ejecutar todos los casos de prueba por favor ejecutar el comando:


```
./gradlew clean test aggregate
```

## Los escenarios de prueba implementados son:

#### Feature: As a petstore user I want to be able to create new users to enter the system

#### Escenario 1:
- Validate the creation of a new user

#### Escenario 2:
- Validate get user created by username
  
#### Escenario 3:
- Update a user's name and email

#### Escenario 4:
- Delete an existing user

## Reporte
<img width="1410" alt="image" src="https://github.com/Jhonatan1993/DevsuAutomationsProjects/assets/12676799/29af17d9-7a6d-4c59-b808-d151210a9090">
<img width="1376" alt="image" src="https://github.com/Jhonatan1993/DevsuAutomationsProjects/assets/12676799/ae7124f1-8e0e-4e6a-aee2-046036e4a747">
<img width="1376" alt="image" src="https://github.com/Jhonatan1993/DevsuAutomationsProjects/assets/12676799/2ebfbdc1-d66f-472a-9ffc-84888e1f12a8">

## Recursos
#### Ide: Intelijin Idea
#### Lenguaje utilizado: Java
#### Patron de diseño: Screemplay
#### Framework: Cucumber, Serennity, SerenityRest
#### Url pagina web saucedemo: https://www.saucedemo.com/
#### Url Api PetStore: https://petstore.swagger.io/

#### Autor: Jhonatan Paternina Rojas - QA Automation Tester.







  
