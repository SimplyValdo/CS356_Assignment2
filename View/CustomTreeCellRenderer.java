package View;

import Model.UserGroup;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/****************************************************
 * This class is to set custom Icons on JTREE
****************************************************/

public class CustomTreeCellRenderer extends DefaultTreeCellRenderer{
    
    @Override
    public Component getTreeCellRendererComponent(JTree tree,Object value,boolean sel,boolean expanded,boolean leaf,int row,boolean hasFocus){
        
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

            if (value instanceof DefaultMutableTreeNode) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
                
                if (node.getUserObject() instanceof UserGroup) {                    
                    setIcon(super.getOpenIcon());
                }else{
                    setIcon(super.getLeafIcon());
                }
            }

            return this;
        }
}
    
