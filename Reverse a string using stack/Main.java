#include<iostream>
#include<bits/stdc++.h>
using namespace std;

char st[100];
int top=-1;

void push(char v)
{
	st[++top]=v;
}

int main()
{
	string s;
	cin>>s;
	
	for(int i=0;i<s.length();i++)
	{
		push(s[i]);
	}
	
	for(int i=top;i>=0;i--)
	{
		cout<<st[i];
	}
	 
  	return 0;
}