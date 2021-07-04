//package 反射;
//import java.lang.reflect.Field;
//
///**
// * @author fangjiulin
// * @date 2020/11/15 14:21
// */
//public class Test2 {
//    public static void main(String[] args) throws Exception {
//        Student st = new Student("fang",31);
//        Class stu = st.getClass();
////        System.out.println(stu.getField("number"));
////        System.out.println(stu.getDeclaredField("name"));
////        System.out.println(stu.getDeclaredField("age"));
//
//        Field f = stu.getDeclaredField("age");
//        System.out.println(f.getName());
//        System.out.println(f.getType());
////        int m = f.getModifiers();
////        System.out.println(f.getModifiers());
////        System.out.println(Modifier.isPrivate(m));
//        f.setAccessible(true);
//        Object value = f.get(st);
//        System.out.println(value);
//        f.set(st,30);
//        //f.set(st,40);
//        System.out.println(st.getAge());
//
//    }
//}
