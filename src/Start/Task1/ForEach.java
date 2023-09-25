package Start.Task1;

//public class ForEach {
//    public static void main(String[] args) {
//        int[] numbtrs = {1,8,3,4,5};
//        for(int foat: numbtrs){
//            System.out.println(foat);
//        }
//
//    }
//}
//public class ForEach {
    //    public static void main(String[] args) {
//        int[] numbtrs = {3,2,10,5,8,1,11,8,3,4,5};
//        for(int i: numbtrs){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//
//        }
//
//    }
//}
//Распечатать все элементы под индексами из массива number
    public class ForEach {
        public static void main(String[] args) {
            int[] numbers = {3, 2, 10, 5, 8};
            for (int i = 0; i < numbers.length; i += 2) {
                System.out.println(numbers[i]);
            }
        }
    }
