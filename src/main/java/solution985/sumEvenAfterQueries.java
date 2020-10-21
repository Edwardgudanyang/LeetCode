package main.java.solution985;

public class sumEvenAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int n=A.length;
        int[] res=new int[n];
        int a=0;
        for(int j=0;j<n;j++){
            if(A[j]%2==0){
                a+=A[j];
            }
        }
        for(int i=0;i<n;i++){
            if(A[queries[i][1]]%2==0){
                if(queries[i][0]%2==0){
                    a+=queries[i][0];
                }
                if(queries[i][0]%2!=0){
                    a-=A[queries[i][1]];
                }
            }
            if(A[queries[i][1]]%2!=0){
                if(queries[i][0]%2!=0){
                    a+=queries[i][0]+A[queries[i][1]];
                }
            }
            A[queries[i][1]]+=queries[i][0];
            res[i]=a;
        }
        return res;
    }
//    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
//        int n=A.length;
//        int[] res=new int[n];
//        int s=0;
//        for(int j=0;j<n;j++){
//            if(A[j]%2==0){
//                s+=A[j];
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(A[queries[i][1]]%2==0){
//                s-=A[queries[i][1]];
//            }
//            A[queries[i][1]]+=queries[i][0];
//            if(A[queries[i][1]]%2==0){
//                s+=A[queries[i][1]];
//            }
//            res[i]=s;
//        }
//        return res;
//    }
}
