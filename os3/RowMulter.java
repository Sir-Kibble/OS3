package os3;
public class RowMulter implements Runnable{
    private int[] M,N;
    private int output;
    public RowMulter(int[] M, int[] N){
        this.M = M;
        this.N = N;
    }
    
    public int getOutput(){
        return output;
    }
    
    @Override
    public void run() {
        for(int x = 0; x < M.length;x++)
            output = M[x] * N[x];
    }
}