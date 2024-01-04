package org.enricogiurin.ocp17.book.ch8.functionalinterface.primitive;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
import java.util.function.LongSupplier;

public class FunctionalInterfacesForPrimitives {

  public static void main(String[] args) {
    new FunctionalInterfacesForPrimitives().doublePredicate();
  }



  void doublePredicate() {
    DoublePredicate dp = d -> d % 2 == 0;
    System.out.println(dp.test(5.2D)); //false
    System.out.println(dp.test(6.0D)); //true
  }

  void longConsumer() {
    LongConsumer longConsumer = (long n) -> System.out.println(n);
    longConsumer.accept(10L);  //10

    final List<Long> list = new ArrayList<>();
    LongConsumer lcStorage = (n) -> list.add(n);
    lcStorage.accept(30L);
    System.out.println(list);

  }

}
