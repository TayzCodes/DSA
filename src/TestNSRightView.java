import java.math.BigInteger;
import java.util.*;

public class TestNSRightView {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    public static SubtreeSum.Node getNode(int val){
        return new SubtreeSum.Node(val);
    }
    static Map<Integer, ArrayList<Node>> levelToNodes = new TreeMap<>();
    static Map<Node, Integer> nodeToHD = new HashMap<>();

    static void printRightView(Node node)
    {
        if(node == null){
            return;
        }

        levelToNodes.clear();
        nodeToHD.clear();

        populateMaps(node, 0, 0);


        //System.out.println(levelToNodes);
        //System.out.println(nodeToHD);

        for(Map.Entry<Integer, ArrayList<Node>> mapEntry : levelToNodes.entrySet()){
            int level = mapEntry.getKey();

            ArrayList<Node> nodes = new ArrayList<>();
            nodes = mapEntry.getValue();

            if(nodes.size() == 1){
                System.out.print(nodes.get(0).data + " ");
            }
            else{
                int maxHdNode = 0;
                int maxHDLevel = Integer.MIN_VALUE;

                for(Node temp : nodes){
                    if(maxHDLevel <= nodeToHD.get(temp)){
                        maxHDLevel = nodeToHD.get(temp);
                        maxHdNode = temp.data;
                    }
                }

                System.out.print(maxHdNode + " ");
            }
        }
    }

    static void populateMaps(Node node, int hd, int level){
        if(node == null){
            return;
        }

        nodeToHD.put(node, hd);

        ArrayList<Node> nodes = new ArrayList<>();

        if(levelToNodes.containsKey(level)){
            nodes = levelToNodes.get(level);
        }

        nodes.add(node);
        levelToNodes.put(level, nodes);

        populateMaps(node.left, hd - 1, level + 1);
        populateMaps(node.right, hd + 1, level + 1);
    }


    public static void main( String[] args){
        SubtreeSum.Node root = getNode(10);
        root.left = getNode(20);
        root.right = getNode(30);
        root.left.left = getNode(40);
        root.left.right = getNode(60);

    }
}
