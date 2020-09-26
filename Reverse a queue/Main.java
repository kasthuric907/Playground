#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int q[1000];
int front=-1,rear=-1;

void eq(int v)
{
	if(front==-1)
	{
		rear++;
		front++;
	}
	else
		rear++;
	
	q[rear]=v;
}

void display(int v)
{
	if(v==1)
	{	
		for(int i=front;i<=rear;i++)
		cout<<q[i]<<" ";
	}
	if(v==2)
	{
		for(int i=rear;i>=front;i--)
		cout<<q[i]<<" ";
	}
	cout<<endl;		
}

int main()
{
	int c;
	for(int i=0;i<100;i++)
	{
      cin>>c;
      if(c<0)
			break;
      else
		eq(c);
	}
	
  	if(front==-1)
	{
		cout<<"Queue is empty\n";
		return 0;
	}

	cout<<"Before reversing:\n";
	display(1);
	cout<<"After reversing:\n";
	display(2);
    
  	return 0;
}