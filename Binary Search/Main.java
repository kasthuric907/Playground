#include<iostream>
#include<vector>
using namespace std;

int bsearch(vector<int> a,int l,int h,int k)
{
  if(l<=h)
  {
    int m=(l+h)/2;
    if(a[m]==k)
      return m;
    else if(a[m]>k)
      return bsearch(a,l,m-1,k);
    else
	  return bsearch(a,m+1,h,k);
  }
  return -1;	
}

int main()
{
  int n,e,k;
  cin>>n;
  vector<int> a;
  for(int i=0;i<n;i++)
  {
    cin>>e;
    a.push_back(e);
  }
  
  cin>>k;
  
  int p=bsearch(a,0,n-1,k);
  if(p==-1)
    cout<<"Not found";
  else
    cout<<p;
  
  return 0;
}