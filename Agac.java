package agac;


public class Agac {

  
    public static void main(String[] args) {
        
        Node tree=new Node(56);//Köke eleman atama
        tree=tree.Ekle(tree, 16);
        tree=tree.Ekle(tree, 26);
        tree=tree.Ekle(tree, 200);
        tree=tree.Ekle(tree, 190);
        tree=tree.Ekle(tree, 213);
        tree=tree.Ekle(tree, 100);
        tree.yazdir(tree);
        System.out.println(" ");
        System.out.println("İnorder Yazdırma");
        tree.inorder(tree);//inorder sıralama 
        System.out.println(" ");
        System.out.println("PreOrder Yazdırma");
        tree.preorder(tree);
        System.out.println(" ");
        System.out.println("PostOrder Yazdırma");
        tree.postorder(tree);
        System.out.println(" ");
        System.out.println("En buyuk Sayı="+tree.max(tree));
        System.out.println("En Kucuk Sayı="+tree.min(tree));
        
        
        
        tree=tree.sil(tree, 56);//sayı silme
        System.out.println(" ");
        
        
        if(tree.bul(tree, 16)==1){
            System.out.println("Aranan sayı agacta bulundu.");
        }
        else{
            System.out.println("Aranan sayı agacta bulunmadı");
        }
        
        tree.yazdir(tree);
        System.out.println(" ");
        System.out.println("En buyuk Sayı="+tree.max(tree));
        System.out.println("En Kucuk Sayı="+tree.min(tree));
    }

    
    
}
