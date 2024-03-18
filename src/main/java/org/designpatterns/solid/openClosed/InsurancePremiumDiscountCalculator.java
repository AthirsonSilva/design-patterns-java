package org.designpatterns.solid.openClosed;

public class InsurancePremiumDiscountCalculator {

  public Integer calculatePremiumDiscount(CustomerProfile customer) {
    if (customer.isLoyalCustomer()) {
      return 20;
    }

    return 0;
  }

}
