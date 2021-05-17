import java.util.Arrays;

public  class task1 {


    public static void main(String[] args) {
        replacer replacer = new replacer();
        Integer[]arr=new Integer[]{1,2,3,4,5};
        String[]arr2=new String[]{"a","b","C","d","e"};
        replacer.replace(arr,1,2);
        replacer.replace(arr2,1,2);


    }
}

class replacer{
    public  <T> void replace(T arr[], int i, int j) {
        T a;
        a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
        for(int k=0; k< arr.length;k++){
            System.out.println(arr[k]);
        }

    }

}


