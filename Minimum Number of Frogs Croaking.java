class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int c=0,r=0,o=0,a=0,k=0;
        int frogs=0,maxfrogs=0;
        for(char C:croakOfFrogs.toCharArray()){
            switch(C){
                case 'c':
                    c++;
                    frogs++;
                    break;
                case 'r':
                   r++;
                   break;
                case 'a':
                   a++;
                   break;
                case 'o':
                   o++;
                   break;
                case 'k':
                   k++;
                   frogs--;
                   break;
            }
            maxfrogs=Math.max(frogs,maxfrogs);
            if(c<r || r<o || o<a || a<k) return -1;
        }
        if(frogs==0 && c==r && r==o && o==a && a==k) return maxfrogs;
        return -1;
    }
}
