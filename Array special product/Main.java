#include<iostream>
#include<bits/stdc++.h>
using namespace std;

vector<int> specialProducts(int n,vector<int> a)
{
  int i=0,j,pro=1;
  vector<int> v;
  
  for(j=0;j<n;j++)
  {
    if(i==j)
      continue;
    pro=pro*a[j];
    
    if(j==a.size()-1)
    {
      v.push_back(pro);
      pro=1;
      i++;
      j=-1;
      if(i==n)
        break;   
   	}
  }
  v.push_back(pro);
  return v;
}

int main()
{
  int n,k,i;
  vector<int> v;
  cin>>n;
  
  for(i=0;i<n;i++)
  {
    cin>>k;
    v.push_back(k);
  }
  
  v=specialProducts(n,v);
  
  for(int x: v)
    cout<<x<<endl;
  
  return 0;
}