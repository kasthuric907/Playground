#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
  int n,k,sum1,sum2=0;
  vector<int> v;
  cin>>n;
  
  for(int i=0;i<n;i++)
  {
    cin>>k;
    v.push_back(k);
    sum2+=k;
  }
  
  sum1=((n+1)*(v[0]+v[n-1]))/2;
  cout<<sum1-sum2;
  return 0;
}