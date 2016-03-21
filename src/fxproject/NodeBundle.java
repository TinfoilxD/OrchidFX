package fxproject;/*
 * Written by Tin Van on 3/12/16.
 */

import javafx.scene.Node;

public class NodeBundle
{
    private Node node;
    private Object controller;

    public NodeBundle(Node node, Object controller)
    {
        this.node = node;
        this.controller = controller;
    }

    public Node getNode()
    {
        return node;
    }

    public void setNode(Node node)
    {
        this.node = node;
    }

    public Object getController()
    {
        return controller;
    }

    public void setController(Object controller)
    {
        this.controller = controller;
    }
}
