public class LinearSearch{

    // time complexity of this program will be O(n) as we check n number of operations until we find the key
    // TC is directly proportional to loop

    public static int linearSearch(int numbers[], int key){
        for(int i =0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index= linearSearch(numbers,key);
        if(index == -1){
            System.out.println("key not found");
        }else{
          System.out.println("Key is at index : " +index );  
        }
        
    }
}