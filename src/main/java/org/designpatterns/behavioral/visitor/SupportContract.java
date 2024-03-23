package org.designpatterns.behavioral.visitor;

public class SupportContract implements ReportElement {

  private Long costPerMonth;

  public Long getCostPerMonth() {
    return costPerMonth;
  }

  public void setCostPerMonth(Long costPerMonth) {
    this.costPerMonth = costPerMonth;
  }

  public SupportContract(Long costPerMonth) {
    this.costPerMonth = costPerMonth;
  }

  @Override
  public <R> R accept(ReportVisitor<R> visitor) {
    return visitor.visit(this);
  }

}
