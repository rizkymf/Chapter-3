package org.binaracademy.topic4;

import org.binaracademy.topic3.Robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public List<String> namaNilai(List<Integer> nilai, List<String> nama) {
        // nilai -> 100, 90, 85, 90, 95
        // nama -> Budy, Udin, Sabrina, Mas Gun, Ariel
        // Budy 100, Udin 90, Sabrina 85, Mas Gun 90, Ariel 95
        List<String> result = new ArrayList<>();
//        Map<String, Integer> hasil = new HashMap<>();
        int j = 0;
        for(int i = 0; i < nilai.size(); i++) {
            result.add(nama.get(i) + " " + nilai.get(i));
        }
        for(String name : nama) {

        }
        nama.forEach(val -> result.add(val + " " + nilai.get(nama.indexOf(val))));
        return result;
    }

    public void bikinStream() {
        List<String> name = Arrays.asList(null, "Sabrina", "", "Udin", "Budy", "       ", "Mas Gun");
        Stream<String> stringStream = Stream.of("Budy", "Mas Gun", "Sabrina");
        stringStream = Stream.empty();

        String judul = "           ";

        List<Robot> robotList = name.stream() // stream source
                .filter(nama -> nama != null && !nama.trim().equals(""))
                .map(val -> Robot.builder()
                        .nama(val)
                        .model("Demo Stream")
                        .build())
                .collect(Collectors.toList()); // terminal operation
        robotList.forEach(val -> System.out.println(val.getModel() + " " + val.getNama()));

        List<Robot> robotList2 = name.stream() // stream source
                .filter(nama -> nama != null && !nama.trim().equals(""))
                .flatMap(val -> Stream.of(val, val+1, val+2))
                .map(val -> Robot.builder()
                        .nama(val)
                        .model("Demo Stream")
                        .build())
                .collect(Collectors.toList()); // terminal operation
//        robotList2.forEach(robot2 -> System.out.println(robot2));

        Set<String> ids = new HashSet<>();
    }

    public List<String> ordering(List<String> unorderedList) {
        return unorderedList.stream()
                .filter(nama -> nama != null && !nama.trim().equals(""))
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> reverseOrdering(List<String> unorderedList) {
        return unorderedList.stream()
                .filter(nama -> nama != null && !nama.trim().equals(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public Integer hitungTotal(List<Orders> pesanan) {
        return pesanan.stream()
                .reduce(0, (result, order) -> result + (order.getHarga() * order.getQuantity()), Integer::sum);
    }

    public boolean demoAnyMatch(List<String> nama, String start) {
        return nama.stream()
                .filter(Objects::nonNull)
                .anyMatch(val -> val.startsWith(start));
    }

    public boolean demoAllMatch(List<String> nama, String start) {
        return nama.stream()
                .filter(Objects::nonNull)
                .allMatch(val -> val.startsWith(start));
    }

}
