class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map <Character,Integer> orderMap=new HashMap<>();
        for(int i=0;i<order.length();i++){
            orderMap.put(order.charAt(i),i);
            // order.charAt(0)=h;
            // OrderMap.put('h',0);
        }

            for(int i=0;i<words.length-1;i++){ //i=to compare words
                for(int j=0;j<words[i].length();j++){ //j=to compare the letters of each words i
                if(j>=words[i+1].length()){
                    return false;
                    //["apple","app"]
                }
                if(words[i].charAt(j)!=words[i+1].charAt(j)){
                    int currLetter=orderMap.get(words[i].charAt(j)); //h
                    int nextLetter=orderMap.get(words[i+1].charAt(j)); //l

                    if(nextLetter<currLetter){
                        return false;
                    }
                    else{
                        break; //stop the inner loop, the pairs are sorted, 
                    }
                }
            }
        }
        return true;
    }
}