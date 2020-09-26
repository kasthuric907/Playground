#include<iostream>
#include<cstring>
#include<bits/stdc++.h>
using namespace std;

char st[100];
int top=-1;

void push(char val)
{
  st[++top]=val;
}

char pop()
{
  return st[top--];
}

int main()
{
  string s;
  cin>>s;
  
  char c;
  int flag=1;
  
  push('#');
  
  for(int i=0;i<s.length();i++)
  {
    char ch = s[i];
    if(ch=='(' || ch=='{' || ch=='[')
      push(ch);
    else
    {
      c=pop();
      
      if(ch==')'&& c!='(')
      {
      	flag=0;
      	break;
      }
      		
      if(ch=='}'&& c!='{')
      {
      	flag=0;
      	break;
      }
      
      if(ch==']'&& c!='[')
      {
      	flag=0;
      	break;
      }
    }
  }
  
  c=pop();
  if(c=='#' && flag==1)
    cout<<"Balanced";
  else
    cout<<"Not Balanced";
  
  return 0;
}