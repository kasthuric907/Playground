#include<iostream>
#include<cmath>
using namespace std;

int main()
{
  int apple;
  cin>>apple;
  int i=2;
  int n=0;
  
  while(apple>=n)
  {
  	i=pow(i,2);
    n=i*4-4;
  }
  
  if(apple<12)
  	cout<<2*4;
  else
	cout<<i;
      
  return 0;
}