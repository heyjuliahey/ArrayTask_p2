package parser;
import java.util.ArrayList;
import java.util.List;
import by.validator.*;

public class Parser {
        private static final String ARRAY_REGEX = "\s";

        @Override
        public int[] parseToInt(List<String> stringNumbers) {
            List<Integer> customList = new ArrayList<>();
            validator.StringValidator stringValidator = new validator.StringValidator();

            for (int i = 0; i < stringNumbers.size(); i++) {
                if (stringValidator.isCorrectRow(stringNumbers.get(i))) {
                    String[] stringArray = stringNumbers.get(i).split(ARRAY_REGEX);
                    for (String number : stringArray) {
                        customList.add(Integer.parseInt(number));
                    }
                }
            }
            int[] arr = new int[customList.size()];

            for (int i = 0; i < intNumbers.length; i++) {
                arr[i] = customList.get(i);
            }
            return arr;
        }
    }
