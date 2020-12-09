public class DictionaryDriver {
    public static void main(String[] args) {
        Dictionary d = new Dictionary<String, String>();

        d.put("test", "returnTest");
        System.out.println(d.get("test")); //should be returnTest
        d.put("testRemove","returnTestRemove");
        System.out.println(d.remove("testRemove")); //should be returnTestRemove
        System.out.println(d.get("test")); //should be returnTest

        System.out.println(d.contains("test")); //true
        System.out.println(d.contains("testRemove")); //false

        System.out.println(d.size());

        System.out.println(d.keys()); //[test]
        System.out.println(d.values()); //[returnTest]

        //It did them all!!





    }
}
