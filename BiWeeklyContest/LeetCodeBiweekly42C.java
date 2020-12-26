public class LeetCodeBiweekly42C {
    public String maximumBinaryString(String binary) {
        int firstZero = -1;
        int countZero = 0;

        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '0'){
                countZero++;
                if(firstZero == -1){
                    firstZero = i;
                }
            }
        }

        if(firstZero == -1){
            return binary;
        }

        StringBuffer br = new StringBuffer();

        for(int i = 0; i < binary.length(); i++){
            if(i == (firstZero + countZero) -1){
                br.append('0');
            }else{
                br.append('1');
            }
        }

        return br.toString();

    }
}
