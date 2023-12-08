/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao_procedimento;

/**
 *
 * @author Samuel Melo
 */
public class Funcao_Procedimento {

    /**
     * @param args the command line arguments
     */
      //funções retorna algo;
  public int  nome(int x,int y){
            int valor;
            
            valor = x+y;
            return valor;
        }
  //procedimentos nçao retorna nada, tudo é executado dentro do mesmo
  
  public  void proce(int x, int y){
      int soma;
      soma=x+y;
      System.out.println("A soma de dois valores é :"+ soma);
  }

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //chama função 
        
        Funcao_Procedimento  r = new  Funcao_Procedimento ();
        
       int t=  r.nome(10,10);
        System.out.println("Retorno da função:"+t);
        //obj chama o procedimento!!
        r.proce(50, 50);
        
        
      
        
    }
    
  

}