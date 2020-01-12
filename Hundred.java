

/**
 * Write a description of class Hundred here.
 * 
 * @author (Kenta Lange) 
 * @version ()
 */
public class Hundred
{
    private int rows=10;
    private int cols=10;
    private int [][] list;
    private int number=1;
    private String [][]list2;
    public Hundred(){
       
      list=new int [rows][cols]; 
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            list[i][j]=number;
            number++;
        }
      }
    }
    public String toString(){
      //  list=new String[10][10];
      String x="";
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            x+=list[i][j]+"\t ";
        }
        x+="\n";
      }
      System.out.println(x);
      return x;
    }
    public void shuffle(){
        //list=new int[rows][cols];
        //int mix=0;
       // mix=(int)Math.random()*cols;
        for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            int y=(int)(Math.random()*cols);
            int x=(int)(Math.random()*rows);
            int z=list[i][j];
            list[i][j]=list[x][y];
            list[x][y]=z;
        }
        
      }
      System.out.println(this.toString());
    }
    
}
 