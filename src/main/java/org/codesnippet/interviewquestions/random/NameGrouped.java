package org.codesnippet.interviewquestions.random;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NameGrouped {

    public static void main(String[] args) {

        //S: {"Sunday"},
        //M:{"Monday"}
        //T:{"Tuesday", "Thursday"}

        //List<String> input = List.of("sunday", "monday","tuesday","thursday");

        List<String> input = List.of("Sunday", "Monday", "Tuesday", "Thursday");


//        Map<Character, List<String>> collect = input.stream()
//                .collect(Collectors.groupingBy(
//                        s -> Character.toUpperCase(s.charAt(0)),
//                        Collectors.mapping(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1),
//                                Collectors.toList())
//                ));

        Map<Character, List<String>> collect =
                input.stream()
                        .collect(Collectors.groupingBy(
                                s -> s.charAt(0)   // first character as key
                        ));

        System.out.println(collect);

    }
}

/* table - employee - id,name,salary,dept id
 table - department - id, name

ques - “2nd highest salary in each department with dept name and employee name”.

SELECT d.name AS dept_name,
       e.name AS employee_name,
       e.salary
FROM employee e
JOIN dept d ON e.dept_id = d.id
WHERE e.salary = (
    SELECT MAX(salary)
    FROM employee
    WHERE dept_id = e.dept_id
      AND salary < (
          SELECT MAX(salary)
          FROM employee
          WHERE dept_id = e.dept_id
      )
);


*/