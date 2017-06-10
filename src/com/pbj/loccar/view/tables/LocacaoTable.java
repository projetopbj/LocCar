/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.view.tables;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Akr-Taku
 */
public class LocacaoTable  extends AbstractTableModel {
    
    private final List<String[]> linhas;
    //Declara o nome das Colunas da Tabela
    private final String[] colunas = {" # ","Descrição","Cliente","Veiculo","Placa","Data Ida","Dias","Data Esperada",
        "Data Volta","Desconto","Valor do Desconto","SubTotal","Atraso","Dias de Atraso","Valor Final","Status"};
    
    //Contrutor vazio que Instancia a List
    public LocacaoTable(){   
        linhas = new ArrayList<>();
    }
   //Contrutor que já recebe a List Instanciada
    public LocacaoTable(List<String[]> lista){
        
        linhas = new ArrayList<>(lista);
    }

    @Override//Retorna o nome da Coluna
    public String getColumnName(int column) {
        return colunas[column]; 
    }
    
    @Override//Conta o número de linhas da Tabela
    public int getRowCount() {
       return linhas.size();
    }
    //Conta o número de colunas da Tabela
    public int getColumnCount() {
       return colunas.length;
    }

    @Override//Metodo Interno para atualizar a Table
    public Object getValueAt(int linha, int coluna) { 
        
        String temp[] = linhas.get(linha);
        
        switch (coluna){
            case 0:
                return temp[0];//Retorna o ID
            case 1:
                return temp[1];//"Descrição",
            case 2:
                return temp[2];//"Cliente",
            case 3:
                return temp[3];//"Veiculo",
            case 4:
                return temp[4];//"Placa",
            case 5:
                return temp[5];//Data Ida",
            case 6:
                return temp[6];//"Dias",  
            case 7:
                return temp[7];//"Data Esperada",  
            case 8:
                return temp[8];//"Data Volta", 
            case 9:
                return temp[9];//"Desconto",  
            case 10:
                return temp[10];//"Valor do Desconto",   
            case 11:
                return temp[11];//"SubTotal",
            case 12:
                return temp[12];//"Atraso",
            case 13:
                return temp[13];//"Dias de Atraso"
            case 14:
                return temp[14];//"Valor Final",  
            case 15:
                return temp[15];//"Status"   
        }
        return null;
    }
    
    //Metodo Interno que pega o valor de cada Celula
    public void setValueAt(Object aValue, int linha, int coluna ){
        
        String temp[] = linhas.get(linha);
        
        switch(coluna){
            
            case 0:
                temp[0] = aValue.toString();
                break;
            case 1:
                temp[1] = aValue.toString();
                break;
            case 2:
                temp[2] = aValue.toString();
                break;
            case 3:
                temp[3] = aValue.toString();
                break;
            case 4:
                temp[4] = aValue.toString();
                break;
            case 5:
                temp[5] = aValue.toString();
                break;
            case 6:
                temp[6] = aValue.toString();
                break;    
            case 7:
                temp[7] = aValue.toString();
                break;    
            case 8:
                temp[8] = aValue.toString();
                break;    
            case 9:
                temp[9] = aValue.toString();
                break;    
            case 10:
                temp[10] = aValue.toString();
                break;    
            case 11:
                temp[11] = aValue.toString();
                break;    
            case 12:
                temp[12] = aValue.toString();
                break;    
            case 13:
                temp[13] = aValue.toString();
                break;    
            case 14:
                temp[14] = aValue.toString();
                break;    
            case 15:
                temp[15] = aValue.toString();
                break;    
                
                
                
            default:
                //Nunca Acontecerá
                
                
        }
        fireTableCellUpdated(linha, coluna);  
    }
    //Metodo interno que seta os valores na Table
    public void setValueAt(String aValue[], int linha){
      String temp[] = linhas.get(linha);
      
      temp[0] = aValue[0];//ID
      temp[1] = aValue[1];
      temp[2] = aValue[2];
      temp[3] = aValue[3];
      temp[4] = aValue[4];
      temp[4] = aValue[4]; 
      temp[5] = aValue[5]; 
      temp[6] = aValue[6]; 
      temp[7] = aValue[7]; 
      temp[8] = aValue[8];
      temp[9] = aValue[9]; 
      temp[10] = aValue[10]; 
      temp[11] = aValue[11]; 
      temp[12] = aValue[12]; 
      temp[13] = aValue[13]; 
      temp[14] = aValue[14]; 
      temp[15] = aValue[15]; 
      
      
      
    fireTableCellUpdated(linha, 0);
    fireTableCellUpdated(linha, 1);
        
    }
    //Retorna um boolean caso true a linha é editavel
    public boolean isCellEditable(int linha, int coluna){    
        return false;//Sempre será falso pois não quero que a linha seja editavel
    }
    
    //Retornar um vetor de String recebendo sua linha como Parametro
    public String[] getLinha(int linha){
        
        return linhas.get(linha);
    }
    
    //Adicona uma nova Linha recebendo um vetor de String como Parâmetro
    public void addRow(String user[]){
        this.linhas.add(user);    
        int ultimaLinha = getRowCount() -1;
        this.fireTableRowsInserted(ultimaLinha,ultimaLinha);
    }
    
    //Remove a linha passada por Parâmetro           
    public void removeRow(int linha){
        this.linhas.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    //Popula a tabela a partir de uma lista
    public void addLista(List<String[]> list){
        
        int tamanhoAntigo = getRowCount();
        
        linhas.addAll(list);
        
        fireTableRowsInserted(tamanhoAntigo, getRowCount() -1);   
    }
    //Limpa toda a Tabela
    public void removeAll(){
        
       linhas.clear();
       fireTableDataChanged();
        
    }
    
    
}
