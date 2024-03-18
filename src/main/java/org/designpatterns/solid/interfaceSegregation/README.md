## Interface segregation principle

Interface segregation is a principle that states that clients should not be forced to depend on methods they do not use. 

## Example

- IPrint interface is used to define a print interface.
- IScanner interface is used to define a scanner interface.
- IFax interface is used to define a fax interface.

- The HPPrinterScanner class is used to implement both IPrint and IScanner interfaces.
- The XeroxWorkCentre class is used to implement all three interfaces.
- The CannoPrinter class is used to implement only IPrint interface.

A given class should not be forced to overrite methods it does not use by implementing a bigger interface that holds methods it does not use, instead, it should implement smaller and more specific interfaces that only hold methods it does use.