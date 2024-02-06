package HomeWork2;


public class Task05 {
        public static void main(String args[]) {

                    int a[] = { 10,12,1,8,4 };


                    int b[] = new int[a.length];


                    b = a;




                    System.out.println("Contents of a[] ");
                    for (int i = 0; i < a.length; i++)
                        System.out.print(a[i] + " ");

                    System.out.println("\n\nContents of b[] ");
                    for (int i = 0; i < b.length; i++)
                        System.out.print(b[i] + " ");
                }
            }