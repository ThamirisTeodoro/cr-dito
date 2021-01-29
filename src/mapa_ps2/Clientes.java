/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa_ps2;

/**
 *
 * @author thami
 */
public class Clientes {
    
int score, idade;
double salario;
String retorno1, retorno2;

        void tratamento(){
            
        if (score < 0 || score > 1000){
        
        retorno1 = "Valor de incorreto";
        retorno2 = "Digite um valor de score valido";
        }
        
      
        
        else if (idade >= 18 && idade <= 25){
                if (score <= 300){
                    
               retorno1 = "Score Insuficiente";
               retorno2 = "Credito não aprovado";
                    
                   
            }
                if (score > 300 && score <= 500){
                    
                  retorno1 = "Crédito Aprovado";
                    this.salario = salario * 6;
                    Decimal p = new Decimal ();
                    p.formatado = this.salario;
                    p.numeral();
                    retorno2 = "Limite de R$: " +p.valor;
   
                }
                
                if (score > 500 && score <= 1000){
                
                 retorno1 = "Crédito Aprovado";
                 this.salario = salario * 12;
                    Decimal p = new Decimal ();
                    p.formatado = this.salario;
                    p.numeral();
                    retorno2 = "Limite de R$: " +p.valor;
                

                }
        }
                else if (idade > 25){
                if (score < 100){
                    
                retorno1 = "Score Insuficiente";
                retorno2 = "Credito não aprovado";
                    
                   
            }
                if (score >= 100 && score <= 500){
                    
                  retorno1 = "Crédito Aprovado";
                    this.salario = salario * 6;
                    Decimal p = new Decimal ();
                    p.formatado = this.salario;
                    p.numeral();
                    retorno2 = "Limite de R$: " +p.valor;
   
                }
                
                if (score > 500 && score <= 1000){
                
                 retorno1 = "Crédito Aprovado";
                 this.salario = salario * 12;
                    Decimal p = new Decimal ();
                    p.formatado = this.salario;
                    p.numeral();
                    retorno2 = "Limite de R$: " +p.valor;

                }
            
       
 
        }
                else {
                
                retorno1 = "Crédito não Aprovado";
                retorno2 = "Idade Insuficiente";
                
                }
        
             
        
    }
       
}
