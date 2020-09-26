#include<iostream>
#include<bits/stdc++.h>
using namespace std;

long SumNumbersDivisible(long m,long n)
{
  long c1=(m-1)/15;
  long c2=(n-1)/15;
  long n1=(c2*(c2+1))/2;
  long n2=(c1*(c1+1))/2;
  long ans = n1*15 - n2*15;
  return ans;
}

int main()
{
  long m,n;
  cin>>m>>n;
  long ans = SumNumbersDivisible(m,n);
  cout<<ans<<endl;
  return 0;
}