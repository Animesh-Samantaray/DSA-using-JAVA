class check{
    int a;
    check(int a){
        this.a=a;
        System.out.println("one parametre consructor");
        String[] arr = {"a","b","c"};
        main(arr);
    }
    check(check obj){
        this.a=obj.a;
    }
}

public class copy {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(100);
        int v = obj.intValue();
        System.out.println(obj);
        System.out.println(v);

    }
}
