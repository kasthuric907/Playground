#include<iostream>
using namespace std;

int sum(int n)
{
  int sum=0;
  if(n<10)
    return n;
  
  while(n!=0)
  {
    int rem = n%10;
    sum+=rem;
    n=n/10;
  }
  return sum;
}
int main()
{
  int n,d;
  cin>>n>>d;
  int count =0;
  
  for(int i=1;i<=n;i++)
  {
    int s=sum(i);
    if((i-s)>d)
      count++;
  }
  
  cout<<count;
  return 0;
}