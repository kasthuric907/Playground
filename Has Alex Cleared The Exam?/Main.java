#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n],alexregno;
  int i;
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>alexregno;
  int pass=0;
  for(i=0;i<n;i++)
  {
    if(alexregno==a[i])
      pass=1;
  }
  if(pass==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  
  return 0;
  
}