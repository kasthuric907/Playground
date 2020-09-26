#include<iostream>
using namespace std;

int stack[1000];
int top1=-1,top2=1000;

void push(int value,int c)
{
  	if(c==1)
      stack[++top1]=value;
    
  	if(c==2)
      stack[--top2]=value;
}

void display(int v)
{
  if(v==1)
  {
    cout<<"Stack 1 Elements:\n";
    for(int i=top1;i>=0;i--)
     cout<<stack[i]<<" ";
  }
  if(v==2)
  {
    cout<<"\nStack 2 Elements:\n";
    for(int i=top2;i<1000;i++)
     cout<<stack[i]<<" ";
  }
}

void pop(int v)
{
   if(v==1)
   {
     if(top1==-1)
     {
       cout<<"Stack underflow. pop from stack 1 failed\n";
       return;
     }
     else
       top1--;
   }
   
   if(v==2)
   {
     if(top2==1000)
     {
       cout<<"Stack underflow. pop from stack 2 failed\n";
       return;
     }
     else
       top2++;
   }
}

int main()
{
  int n1,n2,v;
  int d1,d2;
  
  cin>>n1;
  for(int i=0;i<n1;i++)
  {
     cin>>v;
     push(v,1);
  }
  
  cin>>n2;
  for(int i=0;i<n2;i++)
  {
     cin>>v;
     push(v,2);
  }
  
  cin>>d1;
  cin>>d2;
  
  display(1);
  display(2);
  cout<<endl;
  
  for(int i=0;i<d1;i++)
    pop(1);
  
  for(int i=0;i<d2;i++)
    pop(2);
  
   display(1);
   display(2);
   cout<<endl;
  
  	return 0;
  
}