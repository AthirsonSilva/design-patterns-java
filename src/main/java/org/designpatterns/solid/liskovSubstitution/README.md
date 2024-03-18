## Liskov substitution principle

Liskov substitution principle (LSP) states that a subclass should be substitutable for its base class without breaking the application, and vice versa.

## Example

- Product class has `getDiscount` method that returns the discount of the product
- InHouseProduct class has extends Product class and has `getDiscount` method that returns a bigger discount than the parent class

These classes are substitutable for each other without breaking the application and vice versa, since they both have `getDiscount` method that returns the same value but the implementation is different