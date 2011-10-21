package org.apache.airavata.xbaya.registrybrowser.nodes;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import org.apache.airavata.registry.api.Registry;
import org.apache.airavata.xbaya.registrybrowser.menu.AbstractBrowserActionItem;
import org.apache.airavata.xbaya.registrybrowser.menu.RefreshAction;

public abstract class AbstractAiravataTreeNode implements TreeNode {

	private TreeNode parent;
	private Color backgroundSelectionColor;
	private DefaultTreeCellRenderer defaultCellRenderer = new DefaultTreeCellRenderer();
	private List<TreeNode> children;

	public AbstractAiravataTreeNode(TreeNode parent) {
		setParent(parent);
	}
	
	@Override
	public Enumeration children() {
		this.children = listOfChildren();
		Collections.enumeration(children);
		return Collections.enumeration(children);
	}

	protected abstract List<TreeNode> getChildren();

	private List<TreeNode> listOfChildren(){
		children = (children==null) ? getChildren() : children;
		return children;
	}
	
	@Override
	public boolean getAllowsChildren() {
		return listOfChildren().size()>0;
	}

	@Override
	public TreeNode getChildAt(int index) {
		return listOfChildren().get(index);
	}

	@Override
	public int getChildCount() {
		return listOfChildren().size();
	}

	@Override
	public int getIndex(TreeNode node) {
		return listOfChildren().indexOf(node);
	}

	@Override
	public TreeNode getParent() {
		return parent;
	}

	@Override
	public boolean isLeaf() {
		return listOfChildren().size()==0;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public abstract String getCaption(boolean selected, boolean expanded, boolean leaf, boolean hasFocus);
	
	public abstract Icon getIcon(boolean selected, boolean expanded, boolean leaf, boolean hasFocus);
	 public void setBackgroundSelectionColor(Color c)
	 {
	 backgroundSelectionColor = c;
	 }
	 public Color getBackgroundSelectionColor()
	 {
	 return backgroundSelectionColor;
	 }
	 
	public Component getNodeComponent(boolean selected, boolean expanded, boolean leaf, boolean hasFocus){
		return null;
	}
	
	public Component getNodeComponent(JTree tree, Object value,
		      boolean selected, boolean expanded, boolean leaf, int row,
		      boolean hasFocus) {
		Component nodeComponent = getNodeComponent(selected, expanded, leaf, hasFocus);
		if (nodeComponent==null) {
			nodeComponent=getDefaultCellRenderer().getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
			if (nodeComponent instanceof JLabel) {
				JLabel lbl = (JLabel) nodeComponent;
				lbl.setText(getCaption(selected, expanded, leaf, hasFocus));
				lbl.setIcon(getIcon(selected, expanded, leaf, hasFocus));
			}
		}
		return nodeComponent;
	}

	protected DefaultTreeCellRenderer getDefaultCellRenderer() {
		return defaultCellRenderer;
	}
	
	protected List<TreeNode> getTreeNodeList(Object[] list, TreeNode parent){
		List<TreeNode> nodes = new ArrayList<TreeNode>();
		for (Object o : list) {
			nodes.add(AiravataTreeNodeFactory.getTreeNode(o,parent));
		}
		return nodes;
	}
	
	protected List<TreeNode> emptyList(){
		return new ArrayList<TreeNode>();
	}
	
	public void refresh(){
		this.children=null;
	}
	
	public abstract List<String> getSupportedActions();
	
	public boolean isActionSupported(AbstractBrowserActionItem action){
		return getSupportedActions().contains(action.getID());
	}
	
	public boolean triggerAction(JTree tree,String action) throws Exception{
		return triggerAction(tree, action, false);
	}
	
	public boolean triggerAction(JTree tree,String action, boolean force) throws Exception{
		if (action.equals(RefreshAction.ID)){
			refresh();
			((DefaultTreeModel)tree.getModel()).reload(this);
			return true;
		}
		return false;
	}

	protected TreeNode getRootNode(){
		TreeNode rootNode=this;
		while(rootNode.getParent()!=null){
			rootNode=rootNode.getParent();
		}
		return rootNode;
	}
	
	public Registry getRegistry(){
		TreeNode rootNode = getRootNode();
		if (rootNode instanceof RegistryNode){
			return ((RegistryNode)rootNode).getRegistry();
		}
		return null;
	}
	
	protected boolean askQuestion(String title, String question){
		return JOptionPane.showConfirmDialog(null, question, title, JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION;
	}
	
	protected void reloadTreeNode(JTree tree, TreeNode node) {
		TreePath selectionPath = tree.getSelectionPath();
		((DefaultTreeModel) tree.getModel()).nodeChanged(node);
		((DefaultTreeModel) tree.getModel()).reload(node);
		tree.expandPath(selectionPath);
	}
	
	public abstract String getActionCaption(AbstractBrowserActionItem action);
	
	public abstract Icon getActionIcon(AbstractBrowserActionItem action);
	
	public abstract String getActionDescription(AbstractBrowserActionItem action);
}
