#include<bits/stdc++.h>
using namespace std;
 
 class node{
public:
     int data;
     node* next;

     node(int val){
         data = val;
         next= NULL;
     }
 };

 insertAtTail(node* &head, int val){
        node* n = new node(val);

        node* temp = head;
        while(temp->next!=NULL){
            temp=temp->next;
        }
        temp->next= n;
 }
 
int main()
{
 
      
 
      return 0;
}