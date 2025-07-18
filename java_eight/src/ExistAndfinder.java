import java.util.*;
import java.util.stream.*;
public class ExistAndfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<Integer> numbers = Arrays.asList(1, 2, 56,3,26, 4, 5);
        Stream<Integer> numberStream = numbers.stream();
        Optional<Integer> first = numberStream.filter(n -> n > 2).findFirst();

        if (first.isPresent()) {
            System.out.println("First element greater than 2: " + first.get());
                  } else {
            System.out.println("No element found.");
        }

        
        
        List<Integer> marks = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> marksStream = marks.stream().parallel();
        Optional<Integer> any =marksStream.filter(n -> n > 2).findAny();

        if (any.isPresent()) {
            System.out.println("Any element greater than 2: " + any.get()); 
            // Output: Any element greater than 2: 3 (or another element > 2)
        } else {
            System.out.println("No element found.");
        }

	}

}
