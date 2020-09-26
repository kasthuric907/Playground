#include <iostream>
using namespace std;

void swap(int &a,int &b)
{
  int temp=a;
  a=b;
  b=temp;
}

int main()
{
  int x,y;
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<<" and b="<<y<<endl;
  swap(x,y);
  cout<<"After swapping a= "<<x<<" and b="<<y;
  
  return 0;
}
  