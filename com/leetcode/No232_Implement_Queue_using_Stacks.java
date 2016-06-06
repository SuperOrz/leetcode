package com.leetcode;

import java.util.Stack;

public class No232_Implement_Queue_using_Stacks {
    class MyQueue {
        private Stack<Integer> s1=new Stack<>();
        private Stack<Integer> s2=new Stack<>();
        // Push element x to the back of queue.
        public void push(int x) {
            s1.push(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            if(!empty()){
                if(!s2.empty()){
                    s2.pop();
                }else{
                    while(!s1.empty()){
                        s2.push(s1.pop());
                    }
                    s2.pop();
                }
            }
        }

        // Get the front element.
        public int peek() {
            if(!empty()){
                if(!s2.empty()){
                    return s2.peek();
                }else{
                    while(!s1.empty()){
                        s2.push(s1.pop());
                    }
                    return s2.peek();
                }
            }
            else return 0;
        }

        // Return whether the queue is empty.
        public boolean empty() {
            
            return (s1.empty() && s2.empty());
            
        }
    }
}
