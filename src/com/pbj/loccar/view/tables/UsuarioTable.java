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
public class UsuarioTable  extends AbstractTableModel {
    
    private final List<String[]> linhas;
    private final String[] colunas = {" # ","Login","Nome","Acesso","Senha"};
    
    
    public UsuarioTable(){
        
        linhas = new ArrayList<>();
    }
    public UsuarioTable(List<String[]> lista){
        
        linhas = new ArrayList<>(lista);
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
       return linhas.size();
    }
    
    public int getColumnCount() {
       return colunas.length;
    }
    
    

    @Override
    public Object getValueAt(int linha, int coluna) { //Metodo Interno para atualizar a Table
        
        String temp[] = linhas.get(linha);
        
        switch (coluna){
            case 0:
                return temp[0]; //Retorna o ID
            case 1:
                return temp[1];//Retorna o Login
            case 2:
                return temp[2];//Retorna o Nome
            case 3:
                return temp[3]; //Retorna Acesso
            case 4:
                return temp[4]; // Retorna a Senha
        }
        return null;
    }
    public void setValueAt(Object aValue, int linha, int coluna ){
        
        String temp[] = linhas.get(linha); //Carrega O Item da Linha a ser Mexido
        
        
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
            default:
                //Nunca Acontecerá
                
                
        }
        fireTableCellUpdated(linha, coluna);
        
    }
    public void setValueAt(String aValue[], int linha){
      String temp[] = linhas.get(linha);
      
      temp[0] = aValue[0]; //ID
      temp[1] = aValue[1];  //login
      temp[2] = aValue[2];  //Nome
      temp[3] = aValue[3];  //acesso
      temp[4] = aValue[4]; //Senha 
      
    fireTableCellUpdated(linha, 0);
    fireTableCellUpdated(linha, 1);
        
    }
    public boolean isCellEditable(int linha, int coluna){
        
        return false;
    }
    
    public String[] getUsuario(int linha){
        
        return linhas.get(linha);
        
    }
    
    public void addRow(String user[]){
        this.linhas.add(user);
        
        int ultimaLinha = getRowCount() -1;
        this.fireTableRowsInserted(ultimaLinha,ultimaLinha);
    }
        
    public void removeRow(int linha){
        this.linhas.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public void addLista(List<String[]> user){
        
        int tamanhoAntigo = getRowCount();
        
        
        linhas.addAll(user);
        
        fireTableRowsInserted(tamanhoAntigo, getRowCount() -1);
        
        
        
    }
    
    public void removeAll(){
        
       linhas.clear();
       fireTableDataChanged();
        
    }
    
    
}
