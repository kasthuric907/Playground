#include<iostream>
using namespace std;
int main()
{
  int n,g;
  cin>>n>>g;
  cout<<"The number of friends in each team is ";
  cout<<n/g<<" and left out is "<<n%g<<endl;
}