#include<bits/stdc++.h>
using namespace std;
 
 struct node{
     int data;
      struct node* next;
 };

 void lltraversal(struct node *ptr){
     while(ptr != NULL){
         cout << ptr->data << " ";
         ptr= ptr->next;
     }
     cout << endl;
 }

 struct node* insertAtfirst(struct node *head, int data){
        struct node* ptr = (struct node*)malloc(sizeof(struct node));
        ptr->next = head;
        ptr->data = data;
        return ptr;
 }

 struct node* insertatindex(struct node* head, int data, int index){
     struct node* ptr = (struct node*)malloc(sizeof(struct node));
     struct node *p = head;
     int i=0;
     while(i != index-1){
         p= p->next;
         i++;
     }
     ptr->data= data;
     ptr->next = p->next;
     p->next = ptr;

     return head;

 }
 
 struct node* insertatend(struct node* head, int data){
     struct node* ptr = (struct node*)malloc(sizeof(struct node));
     ptr->data= data;
     struct node *p = head;

     while(p->next != NULL){
         p=p->next;
     }
     p->next= ptr;
     ptr->next = NULL;
     return head;
     
 }
 
int main()


{
        struct node *head;
        struct node *f1;
        struct node *f2;
        struct node *f3;
        struct node *f4; 

     head = (struct node *)malloc(sizeof(struct node));
     f1 = (struct node *)malloc(sizeof(struct node));
        f2 = (struct node *)malloc(sizeof(struct node));
        f3 = (struct node *)malloc(sizeof(struct node));
        f4 = (struct node *)malloc(sizeof(struct node));

        head->data= 12;
        head->next= f1;

        f1->data= 23;
        f1->next= f2;

        f2->data = 34;
        f2->next= f3;

        f3->data= 132;
        f3->next= f4;

        f4->data= 43;
        f4->next= NULL;

         lltraversal(head);
        //  head = insertAtfirst(head, 56);
        head = insertatend (head, 100);
         lltraversal(head);

                
 
      return 0;
}