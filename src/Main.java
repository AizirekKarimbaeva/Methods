import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        /*int san = sc.nextInt();
                   if (san==1){
                       hello();
                   }else if (san==2){
                       bye();
            }
            }
            static void hello(){
                System.out.println("Hello");
            }
            static void bye(){
                System.out.println("Bye");
            } */


        //Aizirek
      /* aizMethod("Aizirek");
    }
    static void aizMethod(String soz) {
        System.out.println("Salam" + soz); */


        //Massiv
        /*Scanner sc = new Scanner(System.in);
        int[] mass={1,2,3,4,5,6,7,8,9,10};
        aizMethod(mass);
    }
    static void aizMethod(int[] mass) {
        System.out.println(Arrays.toString(mass));
    } */


        //2san

      /* method(10);
    }
        static  void method(int san  ) {
            for (int i = 0; i < san; i++) {
                System.out.println("*");
            }
        }  */
       /* method(13, 10);
    }
    static void method (int san,int san1) {
        System.out.println();

       }
     //jadybaldar
        /*static void jadybal() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; i <= 10; j++) {
          System.out.printf("%d*%d=%d\t", j, i, (i*j));
         }
         } */


        //2san
        int[] mass = {1, 3, 5, 7, 9, 11, 13, 15, 17, 20};
        myMethod(mass);
        int[] massv = {1, 2, 4, 6, 8, 9, 12, 34, 35, 44};
        method(massv);
    }
    static void myMethod(int[] mass) {
        System.out.println(Arrays.toString(mass));
        int maxSan = mass[0];
        for (int i = 0; i < mass.length; i++) {
            maxSan = Math.max(maxSan, mass[i]);
        }
        System.out.println("Max san" + maxSan);
    }
    static void method(int[] massv) {
        System.out.println(Arrays.toString(massv));
        int minSan = massv[0];
        for (int j = 0; j < massv.length; j++) {
            minSan = Math.min(minSan, massv[j]);
        }
        System.out.println("Min san" + minSan);
    /*jash();
    }
    static void jash() {
        System.out.println("Tuulgan jylynyz?" );
        Scanner sc = new Scanner(System.in);
        int a = 2022-sc.nextInt();
        System.out.println("Sizdin jashynyz"+a);
                             }*/

        /*san();
    }
    static void san(){
        int minSan = 20;
        int maxSan = 30;
        System.out.println(minSan);

    }*/

       /* san(20,100);

    }
    static void san(int a, int b){
        Random rn = new Random();
        int[] ar =new int[5];
        for (int i = 0; i <ar.length ; i++) {
         ar[i] = rn.nextInt(a,b);


        }

        System.out.println(Arrays.toString(ar));

    }*/


    }
}






