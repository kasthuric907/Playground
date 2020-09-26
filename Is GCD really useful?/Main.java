#include<iostream>
#include<algorithm>
#include<bits/stdc++.h>
using namespace std;

int gcd(int a,int b)
{
  int rem;
  int n=min(a,b);
  int m=max(a,b);
  
    while(n!=0)
    {
      rem=m%n;
      m=n;
      n=rem;
    }
  return m;
      
}

int main()
{
  int n1,n2;
  cin>>n1>>n2;
  int ans=gcd(n1,n2);
  cout<<ans;
  return 0;
}