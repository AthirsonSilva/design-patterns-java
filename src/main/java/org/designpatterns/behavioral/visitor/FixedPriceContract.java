package org.designpatterns.behavioral.visitor;

public class FixedPriceContract implements ReportElement {

  private Long costPerYear;

  public FixedPriceContract(Long costPerYear) {
    this.costPerYear = costPerYear;
  }

  public Long getCostPerYear() {
    return costPerYear;
  }

  public void setCostPerYear(Long costPerYear) {
    this.costPerYear = costPerYear;
  }

  @Override
  public <R> R accept(ReportVisitor<R> visitor) {
    return visitor.visit(this);
  }

}
