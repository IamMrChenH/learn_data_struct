import 实体类.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class N叉树的层序遍历 {


    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) return lists;


        LinkedList<Node> nodes = new LinkedList<>();
        nodes.add(root);


        while (!nodes.isEmpty()) {
            ArrayList<Integer> integers = new ArrayList<>();

            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                Node pop = nodes.pop();
                integers.add(pop.val);

                for (Node n : pop.children) {
                    nodes.add(n);
                }

            }
            lists.add(integers);

        }

        return lists;
    }
}
