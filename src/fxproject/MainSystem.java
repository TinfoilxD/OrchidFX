package fxproject;/*
 * Written by Tin Van on 2/15/16.
 */

public class MainSystem
{

    /*
    MainSystem is the superclass that will contain both the view classes, controllers,
    and main system functionality including database connection. It is the highest level container.

    RootStage is the super container for the view classes/controllers. This will also instantiate the various system methods.
    Class.forName will also be called here.
     */
    RootStageContainer rootStageContainer;
    public MainSystem()
    {
        rootStageContainer = new RootStageContainer();

    }
}
