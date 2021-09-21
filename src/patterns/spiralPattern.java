package patterns;

public class spiralPattern {
    public static void main(String[] args) {
        int arr[][]={{10, 20, 30}, {40, 50, 60},{70,80,90}};
        for(int i=0;i< arr.length;i++){
            for (int j=0;i<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
