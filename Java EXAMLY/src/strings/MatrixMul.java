package strings;

import java.util.*;

class MatrixMul extends Thread{
    public static void main(String[] args){
        int m,n,p,q,sum = 0,c,d,k;
        
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        
        int first[][] = new int[m][m];
        
        p = s.nextInt();
        q = s.nextInt();
        
        if(n!=p)
            System.out.println("");
        else{
            int second[][] = new int[p][q];
            int mul[][] = new int[m][q];
            
            for(c=0;c<m;c++)
                for(d=0;d<n;d++)
                    first[c][d] = s.nextInt();
                    
            for(c=0;c<p;c++)
                for(d=0;d<q;d++)
                    second[c][d] = s.nextInt();
                    
            for(c=0;c<m;c++){
                for(d=0;d<q;d++){
                    for(k=0;k<p;k++){
                        sum = sum+first[c][k]*second[k][d];
                    }
                    mul[c][d] = sum;
                    sum = 0;
                }
            }
        
        
            for(c=0;c<m;c++){
                for(d=0;d<q;d++){
                    System.out.print(mul[c][d]+"\t");
                    
                }
                System.out.println("\n");
            }
        }
    }
}