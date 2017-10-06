package test01;
class A {
  public void foo() { System.out.println("A.foo()"); }
}
class B extends A {
  public void foo() { System.out.println("B.foo()"); }
}
class C extends B {
  public void foo() { System.out.println("C.foo()"); }
}
class Test {
  public static void main(String [] args) {
    B b = new C();
    b.foo();
  }
}
