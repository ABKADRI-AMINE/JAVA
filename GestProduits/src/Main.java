public class Main {
    public static void main(String[] args) {
       cd cd1 = new cd(12,"Rap","Elgrandetoto",1500);
       Livre livr1= new Livre(13,"NANTAS","Jean Aneuil","ISBNISSSSSS");
        System.out.println(cd1.imprimer());
        System.out.println(livr1.imprimer());
        Produit prd1 = cd1;
        System.out.println(prd1.imprimer());
        Produit prd2 = livr1;
        System.out.println(prd2.imprimer());

        //La remarque à retirer est que le polymorphisme est une fonctionnalité très puissante qui permet aux classes dérivées de modifier le comportement de leur classe mère dans certaines circonstances. Cette fonctionnalité peut être très utile pour écrire des programmes plus simples et plus faciles à maintenir.

    }
}