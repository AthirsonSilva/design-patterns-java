package org.designpatterns.solid.openClosed;

import java.util.Random;

public class HouseInsuranceCustomerProfile implements CustomerProfile {

  @Override
  public boolean isLoyalCustomer() {
    return new Random().nextBoolean();
  }

}
