public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World111!");
//        System.out.println("Hello, World222!");
int[] array = {5, 15, 20, 30, 10000};

int max = array[0];
int temp;

        for (int i = 0; i < array.length/2; i++) {
           temp = array[i]  ;
           array[i] = array[array.length-1-i];
           array[array.length-1-i] = temp;
            }

      printArray(array);


        }
        public static void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        }











    }


