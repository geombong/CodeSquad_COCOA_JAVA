package testpreparation.step4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number {

    private static final List<Integer> numberList = new ArrayList<>();

    public Number(int startNum, int endNum) {
        for (int i = startNum; i < endNum + 1; i++) {
            numberList.add(i);
        }
    }

    public Set<Integer> getNumber(int numberCount) {
        Set<Integer> numbers = new HashSet<>();
        shuffleNumberList();
        for (int i = 0; i < numberCount; i++) {
            numbers.add(numberList.get(i));
        }
        return numbers;
    }

    private void shuffleNumberList() {
        for (int i = 0; i < numberList.size(); i++) {
            int randomIndex = (int) (Math.random() * numberList.size());
            int temp = numberList.get(randomIndex);
            numberList.set(randomIndex, numberList.get(i));
            numberList.set(i, temp);
        }
    }
}