//This is a merge sort algorithm

import java.io.*;
import java.util.*;

public class sorting {

    static int MergeIterations = 0;

    public static void main(String args[]) throws IOException {

        File file = new File("primes1.txt");
        Scanner infile = new Scanner(file);

        int N = 78498, A;

        int[] data1 = new int[N];  //bubble sort

        int[] data2 = new int[N];   //selection sort

        ArrayList<Integer> data3 = new ArrayList<Integer>();
        ArrayList<Integer> data4 = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            A = infile.nextInt();
            data1[i] = A;
            data2[i] = A;
            data3.add(A);
            data4.add(A);
        }

        //begin time
        data3 = MergeSort(data3);
        //end time


    }


    static ArrayList<Integer> MergeSort(ArrayList<Integer> dataset) {
        if (dataset.size() == 1) return dataset;
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
        while (LeftData.size() > 0 || RightData.size() > 0) {
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

}