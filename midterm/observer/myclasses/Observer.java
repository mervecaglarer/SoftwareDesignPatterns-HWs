package midterm.observer.myclasses;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}