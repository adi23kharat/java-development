@FunctionalInterface 
interface A{
  int add(int i,int j);
}

class lambdas{
  public static void main(String[] args) {
    A obj = (int i,int j)-> i+j;
            
            System.out.println(obj.add(4,5));
  }
}