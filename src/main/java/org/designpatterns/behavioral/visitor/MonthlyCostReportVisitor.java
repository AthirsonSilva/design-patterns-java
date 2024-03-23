package org.designpatterns.behavioral.visitor;

public class MonthlyCostReportVisitor implements ReportVisitor<Long> {

  @Override
  public Long visit(FixedPriceContract contract) {
    return contract.getCostPerYear() / 12;
  }

  @Override
  public Long visit(TimeAndMaterialContract contract) {
    return (contract.getCostPerHour() * contract.getHours()) / 12;
  }

  @Override
  public Long visit(SupportContract contract) {
    return contract.getCostPerMonth();
  }

}
