class Gcd {
  public static void main(String[] args) {
    int n1, n2;
    Scanner s=new Scanner(System.in);
    System.out.println("enter number 1:");
    n1=s.nextInt();
    System.out.println("enter number 2:");
    n2=s.nextInt();
    int gcd = 1;
    for (int i = 1; i <= n1 && i <= n2; ++i) {
      if (n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }
