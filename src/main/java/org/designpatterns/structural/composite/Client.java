package org.designpatterns.structural.composite;

public class Client {

  public static void main(String[] args) {
    Composite computer = new Composite("PC");
    Equipment processor = new Equipment("Processor", 1000);
    Equipment memory = new Equipment("Memory", 2000);
    Equipment hdd = new Equipment("HDD", 500);
    Equipment rom = new Equipment("ReadOnly Memory", 500);
    Equipment ram = new Equipment("Random Access Memory", 750);

    computer.add(processor).add(ram).add(memory).add(hdd).add(rom);

    System.out.println(computer.getPrice());
  }

}
