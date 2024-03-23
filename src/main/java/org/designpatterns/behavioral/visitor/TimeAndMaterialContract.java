package org.designpatterns.behavioral.visitor;

public class TimeAndMaterialContract implements ReportElement {

  private Long costPerHour;
  private Long hours;

  public TimeAndMaterialContract(Long costPerHour, Long hours) {
    this.costPerHour = costPerHour;
    this.hours = hours;
  }

  public Long getCostPerHour() {
    return costPerHour;
  }

  public void setCostPerHour(Long costPerHour) {
    this.costPerHour = costPerHour;
  }

  public Long getHours() {
    return hours;
  }

  public void setHours(Long hours) {
    this.hours = hours;
  }

  @Override
  public <R> R accept(ReportVisitor<R> visitor) {
    return visitor.visit(this);
  }

}
