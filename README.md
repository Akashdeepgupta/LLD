# S.O.L.I.D Principle
S -> SRP(Single Responsibility Principle)  
O -> OCP(Open Closed Principle)  
L -> LSP(Liskov's Substitution Principle)  
I -> ISP(Interface Segregation Principle)  
D -> DIP(Dependency Inversion Principle)  

## Srp
#### Srp says any object/method/block should be responsible for doing only one work.
  
## Ocp
#### ocp says we should not modify the already existing code either if we want to add new features we should add new code but should not modify the existing code.  

## Lsp

#### Lsp states we can use any child class object in place of reference as it is without any special treatment.  

## Isp

#### Srp for Interfaces, every interface should do only one work, if any interface is doing multiple work then it must be segregated into multiple Interfaces.

## Dip

#### Dip says that no 2 concrete classes should depend upon each other. instead there should be something abstract between them like Interface/Abstract class.

# Design Pattern.

#### In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design

## Types of Design Pattern

1. Creational Design Pattern
2. Structural Design Pattern
3. Behavioral Design pattern

| Creational Design Pattern | Structural Design Pattern | Behavioral Design pattern |
|:--------------------------|--------------------------:|:-------------------------:|
| Singleton                 |                 Adaptable |         Strategy          |
| Builder                   |                    Facade |         Observer          |
| Factory                   |                 Decorator |                           |
| Protoype                  |                 Flyweight |                           |
| Registry                  |                           |                           |  


## 1. Singleton Design Pattern

#### Singleton Design pattern is used when there need of single instance of the object which has to be shared among all the resources.