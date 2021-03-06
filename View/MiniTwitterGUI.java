package View;

import Model.UserGroup;
import Model.User;
import Interfaces.Windows;
import DesignPatterns.Visitor;
import VisitorComponents.GroupSize;
import VisitorComponents.PositiveSize;
import VisitorComponents.TweetSize;
import VisitorComponents.UserSize;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class MiniTwitterGUI extends javax.swing.JFrame implements Windows, Visitor {
    
    //Have access to another JFrame (If needed)
    private Windows FrameB;
    
    //JTree
    protected DefaultMutableTreeNode root;
    protected DefaultTreeModel model;
    private DefaultMutableTreeNode  currentUserTreeNode;
    private DefaultMutableTreeNode currentGroupTreeNode;
    
    //Define Classes
    private final UserGroup rootGroup;
    private UserGroup currentGroup;
    private User currentUser;
    
    //Save references of users & groups
    protected Map<String,Windows> users;
    private List<String> groups;
    protected String lastUpdatedUser;
    private TreePath jTreeCurrentSelection;
    
    //Define Visitor Components
    private GroupSize groupSize;
    private UserSize userSize;
    protected TweetSize tweetSize;
    protected PositiveSize positiveSize;
    
    /**
     * Creates new form MiniTwitterGUI
     */
    public MiniTwitterGUI() {
       
        //Create Root Group
        rootGroup = new UserGroup("Root");
        currentGroup = rootGroup;
        
        //Add Root Group --> Tree Node --> Tree Model
        root = new DefaultMutableTreeNode(rootGroup, true);
        currentGroupTreeNode = root;
        model = new DefaultTreeModel(root); 
        
        users = new HashMap<>();
        groups = new ArrayList<>();
        
        groupSize = new GroupSize();
        userSize = new UserSize();
        tweetSize = new TweetSize();
        positiveSize = new PositiveSize();
        
        //Start at size one since we created a Root
        groupSize.AddOne();
    }
    
    @Override
    public void setFrame(Windows frame) {
        this.FrameB = frame;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        addUserTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        addGroupTextArea = new javax.swing.JTextArea();
        addGroup = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        openUserView = new javax.swing.JButton();
        showUserTotal = new javax.swing.JButton();
        showMessagesTotal = new javax.swing.JButton();
        showPositivePercentage = new javax.swing.JButton();
        showGroupTotal = new javax.swing.JButton();
        showMessagesTotal1 = new javax.swing.JButton();
        showPositivePercentage1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTree1.setCellRenderer(new CustomTreeCellRenderer());
        jTree1.setModel(model);
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        addUserTextArea.setColumns(20);
        addUserTextArea.setRows(5);
        jScrollPane2.setViewportView(addUserTextArea);

        addGroupTextArea.setColumns(20);
        addGroupTextArea.setRows(5);
        jScrollPane3.setViewportView(addGroupTextArea);

        addGroup.setText("ADD GROUP");
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });

        addUser.setText("ADD USER");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        openUserView.setText("OPEN USER VIEW");
        openUserView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUserViewActionPerformed(evt);
            }
        });

        showUserTotal.setText("SHOW USER TOTAL");
        showUserTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUserTotalActionPerformed(evt);
            }
        });

        showMessagesTotal.setText("SHOW MESSAGES TOTAL");
        showMessagesTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMessagesTotalActionPerformed(evt);
            }
        });

        showPositivePercentage.setText("SHOW POSITIVE PERCENTAGE");
        showPositivePercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPositivePercentageActionPerformed(evt);
            }
        });

        showGroupTotal.setText("SHOW GROUP TOTAL");
        showGroupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGroupTotalActionPerformed(evt);
            }
        });

        showMessagesTotal1.setText("VALIDATE");
        showMessagesTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showValidationPerformed(evt);
            }
        });

        showPositivePercentage1.setText("SHOW LAST UPDATED USER");
        showPositivePercentage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLastUpdatedUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(openUserView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showMessagesTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(showUserTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(showMessagesTotal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showGroupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showPositivePercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showPositivePercentage1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addGroup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(openUserView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showUserTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showGroupTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showMessagesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPositivePercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showMessagesTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPositivePercentage1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Add Group
    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed
        
        String inputText = addGroupTextArea.getText();
        
        //Check if TextBox is empty 
        if(inputText.isEmpty()){
            PopUpMessage("Group name is empty", JOptionPane.WARNING_MESSAGE);
        }
        //Check if username is already taken
        else if(!groupNameAvailability(inputText)){
            PopUpMessage("This Group name is not available", JOptionPane.WARNING_MESSAGE);
        }
        //A group has been added succesfully
        else{
            //Add group to current correspoding model class & Increase group counter
            UserGroup addingNewGroup = new UserGroup(inputText);
            groups.add(inputText);
            currentGroup.AddGroup(addingNewGroup);
            currentGroup = addingNewGroup;
            groupSize.AddOne();
            
            //Have group be able to have children & add it to JTree
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(addingNewGroup, true);
            currentGroupTreeNode.add(newNode);
            currentGroupTreeNode = newNode;
            model.reload();
            expandJTree();
            jTree1.setSelectionPath(new TreePath(model.getPathToRoot(newNode)));
            addGroupTextArea.setText(null);
        }
    }//GEN-LAST:event_addGroupActionPerformed

    //Open highlighted user from JTree on a new JFrame
    private void openUserViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openUserViewActionPerformed
        
        //If a user has not been selected
        if(currentUserTreeNode == null){
            PopUpMessage("A user has not been selected", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //Open user's View
            runSecondJFrame();
        }
    }//GEN-LAST:event_openUserViewActionPerformed

    //An event listener for JTree
    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged

        //Get Object reference when an item is selected from JTree
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) evt.getPath().getLastPathComponent();
              
         //Grab if user has been selected
         if(node.getUserObject() instanceof User) {
            currentUser = (User) node.getUserObject();
            currentUserTreeNode = node;
            currentGroupTreeNode = (DefaultMutableTreeNode) node.getParent();
            currentGroup = (UserGroup) currentGroupTreeNode.getUserObject();
         }
         //Grab if Group has been selected
         else{
             currentUser = null;
             currentUserTreeNode = null;
             currentGroup = (UserGroup) node.getUserObject();
             currentGroupTreeNode = node;   
         }
        
         //For Debugging purposes
        /*System.out.println("CurrentUser: " + currentUser);
        System.out.println("CurrentUserTreeNode: " + currentUserTreeNode);
        System.out.println("CurrentGroup: " + currentGroup);
        System.out.println("CurrentGroupTreeNode: " + currentGroupTreeNode);
        System.out.println("---------------------------------------------------");*/
    }//GEN-LAST:event_jTree1ValueChanged

    //Add User
    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        
        String inputText = addUserTextArea.getText();
        
        //Check if TextBox is empty 
        if(inputText.isEmpty()){
            PopUpMessage("Username is empty", JOptionPane.WARNING_MESSAGE);
        }
        //Check if username is already taken
        else if(!usernameAvailability(inputText)){
            PopUpMessage("This Username is not available", JOptionPane.WARNING_MESSAGE);
        }
        //A user has been added succesfully
        else{
            //Add user to current correspoding model class & Increase user counter
            User currentUser = new User(inputText);
            users.put(inputText, new UserViewGUI(currentUser));
            currentGroup.AddUser(currentUser);
            userSize.addOne();
            
             //Disable user to be able to have children & add it to JTree
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(currentUser, false);
            currentGroupTreeNode.add(newNode);
            model.reload();
            expandJTree();
            jTree1.setSelectionPath(new TreePath(model.getPathToRoot(newNode)));
            addUserTextArea.setText(null);
        }
    }//GEN-LAST:event_addUserActionPerformed

    //Display total amount of Users
    private void showUserTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUserTotalActionPerformed
        PopUpMessage("Total Users: " + Integer.toString(userSize.accept(this)), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showUserTotalActionPerformed

    //Display total amount of Groups
    private void showGroupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGroupTotalActionPerformed
        PopUpMessage("Total Groups: " + Integer.toString(groupSize.accept(this)), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showGroupTotalActionPerformed

    //Display total amount of Messages
    private void showMessagesTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMessagesTotalActionPerformed
        PopUpMessage("Total Messages: " + Integer.toString(tweetSize.accept(this)), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showMessagesTotalActionPerformed

    //Display percentage of positive words
    private void showPositivePercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPositivePercentageActionPerformed
        
        //Grab total positive & tweets  
        int positiveCounter = positiveSize.accept(this);
        int totalTweets = tweetSize.accept(this);
        
        if(totalTweets == 0){
            PopUpMessage("No tweets yet", JOptionPane.ERROR_MESSAGE);
        }
        else{
           
            //Display percentage
            double percent = ((double)positiveCounter/totalTweets) * 100;
            PopUpMessage(Double.toString(percent) + "%", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_showPositivePercentageActionPerformed

    private void showLastUpdatedUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLastUpdatedUserActionPerformed
        
        /*if(lastUpdatedUser ==  null){
            PopUpMessage("Not Last Update Found", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            PopUpMessage(lastUpdatedUser, JOptionPane.INFORMATION_MESSAGE);
        }*/
        
        String latest = getLatestUser();
   
        if(latest == null){
            PopUpMessage("Not Last Update Found", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            PopUpMessage(latest, JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_showLastUpdatedUserActionPerformed

    private void showValidationPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showValidationPerformed
        
        if(checkValidation()){
            PopUpMessage("ID verification: VALID", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            PopUpMessage("ID verification: NOT VALID", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_showValidationPerformed

    //Check if username has been taken already for Users
    public boolean usernameAvailability(String userName){
        
        return !users.containsKey(userName);    
    }
    
    //Check if username has been taken already for Groups
    public boolean groupNameAvailability(String groupName){
        
        return !groups.contains(groupName);   
    }
    
    public boolean checkValidation(){
        
        Set<String> IDs = new HashSet<>();
        
         for(String eachUser : users.keySet()){
            if(IDs.contains(eachUser) || !eachUser.matches("\\S+")){
                return false;
            }
            
            IDs.add(eachUser);
        }
         
        for(String eachGroup : groups){
             if(IDs.contains(eachGroup) || !eachGroup.matches("\\S+")){
                 return false;
             }
         }
        
        return true;
    }
    
    //Expand everything on JTree
    public void expandJTree(){
        
        for (int i = 0; i < jTree1.getRowCount(); i++) {
            jTree1.expandRow(i);
        }
    }
    
    //Have a popup show up with a message and messageType
    public void PopUpMessage(String message, int messageType){
        JOptionPane.showMessageDialog(null, message, "Alert", messageType);   
    }
    
    //Run second JFrame as a different thread
    public void runSecondJFrame(){
        
        java.awt.EventQueue.invokeLater(() -> {
            
            //Since the Users JFrame have been saved. Search for it and
            //open the selected user's window
            for (Map.Entry<String, Windows> entry : users.entrySet()) {
                String key = entry.getKey();
                Windows value = entry.getValue();
                
                if(currentUser.getUniqueID().equals(key)){
                    value.setFrame(this);
                    value.display();
                    break;
                }
            }     
        }); 
    }
    
    public String getLatestUser(){
        
        String user = "";
        long temp = 0;
        
        Enumeration en = root.depthFirstEnumeration();
        
        while (en.hasMoreElements()) {
            
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) en.nextElement();

            if(node.getUserObject() instanceof User){
               User currentUser = (User) node.getUserObject();
               
                if(currentUser.getTimeStampLong() > temp){
                    temp = currentUser.getTimeStampLong();
                    user = currentUser.getUniqueID();
                }
            }
        }
        
        if(temp == 0){
            return null;
        }
        
        return user;
    }
    
    //Load all widgets from Swing & Make GUI show up
    @Override
    public void display() {
        
        initComponents();
        this.setVisible(true);
    }
    
    @Override
    public int visit(UserSize userSize) {
        return userSize.getSize();
    }

    @Override
    public int visit(GroupSize groupSize) {
       return groupSize.getSize();
    }

    @Override
    public int visit(TweetSize tweetSize) {
        return tweetSize.getTweetCounter();
    }

    @Override
    public int visit(PositiveSize positivePercentage) {
        return positivePercentage.getPositiveCounter();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroup;
    private javax.swing.JTextArea addGroupTextArea;
    private javax.swing.JButton addUser;
    private javax.swing.JTextArea addUserTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton openUserView;
    private javax.swing.JButton showGroupTotal;
    private javax.swing.JButton showMessagesTotal;
    private javax.swing.JButton showMessagesTotal1;
    private javax.swing.JButton showPositivePercentage;
    private javax.swing.JButton showPositivePercentage1;
    private javax.swing.JButton showUserTotal;
    // End of variables declaration//GEN-END:variables
}
