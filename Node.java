package agac;

public class Node {

    int data;
    Node left;
    Node rigth;

    public Node(int data) {
        this.data = data;

    }

    public Node() {
    }

    public Node Ekle(Node agc, int veri) {

        if (agc == null) {
            Node root = new Node();
            root.left = null;
            root.rigth = null;
            root.data = veri;
            return root;
        }
        if (veri > agc.data) {

            agc.rigth = Ekle(agc.rigth, veri);
            return agc;
        }

        if (veri < agc.data) {

            agc.left = Ekle(agc.left, veri);

        }
        return agc;

    }

    public void yazdir(Node agac) {
        if (agac == null) {
            return;
        }
        yazdir(agac.left);
        System.out.print(agac.data + ",");
        yazdir(agac.rigth);

    }

    public int bul(Node agc, int aranan) {
        if (agc == null) {
            return -1;
        }
        if (agc.data == aranan) {
            return 1;
        }
        if ((bul(agc.rigth, aranan)) == 1) {
            return 1;
        }
        if ((bul(agc.left, aranan) == 1)) {
            return 1;
        }
        return -1;
    }

    public int max(Node agc) {
        while (agc.rigth != null) {
            agc = agc.rigth;
        }
        return agc.data;
    }

    public int min(Node agc) {
        while (agc.left != null) {
            agc = agc.left;
        }
        return agc.data;
    }

    public Node sil(Node agc, int silinecek) {
        if (agc == null) {
            return null;
        }
        if (agc.data == silinecek) {
            if (agc.left == null && agc.rigth == null) {//silinecek deger yaprak ise
                return null;
            }
            if (agc.rigth != null) {
                agc.data = min(agc.rigth);
                agc.rigth = sil(agc.rigth, min(agc.rigth));
                return agc;
            }
            agc.data = max(agc.left);
            agc.left = sil(agc.left, max(agc.left));
            return agc;
        }
        if (agc.data < silinecek) {
            agc.rigth = sil(agc.rigth, silinecek);
            return agc;
        }
        agc.left = sil(agc.left, silinecek);
        return agc;

    }

    public void inorder(Node agc) {
        if (agc == null) {
            return;
        }
        inorder(agc.left);
        System.out.print(" " + agc.data);
        inorder(agc.rigth);
    }

    public void preorder(Node agc) {
        if (agc == null) {
            return;
        }
        System.out.print(" " + agc.data);
        preorder(agc.left);
        preorder(agc.rigth);

    }

    public void postorder(Node agc) {
        if (agc == null) {
            return;
        }
        postorder(agc.left);
        postorder(agc.rigth);
        System.out.print(" " + agc.data);

    }
}
