import java.util.Arrays;

public class SelectionSort {
    private SelectionSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){
        for(int i=0;i<arr.length;i++){
            //选择arr[i...n) 中的最小值的索引
            int minIndex = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j].compareTo(arr[minIndex]) <0){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;

    }
//    public static void main(String[] args){
//        Integer[] arr={1,4,2,3,6,5};
//        SelectionSort.sort(arr);
//        for(int e:arr){
//            System.out.print(e+" ");
//        }
//        System.out.println();
//
//        Student[] students ={
//                new Student("Alice",98),
//                new Student("Bobo",100),
//                new Student("Charles",66),
//        };
//        SelectionSort.sort(students);
//        for(Student student:students){
//            System.out.print(student + " ");
//        }
//    }
    public static void main(String[] args){
        int[] dataSize={10000,100000};
        for(int n: dataSize){
            Integer[] arr=ArrayGenerator.generateRandomArray(n,n);
            SortingHelper.sortTest("SelectionSort",arr);
        }


//        long startTime=System.nanoTime();
//        SelectionSort.sort(arr);
//        long endTime=System.nanoTime();
//        double time=(endTime-startTime) /100000000.0;
////        for(int e:arr){
////            System.out.print(e+" ");
////        }
//        if(!SortingHelper.isSorted(arr)){
//            throw new RuntimeException("SelectionSort failed");
//        }
//        System.out.println(time);
    }

}
