

public class Test {
    public static void main(String[] args) {
        CD cd1 =new CD(1,"cd1","nolan",12121);
        Livre livre1 = new Livre(12,"livre1","hugo","12121");
       Produit pdr1= new CD(21,"memento","david finsher",1212);
        System.out.println(pdr1.imprimer());
        System.out.println(livre1.imprimer());
        // La remarque à retirer de cet exercice est que le polymorphisme est une caractéristique très importante de la programmation orientée objet qui permet de traiter des objets de classes différentes de la même façon. Grâce à cela, il est possible de modifier ou d'utiliser des méthodes spécifiques sur des objets de classes différentes sans avoir à modifier les classes déjà écrites.
    }
}
