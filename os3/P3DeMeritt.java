package os3;
import java.io.File;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.Scanner;

public class P3DeMeritt {

    public static void main(String[] args) {
        String filePath;// = args[0];
        int m1,m2,n1,n2;
        int[][] A,B,P;
        Matrix M;
            try{
                filePath = "MatrixData.txt";
            try (Scanner S = new Scanner(new File(filePath))) {
                m1 = S.nextInt();
                n1 = S.nextInt();
                m2 = S.nextInt();
                n2 = S.nextInt();
                
                if(m1 != n2){
                    System.out.println("Matrix size mismatch! ");
                    System.exit(0);
                }//end if
                
                //creating arrays
                A = new int[m1][n1];
                B = new int[m2][n2];
                P = new int[n1][m2];
                System.out.println("m1: "+m1+" n1: "+n1+" m2: "+m2+" n2: "+n2);
                for(int x = 0; x < m1; x++){//A
                    //System.out.println(x);
                    for(int y = 0;y < n1; y++){
                        //System.out.println(y);
                        A[x][y] = S.nextInt();
                    }//inner for
                }//outer for
                System.out.println("A: ");
                for(int x = 0; x < m1; x++){//A
                    for(int y = 0;y < n1; y++){
                        System.out.print(A[x][y]+" ");
                    }//inner for
                System.out.println();
                }
                System.out.println("B: ");
                for(int x = 0; x < m2; x++)//B
                    for(int y = 0;y < n2; y++){
                        B[x][y] = S.nextInt();
                    }//inner for
                for(int x = 0; x < m2; x++){//A
                    for(int y = 0;y < n2; y++){
                        System.out.print(B[x][y]+" ");
                    }//inner for
                System.out.println();
                }
                
                M = new Matrix(A,B);
                try{
                    M.run();
                    P = M.getP();
                    System.out.println("P: ");
                    for(int x = 0; x < P.length; x++){//A
                        for(int y = 0;y < P[0].length; y++){
                            System.out.print(P[x][y]+" ");
                        }//inner for
                    System.out.println();
                }
                }catch(Exception e){
                    System.out.println("Something happened in main!  "+e.toString());
                }//end catch
            }//end try with resources
	
		}catch(IOException e){
			System.out.println("Error opening file.");
			System.exit(0);
		}//end catch
            
        }//end main
    }//end class