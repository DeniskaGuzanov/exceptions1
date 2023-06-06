public class Ex2 {
    public static void main(String[] args){
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        if (arr == null) {
            System.out.println("Массив не инициализирован");
            arr = new String[0][];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = new String[0];
            }
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][i]);
                sum += val;
                if (arr[i].length < j + 1){
                    return sum;
                        }
                    }
                }
            return sum;
        }
    }