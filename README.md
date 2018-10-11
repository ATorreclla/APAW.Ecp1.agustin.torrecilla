# APAW ECP1 Patrones de Diseño
> Alumno: Torrecilla Sanchez, Agustín
> ##### [Máster en Ingeniería Web por la Universidad Politécnica de Madrid (miw-upm)](http://miw.etsisi.upm.es)
> ##### Asignatura: *Arquitectura y Patrones para Aplicaciones Web - Patrones de Diseño*

### Tecnologías necesarias
* Java
* Maven
* GitHub
* Travis-ci
* Sonarcloud<br />

[![Build Status](https://travis-ci.org/ATorreclla/APAW.Ecp1.agustin.torrecilla.svg?branch=master)](https://travis-ci.org/ATorreclla/APAW.Ecp1.agustin.torrecilla)
### Enunciado
##### Grafico de las entidades y sus relaciones
![alt text](screenshots/entities.jpg)
### Ejercicios
* 1 Factoría con patrón Singleton de la entidad.<br />
Se almacenan y se buscan las entidades por su id de la 
entidad principal,<br /> como entidad principal se refiere a 
la entidad que posee la relación,<br /> pero la factoría no los crea, 
solo gestiona los objetos.<br /> Debe ir con test de prueba<br />
Se emplea la entidad ControlCalidad y se realiza su test mediante<br />
la clase FactoriaControlCalidadSingletonTest<br />
* 2 Builder de la entidad. Debe ir con test de prueba<br />
Se utiliza la clase Conductor para su implementación. Test con ConductorBuilderTest.<br />
* 3 Patrón Composite de la entidad.<br />
La entidad no puede ser cambiada de su interfaz publico dado.<br />
Mediante el método view() se visualiza la id si es una entidad y<br />
name (String) si es una agrupación. Debe ir con test de prueba<br />
Se realiza a través de la clase Pasajero. Se implementan las clases<br />
PasajeroComponent, PasajeroComposite y PasajeroLeaf. El test PasajeroTest.<br />
* 4 Patrón Strategy.<br />
 Buscar, comprender, explicar y realizar un ejemplo propio de su funcionamiento.<br />
 ![alt text](screenshots/strategy.jpg)<br />
El patrón Strategy pertenece a la clasificación de patrones de comportamiento.<br />
La utilidad de este patrón es la de permitir que un objeto pueda tener varias operaciones disponibles<br />
para su elección. Permite diversos comportamientos o estratégias diferenciadas, tantas como estrategias<br />
diferentes se hayan implementado a partir de una inferfaz común.<br />
El objeto de forma dinámica establece la estrategia que elija.
Se realiza un ejemplo de implementación a través de diferentes operaciones sobre 2 operandos.<br />
Suma, resta, hallar la media, el logaritmo, el módulo. Se realiza una clase de Test.<br />
* 5 A la Factoría anterior, aplicarle el patrón Observer, para que cada vez que se añade un objeto nuevo,<br />
 provoque un evento. Debe ir con test de prueba.<br />
 Se emplea la clase ControlCalidad para realizar dicho patrón Observer.<br />
 Se generan las clases FactoríaObservable y FactoríaObserver. Su test FactoriaObserverTest.