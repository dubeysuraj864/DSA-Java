#include<bits/stdc++.h>
using namespace std;

void insertFirst(){
    struct node *ptr;
    cout << "enter the item: ";
    cin  >> item;

    if(start==NULL){
        start = (struct node*)malloc(sizeof(struct node));
        start->data= item;
        start->link= NULL;

    }
    else{
        ptr = start;
        start = (struct node*)malloc(sizeof(struct node));
        start->data= item;
        start -> link = ptr;
    }
    cout << "item is inserted "<< item;
}

void  display(){
    struct node *ptr = start;
    int i=1;
    if(ptr == NULL){
        cout << "linked list is empty... "<< endl;
    }
    else{
        cout <<  " ";
        while(ptr!=NULL){
            cout << i << " "<< ptr << " " << ptr->data << " " << ptr->link;
            ptr= ptr->link;
            i++;
        }
    }
} 
 struct node{
     int data;
     struct node *link;

 } *start =NULL;
    int item;
 
int main()
{
 
      int ch;
      do{
          cout << "1. insert first.. " << endl;
          cout << "2. display.. "<< endl;
          cout << "3. exit.. "<<endl;
          cout << "Enter your choice"<<endl;
          cin >> ch;

          switch(ch)
          {
              case 1: insertFirst();
              break;
              case 2: display();
              break;
              case 3: exit(0);
              default: cout << "pls, enter the right choice... " <<endl;
          }
        //   while(true); 
      }
 
      return 0;
}

