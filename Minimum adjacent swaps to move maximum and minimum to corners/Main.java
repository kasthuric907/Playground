#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void swap(int *a,int *b)
{
  int t=*a;
  *a=*b;
  *b=t;
}

int bubblesort(int a[],int n)
{

  int max=*max_element(a, a + n);
  int min=*min_element(a, a + n);
  int minpos=0,maxpos=0;
  int i,j;
  int count=0;
  
  for(i=0;i<n;i++)
  {
  	if(a[i]==min)
  		minpos=i;
  	if(a[i]==max)
  		maxpos=i;
  }
  
  for(i=0;i<1;i++)
  {
  	for(j=minpos;j<n-i-1;j++)
  	{
  		if(a[j]<a[j+1])
  		{
  			swap(&a[j],&a[j+1]);
  			count++;
  		}
  	}
  }
  
  for(i=0;i<1;i++)
  {
  	for(j=0;j<maxpos;j++)
  	{
  		if(a[j]<a[j+1])
  		{
  			swap(&a[j],&a[j+1]);
  			count++;
  		}
  	}
  }
  
  return count;
}

int main()
{
  int n;
  cin>>n;
  int a[n];
  
  for(int i=0;i<n;i++)
    cin>>a[i];
  
  int count = bubblesort(a,n);
  cout<<count<<endl;
  
  return 0;
}