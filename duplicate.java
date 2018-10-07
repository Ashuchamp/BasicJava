// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String duplicate(int[] numbers){
    
    if (numbers == null){
        return null;
    }
    if (numbers.length == 0 || numbers.length == 1){
        return "";
    }
    
    
    Arrays.sort(numbers);
    int x = numbers.length -1; 
    int i = 1;
    boolean duplicate = false;
    ArrayList dup = new ArrayList();
    
    
    int index = 0;
    for (int j = 0; i !=  x; j++){
        if (numbers[i] == numbers[j] && duplicate != true){
            duplicate = true;
            dup.add(numbers[i]);
            i++;
        }
        else {
            i++;
            duplicate = false;
        }
    } 
    return dup.toString();
}