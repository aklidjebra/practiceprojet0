package practice1;

public class Stack {


    int B=3;
    int [] array = new int[5];
    public void push(int data){

        array[B]=data;
        B++;

    }

    public void Show (){
        for (int S:array) {

            System.out.println(S);
        }







    }}
