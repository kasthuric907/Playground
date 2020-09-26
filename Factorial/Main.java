#include<iostream>
int fact(int n)
{
  	if(n==1 || n==0)
      return 1;
  	return n*fact(n-1);
}
int main()
{
  	int n;
  	std::cin>>n;
  	int res = fact(n);
  	std::cout<<"The factorial of "<<n<<" is "<<res;
  	return 0;
}