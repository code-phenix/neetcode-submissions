class Solution {

    // strs = ["Hello","World"]
                 
    // res= 5#Hello5#World
    //      i
    //      j
    //        j    i=
    public String encode(List<String> strs) {
      StringBuilder sb=new StringBuilder();

      for(String iter:strs){
        sb=sb.append(iter.length()).append("#").append(iter);
      }
      return sb.toString();
    }

    public List<String> decode(String str) {

        ArrayList<String> res=new ArrayList<>();

        int i=0, length, j;

        while(i<str.length()){
            j=i;
            while(str.charAt(j)!=('#')){
                j++;
            }
            length=Integer.parseInt(str.substring(i,j));
            res.add(str.substring(j+1,j+length+1));
            i=j+length + 1;
        }
       return res;
    }
}
