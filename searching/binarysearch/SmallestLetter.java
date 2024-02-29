package searching.binarysearch;


    public class SmallestLetter {
        public static void main(String[] args) {
            
            char[] letters = {'c','f','j'};
            char target = 'c';
            System.out.println(nextGreatestLetter(letters, target));
    
    
        }
    
        static char nextGreatestLetter(char[] letters, char target){
            int start = 0;
            int end = letters.length -1;
            while(start <= end){
                // find the middle element
                int mid = start + (end - start) / 2;
                // if middle element is the target
               
                // if target is greater than the middle element
                 if(letters[mid] < target){
                    start = mid + 1;
                }
                // if target is less than the middle element
                else{
                    end = mid - 1;
                }
            }
            return letters[start % letters.length];
            
        }
    }
    

