#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int tb,tr,r,b;
  	int overs;
  	float ofin,crate,trate;
  
  	cin>>tb>>tr>>r>>b;
  	
  	overs = (tb/6)+(0.1*(tb%6));
  	ofin = (b/6)+(0.1*(b%6));
  	crate = (r/ofin);
  	trate = ((float)tr/(float)overs);
  
  	cout<<fixed<<setprecision(1)<<overs<<endl<<ofin<<endl<<crate<<endl<<trate;
  	
  	if(crate >= trate)
      cout<<"\nEligible to Win\n";
    else
      cout<<"\nNot Eligible to Win\n";
      
      return 0;
  	
}