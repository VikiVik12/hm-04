public class Class2 {
  Integer sum1;
  Integer sum2;
  public void method2() {
    int a = 4;
    System.out.println(a);
  }

  public void methodOperator() {
    Integer a = 25;
    Integer b = 12;
    Integer c = 16;
    Integer d = 18;
    sum1 = a+b;
    sum2 = c+d;
    System.out.println("сумма між a і b = "+ sum1 + " та сумма між с і d = "+ sum2);
     String result = sum1>sum2?"True": "False";
    System.out.println("sum1 більша за sum2 ? "+ result);
    sum1 = ++sum1;
    System.out.println("sum1 збільшено на 1 : " + sum1);
    sum2-=2;
    System.out.println("sum2 зменшено на 2 : " + sum2);
    boolean sumDivision = sum1 % 2 == 0 || sum2 % 2 == 0;
    System.out.println("вивести True якщо б хоча б одна із sum кратна 2  = " + sumDivision);







  }
}
