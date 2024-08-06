public class Demo {
    public static void main(String[] args) {
        int arr[]=new int[4];
        arr[3]=6;
try {
    System.out.println(arr[4]);
}catch (Exception s){
    s.printStackTrace();
}
        System.out.println("1000 of line");


    }
}