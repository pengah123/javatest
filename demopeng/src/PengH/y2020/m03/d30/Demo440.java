package PengH.y2020.m03.d30;

import PengH.y2020.m03.d28.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Demo440 {
    public static void main(String[] args) {
        String[] team1={"洋洋","迪丽热巴","蔡徐坤","虞书欣","赵小棠","谢可寅"};
        String[] team2={"谢娜","张何炅","王一博","张小战","张娜娜"};
        List<String> s1=new ArrayList<>();
        Collections.addAll(s1,team1);
        List<String> s2=new ArrayList<>();
        Collections.addAll(s2,team2);

        Stream stream1=s1.stream().filter(name->name.length()==3).limit(3);
        Stream stream2=s2.stream().filter(name->name.startsWith("张")).skip(2);
        Stream.concat(stream1,stream2).map(name->new Person((String) name)).forEach(p-> System.out.println(p));
    }
}
