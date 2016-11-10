##SolidExamples
The repository contains Java source code examples of S.O.L.I.D principles with explanation.

###S.O.L.I.D.
According to [wiki](https://en.wikipedia.org/wiki/SOLID_(object-oriented_design)) SOLID is a mnemonic acronym introduced by Michael Feathers for the "first five principles" named by Robert C. Martin in the early 2000s that stands for five basic principles of object-oriented programming and design. The intention is that these principles, when applied together, will make it more likely that a programmer will create a system that is easy to maintain and extend over time. The principles of SOLID are guidelines that can be applied while working on software to remove code smells by providing a framework through which the programmer may refactor the software's source code until it is both legible and extensible.

###Short overview
  * **Single responsibility principle**
  
  *A class should have only a single responsibility.*
  Only one potential change in the software's specification should be able to affect the specification of the class.
  * **Open/closed principle**
  
  *Software entities should be open for extension, but closed for modification.*
  Imagine our class as "black box" and look if we can chage its behavior.
  * **Liskov substitution principle**
  
  *Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.*
  Class inherited from some base class should work with predictable results.
  * **Interface segregation principle**
  
  *Many client-specific interfaces are better than one general-purpose interface.*
  Split your interfaces by grouping methods by related tasks.
  * **Dependency inversion principle**
  
  *Depend upon Abstractions. Do not depend upon concretions.*
  Replace concrete dependencies to abstract dependecies.
  
###Links
   https://en.wikipedia.org/wiki/SOLID_(object-oriented_design)
   
   https://habrahabr.ru/post/208442/
   
   [http://info.javarush.ru/] (http://info.javarush.ru/translation/2013/08/06/%D0%9F%D1%8F%D1%82%D1%8C-%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D1%85-%D0%BF%D1%80%D0%B8%D0%BD%D1%86%D0%B8%D0%BF%D0%BE%D0%B2-%D0%B4%D0%B8%D0%B7%D0%B0%D0%B9%D0%BD%D0%B0-%D0%BA%D0%BB%D0%B0%D1%81%D1%81%D0%BE%D0%B2-S-O-L-I-D-%D0%B2-Java.html)
   
   https://dou.ua/lenta/articles/liskov-substitution-principle/
