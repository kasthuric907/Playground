#include<bits/stdc++.h>
using namespace std;

int main()
{
  string s;
  cin>>s;
  vector<int> z;
  for(int i=0;i<s.length();i++)
  {
    if(s[i]=='1')
      cout<<s[i]-'0';
    else
      z.push_back(s[i]-'0');
  }
  
  for(int x:z)
    cout<<x;
  return 0;
}