
package concessionari_v_v_j;

/**
 *
 * @author Joan Gilabert (joangilabert94)
 * @version 1.0
 * 
 */
public abstract class Coxe {
    
    public int n_bastidor;
    public String matricula;
    public String marca;
    public String model;
    public int preu;
    private String nom_Propietari;

    /**
     * 
     * @param n_bastidor    Numero de Bastidor en forma de enter
     * @param matricula     Matricula en forma de String
     * @param marca         Marca en forma de String
     * @param model         Model en forma de String
     * @param preu          Preu en forma de enter
     */
    public Coxe(int n_bastidor, String matricula, String marca, String model, int preu) {
        this.n_bastidor = n_bastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preu = preu;
    }
    
    /**
     * 
     * @param preu Enter que definix el nou preu
     */
    public void cambiaPreu(int preu){
    
        this.preu = preu;
    
    }
    
    /**
     * 
     * @param nom_Propietari Li pasarem el nom del futur propietari o el de la 
     *                       Empresa si és nostre(concessionari_v_v_j)
     */
    public abstract void setPropietari(String nom_Propietari);
    
}
