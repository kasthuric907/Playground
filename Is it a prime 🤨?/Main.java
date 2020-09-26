#include<iostream>
#include<math.h>
using namespace std;
bool prime(int n)
{
  if(n<=1)
    return false;
  
  if(n<=3)
    return true;
  
  if(n%2==0 || n%3==0)
    return false;
  
  for(int i=5;i*i<=n;i++)
    if(n%i==0)
      return false;
  
  return true;	
}
int main()
{
  int n;
  cin>>n;
  
  if(prime(n))
    cout<<"Prime";
  else
    cout<<"Not Prime";
  return 0;
}