package Graph;

public class StarGraph {
    public static int findCenter(int[][] edges) {
        for(int [] edge: edges){
            if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
                return edge[0];
            }else{
                return edge[1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] edges = {{1,8},{2,8},{4,8}};
        System.out.println(findCenter(edges));
    }
}

