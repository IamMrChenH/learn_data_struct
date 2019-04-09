import 实体类.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 在每个树行中找最大值 {
    public List<Integer> largestValues(TreeNode roots) {
        List<Integer> mMaxList = new ArrayList<>();
        if (roots == null) return mMaxList;

        LinkedList<TreeNode> list = new LinkedList();
        list.add(roots);

        int max = -999999;
        while (!list.isEmpty()) {
            max = -Integer.MIN_VALUE;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TreeNode pop = list.pop();
                max = Math.max(max, pop.val);
                if (pop.left != null)
                    list.add(pop.left);
                if (pop.right != null)
                    list.add(pop.right);
            }
            mMaxList.add(max);

        }
        return mMaxList;
    }

}
