public class CompareArrays<T> {

    public  void Compare(T [] numbers1,T [] numbers2){
        boolean areEqual = true;
        if(numbers1.length != numbers2.length){
            areEqual = false;
        }
        int count =0;
        while(areEqual && count<numbers1.length){
            if(numbers1[count] != numbers2[count]){
                areEqual =false;
            }
            count++;
        }
        if(areEqual){
            System.out.println("They are Equal");
        }else {
            System.out.println("They are not Equal");
        }
    }
    public static void main(String[] args) {
        double [] numbers1 = {20.3,30.9,24.8,9.5};
        double [] numbers2 = {20.3,30.9,24.8,9.5};
        CompareArrays  compareArrays = new CompareArrays();
//        compareArrays.Compare(numbers1,numbers2);
    }
}
