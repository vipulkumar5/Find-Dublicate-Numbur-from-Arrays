public class DublicateArrays{
    public static void main(String[]args){
        int []arr=new int[]{2,4,5,3,6,4,6,8};
        System.out.println("Find Dublicate Array:"+"\n ");
        for(int i=0;i <arr.length; i++){
            for(int j=i+1;j<arr.length; j++ ){
                if(arr[i]==arr[j])
                System.out.println(arr[j]+" ");
                
            }
        }    
    }
}