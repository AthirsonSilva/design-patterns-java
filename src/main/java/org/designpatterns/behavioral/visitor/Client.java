package org.designpatterns.behavioral.visitor;

import java.util.List;

public class Client {

  public static void main(String[] args) {
    var projectAlpha = new FixedPriceContract(10_000L);
    var projectBeta = new SupportContract(20_000L);
    var projectGamma = new TimeAndMaterialContract(30L, 40L);

    List<ReportElement> projects = List.of(projectAlpha, projectBeta, projectGamma);

    var monthlyReport = new MonthlyCostReportVisitor();
    var yearlyReport = new YearlyCostReportVisitor();

    var monthlyCost = 0;
    var yearlyCost = 0;

    for (ReportElement project : projects) {
      monthlyCost += project.accept(monthlyReport);
      yearlyCost += project.accept(yearlyReport);
    }

    System.out.println("Monthly cost: " + monthlyCost);
    System.out.println("Yearly cost: " + yearlyCost);
  }

}
