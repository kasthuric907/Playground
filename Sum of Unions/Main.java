#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int i,j;
  int arr[m][n];
  int a,b;
  int colsum=0,rowsum=0;
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      cin>>arr[i][j];
  
  cin>>a>>b;
   i=a;
   for(j=0;j<n;j++)
   {
      rowsum+=arr[i][j];
   }
  j=b;
  for(i=0;i<m;i++)
  {
    if(i==a)
      continue;
    else
      colsum+=arr[i][j];
  }
  
  cout<<rowsum+colsum;
  return 0;
}