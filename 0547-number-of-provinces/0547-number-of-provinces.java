class Solution {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected.length == 0){
            return 0;
        }
        int count=0;
        boolean []visited=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                count++;
                dfs(isConnected,visited,i);
            }
        }
        return count;
        
    }
    public void dfs(int [][]graph,boolean []visited,int city){
        visited[city]=true;
        for(int i=0;i<graph[city].length;i++){
            int next=graph[city][i];
            if(next == 1 && !visited[i]){
                dfs(graph,visited,i);
            }
        }
    }
}