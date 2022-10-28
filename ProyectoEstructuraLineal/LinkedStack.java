/*
 * Utilizar dos arreglos y el apuntador del primer arreglo sera el primer elemento del segundo
 */
package ProyectoEstructuraLineal;

public class LinkedStack {
    private Object stack1[];    
    private Object stack2[];
    private int top1 = -1;
    private int top2 = -1;
    private int size1 = 0, size2 = 0;

    LinkedStack () { }

    LinkedStack(int t1, int t2) {
        size1 = t1;
        size2 = t2 + 1;
        stack1 = new Object[size1];
        stack2 = new Object[size2];
    }

    public Object getTopStack1() {
        return stack1[top1];
    }

    public Object getTopStack2() {
        return stack2[top2];
    }

    public void pushStack1(Object dato) {
        if (top1 + 1 < size1) {
            stack1[++top1] = dato;
        } else { System.out.println("No se puede ingresar datos"); }
    }

    public void pushStack2(Object dato) {
        if (!(isEmpty(top2))) {
            stack2[top2] = stack1[top1];
        } else if (top2 + 1 < size2) {
            stack2[++top2] = dato;
        } else System.out.println("No se puede ingresar los datos");
    }

    public void popStack1() { 
        if (!(isEmpty(top1))) {
            stack1[top1--] = null;
        } else return;
    }

    public void popStack2() { 
        if (!(isEmpty(top2))) {
            stack1[top2--] = null;
        } else return;
    }

    public boolean isEmpty(int top) {
        return (top < 0);
    }
}
 