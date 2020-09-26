#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}

int arm(int n)
{
    int count=0;
  	int m=n;
  	int temp=n;
  	int rem;
  	
  	while(temp>0)
    {
      	temp=temp/10;
      	count++;
    }
    
  	temp=0;
  	while(n>0)
    {
      	rem=n%10;
      	temp+=power(rem,count);
      	n=n/10;
    }
  	if(m==temp)
      return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}