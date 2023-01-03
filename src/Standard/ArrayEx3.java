package Standard;

public class ArrayEx3 {
    public static void main(String[] args) {
        int [] arr = new int[5];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i + 1;
        }

        System.out.println(" [    변경전    ]");
        System.out.println("현재 배열 크기 " + arr.length);

        int [] tmp = new int [arr.length*2];

        for (int i = 0; i < args.length ; i++) {
            tmp[i] = arr[i];
        }

        }
}

