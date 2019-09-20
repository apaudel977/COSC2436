package Homework3;
//This is a merge sort algorithm
import java.io.*;
import java.util.*;

public class BSMRsort {

    static long MergeIterations = 0;
    static int RadixIterations = 0;

    public static void main(String args[]) throws IOException {

        File file = new File("primes1.txt");
        Scanner infile = new Scanner(file);

        int N = 78498, A;

        int[] data1 = new int[N];  //bubble sort

        int[] data2 = new int[N];   //selection sort

        ArrayList<Integer> data3 = new ArrayList<Integer>();    //merge sort
        ArrayList<Integer> data4 = new ArrayList<Integer>();    //radix sort

        for (int i = 0; i < N; i++) {
            A = infile.nextInt();
            data1[i] = A;
            data2[i] = A;
            data3.add(A);
            data4.add(A);
        }

        //Bubble sort algorithm:
        //.......

        long start = System.nanoTime();
        long BubbleIterations = 0;
        int Temp;
        for (int x=0; x<N; x++)
        {
            BubbleIterations++;
            for (int y=0; y<N-1; y++)
            {
                // compare data[y] & data[y+1] and swap if needed
                if (data1[y] > data1[y+1])
                {
                    Temp = data1[y];
                    data1[y] = data1[y+1];
                    data1[y+1] = Temp;
                }
            }
        }
        long end = System.nanoTime();

        System.out.println("1. Bubble Sort");
        System.out.printf("Seconds to sort = %fs%n", ( (double) (end-start)/1000000000));
        System.out.println("Number of iterations = " + BubbleIterations);
        System.out.println("First 10: ");

        for(int b=0; b<=9; b++)
        {
            System.out.print(data1[b] + " ");
        }
        System.out.println();
        System.out.println("Last 10: ");
        for(int b= N-10; b<=N-1; b++ )
        {
            System.out.print(data1[b] + " ");
        }

        System.out.println();

        //Selection Sort......
        //.....

        System.out.println();
        int min;
        long start1 = System.nanoTime();
        long SelectionIterations = 0;
        for (int x=0; x<N; x++)
        {
            SelectionIterations++;
            min = x;  // data[x] will start as the smallest value
            for (int y=x; y<N; y++)
            {
                if (data2[y] < data2[min])
                {
                    min = y;
                }
            }
            // swap data[x] with data[min]
            Temp = data2[x];
            data2[x] = data2[min];
            data2[min] = Temp;
        }
        long end1 = System.nanoTime();
        System.out.println("2. Selection Sort");
        System.out.printf("Seconds to sort = %fs%n", ( (double) (end1-start1)/1000000000));
        System.out.println("Number of iterations = "+ SelectionIterations);
        System.out.println("First 10: ");

        for(int s=0; s<=9; s++)
        {
            System.out.print(data2[s] + " ");
        }
        System.out.println();

        System.out.println("Last 10: ");

        for(int s=N-10; s<=N-1; s++)
        {
            System.out.print(data2[s] + " ");
        }


        System.out.println();

        //Merge Sort.........
        //.........
        long start2 = System.nanoTime();
        data3 = MergeSort(data3);
        long end2 = System.nanoTime();
        System.out.println();
        System.out.println("3. Merge Sort");
        System.out.printf("Seconds to sort = %fs%n", ( (double) (end2-start2)/1000000000));
        System.out.println("Number of iterations = " + MergeIterations );
        System.out.println("First 10: ");

        for(int i=0; i<=9; i++)
        {
            System.out.print((data3.get(i) + " "));
        }

        System.out.println();

        System.out.println("Last 10: ");

        for(int i = N-10; i<=N-1; i++)
        {
            System.out.print(data3.get(i) + " ");
        }

        System.out.println();


        //radix sort
        //...........
        long start3 = System.nanoTime();
        data4 = RadixSort(data4);
        long end3 = System.nanoTime();
        //end time
        System.out.println();
        System.out.println("4. Radix Sort");
        System.out.printf("Seconds to sort = %fs%n", ( (double) (end3-start3)/1000000000));
        System.out.println("Number of iterations = " + RadixIterations);
        System.out.println("First 10:");
        for(int r =0 ; r<=9; r++)
        {
            System.out.print(data4.get(r) + " ");
        }

        System.out.println();

        System.out.println("Last 10: ");

        for(int i = N-10; i<=N-1; i++)
        {
            System.out.print(data4.get(i) + " ");
        }

    }


    static ArrayList<Integer> MergeSort(ArrayList<Integer> dataset) {
        MergeIterations++;
        if (dataset.size() == 1)
            return dataset;
        else {
            // split data into 2 parts
            ArrayList<Integer> LeftData = new ArrayList<Integer>(dataset.subList(0, dataset.size() / 2));
            ArrayList<Integer> RightData = new ArrayList<Integer>(dataset.subList(dataset.size() / 2, dataset.size()));
            dataset = Merge(MergeSort(LeftData), MergeSort(RightData));
        }
        return dataset;
    }

    // merge the left and right lists together
    static ArrayList<Integer> Merge(ArrayList<Integer> LeftData, ArrayList<Integer> RightData) {
        ArrayList<Integer> MergedData = new ArrayList<Integer>();
        while (LeftData.size() > 0 || RightData.size() > 0)
        {
            MergeIterations++;
            if (RightData.size() == 0) {
                MergedData.add(LeftData.get(0));
                LeftData.remove(0);
            } else if (LeftData.size() == 0) {
                MergedData.add(RightData.get(0));
                RightData.remove(0);
            } else if (LeftData.get(0) < RightData.get(0)) {
                MergedData.add(LeftData.get(0));
                LeftData.remove(0);
            } else {
                MergedData.add(RightData.get(0));
                RightData.remove(0);
            }
        }
        return MergedData;
    }

    static ArrayList<Integer> RadixSort(ArrayList<Integer> dataset)
    {
        ArrayList<Integer> dataset2 = new ArrayList<Integer>();
        for (int k = 1; k <= 100000; k *= 10) {
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j < dataset.size(); j++) {
                    RadixIterations++;
                    if (dataset.get(j) / k % 10 == i)
                        dataset2.add(dataset.get(j));
                }
            }
            dataset.clear();
            for (int m = 0; m < dataset2.size(); m++) {
                RadixIterations++;
                dataset.add(dataset2.get(m));
            }
            dataset2.clear();
        }
        return dataset;
    }

}