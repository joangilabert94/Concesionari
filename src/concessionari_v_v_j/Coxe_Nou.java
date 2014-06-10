
package concessionari_v_v_j;

/**
 * @author Vicente Biendicho Bernat (vicbibe)
 * @version 1.1
 */

public class Coxe_Nou extends Coxe{

    public Coxe_Nou(int n_bastidor, String matricula, String marca, String model, int preu) {
        super(n_bastidor, matricula, marca, model, preu);
    }

    /**
     * 
     * @param nom_Propietari String : es el nom del propietari que li posarem al cotxe
     */
    
    @Override
    public void setPropietari(String nom_Propietari) {
         System.out.println("Propietari " + nom_Propietari + "adjudicat");
    }
    
}
