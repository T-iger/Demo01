package Learn.Day304.Demo01;

import java.util.HashSet;

public class DemoTest {
    public static void main(String[] args) {
        DemoHashSet demoHashSet1=new DemoHashSet("小明",1);
        DemoHashSet demoHashSet2=new DemoHashSet("小明",1);
        DemoHashSet demoHashSet3=new DemoHashSet("小明",2);
        HashSet<DemoHashSet> hashSet=new HashSet<>();
        System.out.println(demoHashSet1.hashCode());
        System.out.println(demoHashSet3.hashCode());
        hashSet.add(demoHashSet1);
       hashSet.add(demoHashSet2);
        hashSet.add(demoHashSet3);
        System.out.println(hashSet);


    }
}
