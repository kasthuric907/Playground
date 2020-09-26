#include<stdio.h>
#include<stdlib.h>

void merge(int a[],int low,int mid,int high)
{
	int i,j,k,b[100];
	i=k=low;
	j=mid+1;
	while(i<=mid && j<=high)
	{
		if(a[i]<a[j])
			b[k++]=a[i++];
		else
			b[k++]=a[j++];
	}
	while(i<=mid)
	{
		b[k++]=a[i++];
	}
	while(j<=high)
	{
		b[k++]=a[j++];
	}
	for(i=low;i<k;i++)
		a[i]=b[i];
}

void mergesort(int a[], int low,int high)
{
  int mid;
  if(low<high)
  {
    mid=(low+high)/2;
    mergesort(a,low,mid);
    mergesort(a,mid+1,high);
    merge(a,low,mid,high);
  }
}

int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  
  printf("Before Sort:\n");
  for(int i=0;i<n;i++)
    printf("%d ",a[i]);
  
  mergesort(a,0,n-1);
  
  printf("\nAfter Sort:\n");
  for(int i=0;i<n;i++)
    printf("%d ",a[i]);
    
  return 0;
}