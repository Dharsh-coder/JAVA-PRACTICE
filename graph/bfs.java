package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
    static void Bfs(int start, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while(!queue.isEmpty()){
            int n = queue.poll();
            System.out.print(n+" ");

            for(int nei : adj.get(n)){
                if(!visited[nei]){
                    visited[nei] = true;
                    queue.offer(nei);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=1;i<=V;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=1;i<=E;i++){
            int u=sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        System.out.println("Starting vertex: ");
        int S = sc.nextInt();
        Bfs(S,adj);
        System.out.println();
        sc.close();
    }
}
