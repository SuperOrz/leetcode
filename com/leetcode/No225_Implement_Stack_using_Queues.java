package com.leetcode;

import java.util.ArrayList;
import java.util.List;


public class No225_Implement_Stack_using_Queues {
    class MyStack {
        List<Integer> q1 = new ArrayList<>();
        List<Integer> q2 = new ArrayList<>();
        // Push element x onto stack.
        public void push(int x) {
            if(q1.isEmpty())
                q2.add(x);
            else
                q1.add(x);
        }

        // Removes the element on top of the stack.
        public void pop() {
            if(q1.isEmpty()){
                while(!q2.isEmpty()){
                    if(q2.size()==1)
                        q2.remove(0);
                    else
                        q1.add(q2.remove(0));
                }
            }else{
                while(!q1.isEmpty()){
                    if(q1.size()==1)
                        q1.remove(0);
                    else
                        q2.add(q1.remove(0));
                }
            }
        }

        // Get the top element.
        public int top() {
            if(q1.isEmpty())
                return q2.get(q2.size()-1);
            else
                return q1.get(q1.size()-1);
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return q1.isEmpty()&&q2.isEmpty();
        }
    }
}
