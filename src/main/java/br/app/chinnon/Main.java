package br.app.chinnon;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Main {

    public static final Integer UNSUCCESSFUL_SEARCH = -1;
    public static final Integer LIST_MAX_SIZE = 1_000_000;


    public static void main(String[] args) throws NoSuchAlgorithmException {

        Integer desiredNumber = (args.length > 0 && args[0] != null) ?
                Integer.parseInt(args[0]) : SecureRandom.getInstanceStrong().nextInt(LIST_MAX_SIZE);
        ArrayList<Integer> sortedIntList = new ArrayList<>();

        for (int i = 0; i < LIST_MAX_SIZE; i++) {
            sortedIntList.add(i);
        }

        long startTime = System.nanoTime();

        int interactions = 0;
        for (int index = 0; index < sortedIntList.size(); index++) {
            interactions++;

            if (sortedIntList.get(index).equals(desiredNumber)) {
                System.out.printf(
                        "%nSUCCESSFUL - value %,d found in index %,d with %,d interactions!%n",
                        desiredNumber, index, interactions
                );
                break;
            }

//            System.out.printf(
//                    "%nLOOPING - value %,d not found with %,d interactions (index %,d)!%n",
//                    desiredNumber, interactions, index
//            );
        }

//        BinarySearch binarySearch = new BinarySearch(sortedIntList, desiredNumber);
//        binarySearch.byDivideAndConquerUsingRecursiveLoop(1, 0, sortedIntList.size() - 1);

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

        System.out.printf(
                "%nLinear search of %,d from array size %,d took %,d nano%n",
                desiredNumber, sortedIntList.size(), duration
        );

//        System.out.printf(
//                "%nBinary search of %,d from array size %,d took %,d ms%n",
//                desiredNumber, sortedIntList.size(), duration
//        );
    }
}
