package os3;
public class Matrix implements Runnable{
    private int[][] A,B,P;
    
    public Matrix(int[][] A, int[][] B){
        this.A = A;
        this.B = B;
        this.P = new int[A.length][B[0].length];
    }//end constructor
    
    public int[][] getP(){
        return P;
    }//end getP
    
    @Override
    public void run() {
        //making arrays length to hold #s for multiplying
        int[] temp1, temp2;
        temp1 = new int[A.length];
        temp2 = new int[B[0].length];
        
        System.out.println(" A length: "+A.length+" B lenth: "+B.length);
        for(int x = 0; x < A.length; x++){
            for(int y = 0; y < B.length; y++){
                temp1[x] = A[x][y];
                System.out.println("temp1 ok x: "+x+" y: "+y);
                temp2[x] = B[y][x];
                System.out.println("temp2 ok x: "+x+" y: "+y);
                RowMulter X = new RowMulter(temp1, temp2);
                try{
                    X.run();
                    P[x][y] = X.getOutput();
                    System.out.println("P ok x: "+x+" y: "+y);
                }catch(Exception e){
                    System.out.println("Some thing happened in matrix! ");
                }
            }//end inner for
        }//end outer for
        
    }//end run
}//end matrix