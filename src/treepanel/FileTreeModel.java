package treepanel;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import java.io.File;
import java.util.*;

/**
 * Created by alex on 25/04/17.
 */
public class FileTreeModel implements TreeModel {

    private Node root;

    FileTreeModel(Node root) {
        this.root = root;
    }

    @Override
    public boolean isLeaf(Object node) {
        return ((Node)node).getFile().isFile();
    }

    @Override
    public int getChildCount(Object parent) {
        return getChildList(((Node)parent).getFile()).size();
    }

    @Override
    public Object getRoot() {
        return root;
    }

    @Override
    public Object getChild(Object parent, int index) {
        File fileParent=((Node)parent).getFile();
        return new Node(new File(fileParent,getChildList(fileParent).get(index)),getChildList(fileParent).get(index));

    }

    private List<String> getChildList(File parent) {
        List<String> children = new ArrayList<>();
        for (String child : parent.list()){
            if (new File(parent,child).isDirectory()&&child.charAt(0)!='.'){
                children.add(child);
            }

        }
        return children;
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        String[] children = ((Node)parent).getFile().list();
        if (children == null) return -1;
        if (new File(((Node)parent).getFile(),((Node)child).getName()).isFile())
            return -1;
        String childname = ((Node)child).getName();
        for(int index = 0; index < children.length; index++) {
            if (childname.equals(children[index])) return index;
        }
        return -1;
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newvalue) {}

    @Override
    public void addTreeModelListener(TreeModelListener l) {}

    @Override
    public void removeTreeModelListener(TreeModelListener l) {}

}

