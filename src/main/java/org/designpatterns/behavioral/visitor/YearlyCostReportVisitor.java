package org.designpatterns.behavioral.visitor;

public class YearlyCostReportVisitor implements ReportVisitor<Long> {

  @Override
  public Long visit(FixedPriceContract contract) {
    return contract.getCostPerYear();
  }

  @Override
  public Long visit(TimeAndMaterialContract contract) {
    return contract.getCostPerHour() * contract.getHours();
  }

  @Override
  public Long visit(SupportContract contract) {
    return contract.getCostPerMonth() * 12;
  }

}
