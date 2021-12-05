#include<bits/stdc++.h>
using namespace std;
 
 struct node{
     int data;
     struct node* next;
 };

 void lltraversal(struct node* ptr){
     while(ptr != NULL){
     cout <<"element " << ptr->data << endl;
      ptr = ptr->next;     
     }     
 }
 
int main()



{

        struct node* head;
        struct node* second;
        struct node* third;  
        struct node* fourth;      
        
      head = (struct node*) malloc(sizeof(struct node));
      second = (struct node*) malloc(sizeof(struct node));
       third = (struct node*) malloc(sizeof(struct node));
       fourth = (struct node*) malloc(sizeof(struct node));

      head->data =7;
      head->next= second;

      second->data =12;
      second->next= third;

      third->data =10;
      third->next= fourth;

      fourth->data= 34;
      fourth->next= NULL;
      
              lltraversal(head);

 
      return 0;
}