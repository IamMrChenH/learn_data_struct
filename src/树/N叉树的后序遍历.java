package 树;

import 实体类.Node;

import java.util.ArrayList;
import java.util.List;

public class N叉树的后序遍历 {

        public List<Integer> postorder(Node root) {
            List<Integer> mList = new ArrayList<>();
            data(mList, root);
            return mList;
        }

        private void data(List<Integer> mList, Node root) {
            if (root == null) {
                return;
            }

            for (Node child : root.children) {
                data(mList, child);
            }
            mList.add(root.val);
        }

}
