int reverse(int x) {
    bool isPositive = true;
    int temp = 0;
    int ans = 0;
    if(x < 0){
        isPositive = false;
        x = 0 - x;
    }
    while(x/10 != 0){
        ans = temp*10 + (x%10);
        x = x/10;
        if(ans < 0){
            return 0;
        }
        if(ans/10 != temp){
            return 0;
        }
        temp = ans;
    }
    ans = temp*10 + x ;
    if(ans/10 != temp){
        return 0;
    }
    if(isPositive){
        if(ans < 0)
            return 0;
        else 
            return ans;
    }else {
        if(ans < 0)
            return 0;
        else
            return 0 - ans;
    }
}
