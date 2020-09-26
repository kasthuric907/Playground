#include <iostream>
using namespace std;


void digiroot(int n)
{
  int sum=0,rem;
   while(n>0)
   {
     rem=n%10;
     sum+=rem;
     n=n/10;
   }
	if(sum<10)
      cout<<sum;
 	else
      digiroot(sum);
}

int main()
{
  int n;
  cin>>n;
  digiroot(n);
  return 0;
}
  