package br.app.chinnon;

import java.util.ArrayList;

import static br.app.chinnon.Main.UNSUCCESSFUL_SEARCH;

public class BinarySearch {

    ArrayList<Integer> sortedList;
    Integer search;

    public BinarySearch(ArrayList<Integer> sortedList, Integer search) {
        this.sortedList = sortedList;
        this.search = search;
    }

    Integer byDivideAndConquerUsingRecursiveLoop(
            Integer interactions,
            Integer indexLow,
            Integer indexHigh
    ) {
        int indexMid = (indexLow + indexHigh) / 2;

        if (sortedList.isEmpty()) {
            System.out.println("%nUNSUCCESSFUL - empty list to search!");
            return UNSUCCESSFUL_SEARCH;
        }

        if (indexLow > indexHigh) {
            System.out.printf(
                    "%nUNSUCCESSFUL - value %,d not found with %,d interactions (mid %,d)!%n",
                    search, interactions, indexMid
            );
            return UNSUCCESSFUL_SEARCH;
        }

        if (sortedList.get(indexMid).equals(search)) {
            System.out.printf(
                    "%nSUCCESSFUL - value %,d found in index %,d with %,d interactions (mid %,d)!%n",
                    indexMid, search, interactions, indexMid
            );
            return indexMid;
        }

        if (sortedList.get(indexMid) < search) {
            return byDivideAndConquerUsingRecursiveLoop(interactions + 1, indexMid + 1, indexHigh);
        }

        if (sortedList.get(indexMid) > search) {
            return byDivideAndConquerUsingRecursiveLoop(interactions + 1, indexLow, indexMid - 1);
        }

        System.out.printf(
                "%nUNSUCCESSFUL - value %,d not found with %,d interactions (mid %,d)!%n",
                search, interactions, indexMid
        );
        return UNSUCCESSFUL_SEARCH;
    }
}
