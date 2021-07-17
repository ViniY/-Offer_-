import java.util.ArrayList;

public class Q4FindTheNumberIn2dArray {
    int[][] map;
    int target;
    int barometer = 0;
    private Q4FindTheNumberIn2dArray(int[][] map, int target) {
        this.map = map;
        this.target = target;
    }

    private int[] solve() {
        int[][] map = this.map.clone();
        int[] ans = {-1, -1};
        int row,col;
        row = 0;
        col = map.length-1;

        while(row<=map.length-1 && col >=0){
            barometer++;
            if(map[row][col] == target){
                ans = new int[]{row, col};
                return ans;
            }
            else if(map[row][col] > target){// then the target cannot be in this column
                col-=1;
            }
            else{
                row+=1;
            }
        }
        System.out.println("Cannot find such target ");



        return ans;
    }


    public static void main(String[] args) {
//        ArrayList<Integer> input = new ArrayList<>();
//        for(String i : args){
//            int f = Integer.parseInt(i);
//            input.add(f);
//        }
        ArrayList<Integer> input = new ArrayList<>();
        // testing with the given case [0,2,3,1,0,2,5,3]
        int[][] map = {
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15},
        } ;
        Q4FindTheNumberIn2dArray q4 = new Q4FindTheNumberIn2dArray(map, 7);
//
        int[] ans = q4.solve();
        System.out.println("The result of the input list is : "+ ans[0] + " " + ans[1]);
        System.out.println("The time complexity of this program is : " + Integer.toString(q4.barometer));
    }
}

