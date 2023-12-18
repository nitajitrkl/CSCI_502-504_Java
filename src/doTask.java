public class doTask {
    public int doTask1 (int [] a){
        int index = 0;
        int soFar = 1;
        int count = 1;
        for (int k=1; k<a.length; k++){
            if (a[k]==a[k-1]){
                count++;
                if (count>soFar){
                    soFar=count;
                    index = k;
                }
            }
            else{
                count = 1;
            }
        }
        return a[index];
    }
}
