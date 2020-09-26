#include<iostream>
#include<vector>
#include<string>
using namespace std;

int main()
{
  string n1,n2,n3;
  cin>>n1>>n2>>n3;
  char r1,r2,r3,r4;
  r1=min(min(n1[0],n2[0]),n3[0]);
  r2=max(max(n1[1],n2[1]),n3[1]);
  r3=min(min(n1[2],n2[2]),n3[2]);
  r4=max(max(n1[3],n2[3]),n3[3]);
   
  cout<<r1<<r2<<r3<<r4;
  
  return 0;
}