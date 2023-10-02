package com.systechafrica.collections.maps.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class workingWithMaps {
  public static void main(String[] args) {
    // Map<KT, VT> map = new HashMap<>();
    List<String> maliseNicknames = new ArrayList<>();
    maliseNicknames.add("Kudez");
    maliseNicknames.add("mandazi");

    List<String> johNicknames = new ArrayList<>();
    johNicknames.add("jonte");
    johNicknames.add("jontezz");

    // map through
    Map<String, List<String>> studentMap = new HashMap<>();

    studentMap.put("john: ", johNicknames);
    studentMap.put("malise: ", maliseNicknames);

    System.out.println(studentMap);

    Set<Entry<String, List<String>>> entrySet = studentMap.entrySet();
    Set<String> keySet = studentMap.keySet();
    Collection<List<String>> values = studentMap.values();

    // getting both key and value
    System.out.println();
    System.out.println("Mapping throug keys and values: ");
    for (Entry<String, List<String>> record : entrySet) {
      System.out.println(record.getKey() + "=>" + record.getValue());
    }

    System.out.println("Nicknames ");
    for (List<String> nickName : values) {
      System.out.println(nickName);
    }

    System.out.println("keys: ");
    for (String keyss : keySet) {
      System.out.println(keyss);
    }

  }
}
