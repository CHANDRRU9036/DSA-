package stakesandqueues;
public class stakeusingarray {
    public static void main(String[] args) {
        std data=new std();
        data.Push(1);
        data.Push(6);
    }
    
    
}


class std {
    int max=6;
    int stack[]=new int[max];
    int top=-1;

    void Push(int val){
        if(top>=max-1){
            System.out.println("overflow");
        }else{
            stack[++top]=val;
            System.out.print(val+ " is inserted to stack.\n");
            }
    }

    void Pop(){
        if(top==-1){
            System.out.print("underflow");
        }else{
            System.out.println(stack[top--]+"is pooped from stake");
        }
    }

    void peek(){
        System.out.println(stack[top]+"top value of the stack");
    }


    
}



