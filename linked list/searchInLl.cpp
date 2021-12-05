#include<bits/stdc++.h>
using namespace std;
 
 class node{
     public :
        int data;
        node* next;

        node(int val){
            data= val;
            next= NULL;
        }

 };

 void insertAtHead(node* &head, int val){
     node* n = new node(val);
     n->next= head;
     head = n;
 }

 bool search(node* head, int key){
     node* temp = head;
     while(temp != NULL){
         if(temp->data== key){
             return true;
         }
         temp = temp -> next;
     }
     return true;
 }

 void display(node* head){
     node* temp = head;
     while(temp!= NULL){
         cout << temp->data << " -> ";
         temp = temp-> next;
     }
     cout << "NULL" << endl;
 }
 
 
int main()
{
        node* head = head;
        insertAtHead(head, 5);
        insertAtHead(head, 4);
        insertAtHead(head, 3);
        insertAtHead(head, 2);
        insertAtHead(head, 1);
        insertAtHead(head, 0);
// search(head, 4);


display(head);
      
 
      return 0;
}