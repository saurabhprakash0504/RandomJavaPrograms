 public class TestClass {

            public static void main(String[] args) {

                 int val = 5;

                 MyObj obj = new MyObj(10);

            new TestClass().checkVal( obj, val);

            System.out.println(obj.getx());

            System.out.println(val);

  }

  public void checkVal(MyObj obj, int i){

  //obj = new MyObj(i+10);

  obj.setx(100);

  i=10;

  }

}

    

