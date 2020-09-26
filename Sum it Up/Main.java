#include<iostream>
using namespace std;
void digisum(int n)
{
	int sum=0;
    int rem;
    
  	while(n!=0)
    {
      rem=n%10;
      sum+=rem;
      n=n/10;
    }
  	
  	if(sum<10)
    {
      cout<<sum;
      return;
    }
  	else
      digisum(sum);
}
int main()
{
  int n;
  cin>>n;
  digisum(n);
  return 0;
}