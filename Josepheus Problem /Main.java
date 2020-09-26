#include<iostream>
using namespace std;

int circlekill(int n, int k) 
{ 
    if (n == 1) 
        return 1; 
    else
        return (circlekill(n - 1, k) + k-1) % n + 1; 
} 

int main()
{
  int n,k;
  cin>>n>>k;
  int ans=circlekill(n,k);
  cout<<ans;
  return 0;
}