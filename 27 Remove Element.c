int removeElement(int* nums, int numsSize, int val) {
    int i =0;
    int j =0;
    int k;
    for(i = 0 ; i < numsSize ; i++){
        if(nums[i] != val){
            nums[j] = nums[i];
            j++;
        }
    }
    for(k = j ;k < numsSize ; k++){
        nums[k] = 0;
    }
    return j;
}
