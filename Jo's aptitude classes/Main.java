#include<iostream>
int smallest(int a,int b,int c)
{
  	int small=a;
  	if(b<small)
      small=b;
  	if(c<small)
      small=c;
  
  	return small;
}
int main()
{
    int a,b,c,gcd1,res,ans;
    std::cin>>a>>b>>c>>ans;
   	int small=smallest(a,b,c);
  	
  	while(small>=1)
    {
      if(a%small==0 && b%small==0 && c%small==0)
      {
        res=small;
        break;
      }
      small--;
    }
    
  	if(res==ans)
      std::cout<<"Answer is correct.\n";
  else
    	std::cout<<"Answer is wrong.\n";
}