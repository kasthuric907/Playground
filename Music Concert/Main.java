#include<iostream>
using namespace std;
int main(){
  int *a;
  int mc=0,fc=0;
  int n;
  cin>>n;
  a = (int *) malloc(n*sizeof(int));
  
  for(int i=0;i<n;i++)
    cin>>*(a+i);
  
  for(int i=0;i<n;i++)
  {
    if((*(a+i))%2==0)
      fc++;
    else
      mc++;
  }
  cout<<mc<<endl<<fc;
  return 0;
}