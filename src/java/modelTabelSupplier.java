/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class modelTabelSupplier extends AbstractTableModel{
    
    private List<ListSupplier> list;

    public modelTabelSupplier(List<ListSupplier> list) {
        this.list=list;
    }
   

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getKode_supplier();
            case 1:
                return list.get(rowIndex).getNama_supplier();
            case 2:
                return list.get(rowIndex).getKontak_supplier();
            case 3:
                return list.get(rowIndex).getTelepon_supplier();
            case 4:
                 return list.get(rowIndex).getAlamat_supplier();
            default:
                return null;
        }
    }
    
     @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "Kode Supplier";
            case 1:
                return "Nama Supplier";
            case 2:
                return "Kontak Supplier";
            case 3:
                return "Telepon Supplier";
            case 4:
                return "Alamat Supplier";
            default:
                return null;
        }
    }

    
}
