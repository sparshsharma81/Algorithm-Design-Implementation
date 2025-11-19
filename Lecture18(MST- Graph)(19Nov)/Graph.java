// package Lecture18(GRAPH)(18NOV);
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
public static class Graph {
            HashMap<Integer, HashMap<Integer,Integer>>graph = new HashMap<>();
            public Graph(){
                graph = new HashMap<Integer,HashMap<Integer,Integer>>();
            }
            public void addEdge(int v1, int v2, int cost){
                if(!graph.containsKey(v1)){
                    graph.put(v1,new HashMap<Integer,Integer>());

                }
                if(!graph.containsKey(v2)){
                    graph.put(v2,new HashMap<Integer,Integer>());
                }
                graph.get(v1).put(v2,cost);
                graph.get(v2).put(v1,cost);
            }
            public void display(){
                for(int a : graph.keySet()){
                    for(int b : graph.get(a).keySet()){
                        System.out.println(a + " " + b + " " + graph.get(a).get(b));
                    }
                }
            }
            public void addvertex(int v){
                if(!graph.containsKey(v)){
                    graph.put(v,new HashMap<Integer,Integer>());

                }

            }
            public void removeedge(int v1, int v2){
                if(containsEdge(v1,v2)){
                    graph.get(v1).remove(v2);
                    graph.get(v2).remove(v2);
                }
                else {
                    System.out.println("No Edge found");
                }
            }

            public void removeVertex(int v){
                if(graph.containsKey(v)){
                    for(int a : graph.get(v).keySet()){
                        graph.get(a).remove(v);
                    }
                }
                graph.remove(v);

            }
            public boolean containsEdge(int v1 , int v2){
                if(containsvertex(v1) && containsvertex(v2))
                return graph.get(v1).containsKey(v2) && graph.get(v2).containsKey(v2);
                return false;
            }
            public boolean containsvertex(int v){
                return graph.containsKey(v);
            }
            public int noofedges(){
                int count =0;
                for(int a : graph.keySet()){
                    count+=graph.get(a).size();
                    
                }
            return count/2;
        }

        public void BFS(){
            BFS(1,new HashSet<Integer>());
        }
            private void BFS(int src, HashSet<Integer>hashSet){
                
                //queue
                //src add Queue
                //loop 

            
        }
        public boolean haspath(int src , int dst){
            if(src == dst)return true;
            
            return haspath(src,dst,new HashSet<Integer>());
        }
        private boolean haspath(int src, int dst, HashSet<Integer>visited){
            if(src == dst)return true;
            visited.add(src);

            for(int a: graph.keySet()){
                if(!visited.contains(a)){
                    boolean ans = haspath(a,dst,visited);
                    if(ans == true)return true;
                }
            }
            visited.remove(src);


            return false;
        }
        public void BFS(){
            BFS(1);
        }
        private void BFS(int src){
            HashSet<Integer>visited  = new HashSet<>();

            Queue<Integer>q = new LinkedList<Integer>();
            q.add(1);
            while(!q.isEmpty()){
                int rv = q.poll();
                if(visited.contains(rv)){
                    continue;


                }
                visited.add(rv);
                System.out.println(rv);

                //add nbrs
                for(int k : graph.get(rv).keySet()){
                    if(!visited.contains(k)){
                        q.add(k);

                    }
                }
            }
        }


    public static void main(String args[]){
        //HashMap k corresponding ek hashMap hi rakh lete hai 
        Graph g= new Graph();
        g.addEdge(1, 2, 5);
        g.addEdge(1, 3, 4);
        g.addEdge(4 ,2, 10);
        g.addEdge(4,3,20);

        g.display();
        

        

    }

}
