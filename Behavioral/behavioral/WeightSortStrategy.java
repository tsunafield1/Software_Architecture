package com.behavioral;

import java.util.Comparator;
import java.util.List;

public class WeightSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        // YOU ARE NOT ALLOWED TO MODIFY THE CODE ABOVE THIS COMMENT !!
        // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
        Comparator cmp = Comparator.comparing(Person::getWeight);
        people.sort(cmp);
    }

}
