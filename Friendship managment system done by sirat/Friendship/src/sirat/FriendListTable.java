
package sirat;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;

public class FriendListTable extends JInternalFrame 
{
    private JTable table;
    private SModel mymodel;
    
    public FriendListTable() 
    {

        super("Get Friend List", false, true, false, true);
        
        table = new JTable();
        table.setAutoCreateColumnsFromModel(false);
        
        mymodel = new SModel(); 
        table.setModel(mymodel);

        TableColumn column = new TableColumn(0, 200, null, null);
        table.addColumn(column); 
        column = new TableColumn(1, 100, null, null);
        table.addColumn(column); 
        
        Container c = getContentPane();
        c.setLayout(new BorderLayout());


        JPanel p = new JPanel();
        p.add(new JScrollPane(table)); 

        JPanel p1 = new JPanel();

        JButton add = new JButton("Get Friend List");
            add.addActionListener(new ActionListener() 
            { 
                public void actionPerformed(ActionEvent we) 
                {
                    
                    
                    
                    try {
                        FriendList ob = new FriendList();
                        ob.getDatabasevalue();
                  
                        Vector v = ob.getTransactions();
                        if(v.size() > 0)
                        {
                            v.add(new FriendListV( "",""));
                     
                            v.add(new FriendListV ("",""));

                            mymodel.vector = v; 
                            mymodel.fireTableDataChanged(); 
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Sorry no Response ");
                        }

                    }
                    catch(Exception e) {
                        JOptionPane.showMessageDialog(null, "Error Occured " + e.getMessage());
                        e.printStackTrace();
                    }

                }
            });
        p1.add(add);
        c.add("Center", new JScrollPane(p));
        c.add("South", p1);
       
        setResizable(false);
        setSize(500, 500);


    }

    class SModel extends AbstractTableModel
    {
        
        public  String columns[] = {"Friend Name", "Friend ID"};
        protected Vector vector;

        public SModel()
        {
            vector = new Vector();
        }

        public int getRowCount() 
        {
            return vector==null ? 0 : vector.size();
        }

        public int getColumnCount() 
        {
            return columns.length;
        }

        public String getColumnName(int column)
        {
            return columns[column];
        }

        public boolean isCellEditable(int nRow, int nCol) 
        {
            return false;
        }

        public Object getValueAt(int nRow, int nCol)
        {
            if (nRow < 0 || nRow >= getRowCount())
                return "";

           FriendListV t = (FriendListV)vector.elementAt(nRow);

            switch(nCol) 
            {
                case 0: return t.getName(); 
                case 1: return t.getPhone(); 
                
            }
            return "";
        }

        public void add(Object o)
        {
            vector.addElement(o);
        }

        public void remove() 
        {
            vector.removeAllElements();
        }

    }

    class CustomRenderer extends JLabel implements TableCellRenderer  
    {
        public CustomRenderer() 
        {
            super();
        }

        public java.awt.Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {

            if (value instanceof Double) {
                setHorizontalAlignment(RIGHT); 
                Double d = (Double)value;
                double a = d.doubleValue();
                if(a == 0) {
                    setText(""); 
                }
                else {
                    setText(new Double(a).toString()); 
                }
            }

            return this;
        }
    }

}


