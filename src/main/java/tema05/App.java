package tema05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(300);
        List<String> linkedList= new LinkedList<>();
        System.out.println(list.toString());
        System.out.println(linkedList.toString());
    }
}
