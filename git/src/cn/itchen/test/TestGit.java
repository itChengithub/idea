package cn.itchen.test;

public class TestGit {
    public static void main(String[] args) {
        System.out.println("hello git ");
        System.out.println("hello git ");
        System.out.println("hello git ");
        System.out.println("hello git ");
        System.out.println("hello git ");
        System.out.println("hello git ");
        System.out.println("hello git ");
        String name = new TestGit().test("陈超");
        System.out.println(name);
    }
    public String test(String name){
        return "我是:"+name;
    }
}
