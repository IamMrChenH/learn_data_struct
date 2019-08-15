package 深度搜索和广度搜索;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author chenh
 * @date 2019-08-15
 */
public class 克隆图133 {

    public Node cloneGraph(Node node) {
        HashMap<Node, Node> nodeNodeHashMap = new HashMap<>();
        return dfs(node, nodeNodeHashMap);
    }

    private Node dfs(Node node, HashMap<Node, Node> nodeNodeHashMap) {
        if (node == null) {
            return null;
        }
        if (nodeNodeHashMap.containsKey(node)) {
            return nodeNodeHashMap.get(node);
        }

        Node dfsNode = new Node(node.val, new ArrayList<>());
        nodeNodeHashMap.put(node,dfsNode);
        for (Node neighbor : node.neighbors) {
            Node tempNode = dfs(neighbor, nodeNodeHashMap);
            dfsNode.neighbors.add(tempNode);
        }
        return dfsNode;
    }
}
