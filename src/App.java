public class App {
    public static void main(String[] args) throws Exception {
        
        //good job, this is the correct way to make the array
        int[] arrayLength = {1,2,3,4,5};

        //right now, arrayLength looks like this: [1,2,3,4,5]

        //this is also correct, but not necessary, since you already made the array
       

        //right now arrayLength still looks like this: [1,2,3,4,5]

        //this is the correct way to loop something 5 times.  But there is one problem.
        for (int arr_1 = 1; arr_1 <= 5; arr_1 ++ ) {
            System.out.println(arr_1);//here, you are printing the value of i, which is 1, then 2, then 3, then 4, then 5
                                  //however, you are not using the array you made
                                  //for example, even if the array was [null, null, null, null, null], this would still print 1, 2, 3, 4, 5
        }
     int[] arr_2 = {1,2,3,4,5};//good job, this is the correct way to make the array

        //right now, arr_i looks like this: [1,2,3,4,5]
        //however, remember that arrayLength also looks like this: [1,2,3,4,5]
        //so, you can just use arrayLength instead of arr_i, since they are identical.

        //this is also correct, but not necessary, since you already made the array


        //this is the correct way to loop something 5 times.  But there is the same problem.
        for (int arr_3 = 5; arr_3 > 0; arr_3-- ) {
            System.out.println(arr_3);//here, you are printing the value of y, which is 5, then 4, then 3, then 2, then 1
                                  //however, you are not using the array you made
        } 
       
    }
}
