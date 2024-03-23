package org.designpatterns.behavioral.visitor;

public interface ReportVisitor<R> {

  public R visit(FixedPriceContract contract);

  public R visit(TimeAndMaterialContract contract);

  public R visit(SupportContract contract);

}
