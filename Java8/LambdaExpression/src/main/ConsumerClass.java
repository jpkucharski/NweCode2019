package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerClass {
        public static void main (String[] args)
        {
            new ConsumerClass().run();
        }

        private void run() {

            List<String> list = Arrays.asList("aaa","bbb","ccc");
            List<String> reWrittenList = new ArrayList<>();
            list.stream()
                    .forEach(reWrittenList::add);

            System.out.println(reWrittenList.size());
        }
}