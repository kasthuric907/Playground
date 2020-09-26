#include <iostream>
#include <cmath>
#include <bits/stdc++.h>

int main()
{
	int m,n,r;
    std::cin>>m>>n>>r;
  	int ans;
    ans = pow(m,n);
  	if(r<=ans)
      std::cout<<"Doctor, you can proceed with your experiment.\n";
  	else
      std::cout<<"Sorry Doctor! You need more bacteria.\n";
    return 0;
}