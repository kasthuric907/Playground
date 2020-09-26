#include<iostream>
#include<math.h>
using namespace std;

int main()
{
  int n;
  cin>>n;
  int sum=0;
  int c;
  int temp=n;
  int rem;
  
  while(temp!=0)
  {
    temp=temp/10;
    c++;
  }
  
  temp=n;
  for(int i=0;i<c;i++)
  {
    rem=temp%10;
    sum+=pow(rem,c);
    temp=temp/10;
  }
  
  if(sum==n)
    cout<<"Yes";
  else
    cout<<"No";
  
  return 0;
}