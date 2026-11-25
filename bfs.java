import java.util.*;
public class bfs{
    public static List<String> bfs(Map<String, List<String>> graph, String start){
        Set<String> visited = new HashSet<>();
        List<String> traversalOrder = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
      visited.add(start);
      queue.add(start);
        while(!queue.isEmpty()){
            String node = queue.poll();
            traversalOrder.add(node);
            for(String neighbor : graph.getOrDefault(node, new ArrayList<>())){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return traversalOrder;
    }
    public static void main(String[] args){
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("A", "F"));
        graph.put("D", Collections.singletonList("B"));
        graph.put("E", Collections.singletonList("B"));
        graph.put("F", Collections.singletonList("C"));

        List<String> result = bfs(graph, "A");
        System.out.println(result);
    } 
}