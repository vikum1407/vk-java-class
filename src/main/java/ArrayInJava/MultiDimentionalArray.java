package ArrayInJava;

public class MultiDimentionalArray {

    public static void main(String[] args) {

        int[][] mulArray = {{100,200},{300,400},{500,600}};

        System.out.println("Using For Loop:");
        for (int i=0; i<mulArray.length; i++){
            for (int j=0; j<mulArray[i].length; j++){
                System.out.print(" "+mulArray[i][j]);
            }
        }

        System.out.println(" ");

        System.out.println("Using Enhance For Loop:");
        for (int r[]:mulArray){ // through this get the row and go inside
            for (int i:r){
                System.out.print(" "+i);
            }
        }
    }
}
