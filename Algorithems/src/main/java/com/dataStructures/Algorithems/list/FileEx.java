package com.dataStructures.Algorithems.list;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileEx {
    public static  void main(String[] args) throws IOException {
        var integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        var list = Files.readAllLines(Path.of("/Users/krishnakanthgona/work/DataStructures-Algorithems/Algo" +
                "rithems/src/main/java/com/dataStructures/Algorithems/list/fele.txt"), StandardCharsets.UTF_8);
        System.out.println(list);
        var pattern = "yyyyddMM";
        var formatter = DateTimeFormatter.ofPattern(pattern);
        var currentDate = LocalDate.now().format(formatter);
        var hashMap=new HashMap<String, Integer>();
        for (var st:list){
           var strings = st.split("-");
            if(ArrayUtils.isNotEmpty(strings) && !st.isEmpty()) {
                var employee = new EmployeeEx(strings[0], strings[1], LocalDate.parse(strings[2], formatter));
                int months = Period.between(LocalDate.parse(currentDate, formatter), employee.getDate()).getMonths();
                if (months <= 6) {
                    hashMap.put(employee.name, hashMap.getOrDefault(employee.name, 0) + 1);
                }
            }
        }
    integers.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);

        System.out.println(hashMap.entrySet().stream().max(Map.Entry.comparingByValue()).get());
    }


    @NoArgsConstructor
    @Data
    @AllArgsConstructor
    private static class EmployeeEx {
        private  String id;
        private String name;
        private LocalDate date;

    }
}
