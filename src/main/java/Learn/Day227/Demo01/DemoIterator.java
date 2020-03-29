package Learn.Day227.Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 迭代器的学习
 * 先判断hasNext();是否为true
 * 然后在用next();取值。
 *
 */

public class DemoIterator {

    public static void main(String[] args) {
        Collection<String> coll=new ArrayList();
        coll.add("1");
        System.out.println(coll);
        Iterator<String> iterator=coll.iterator();
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());

    }
}
