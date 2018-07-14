// C++ program to demonstrate functionality of unordered_map
#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    unordered_map<int,int> umap;
    int minn=100000;
    int i,temp,x,v=-1;
    int n;
    cin>>n;
    unordered_map<int,int>:: iterator itr;
    for(i=0;i<n;i++){
        cin>>temp;
    itr=umap.find(temp);
    if(itr == umap.end())
        umap.insert(make_pair(temp,i));
    else
        {       if(itr->second!=-1){
            minn=min(minn,abs(itr->second-i));
            itr->second=-1;
        }
        }
    }
    
    if(i==n&&minn==100000)
        cout<<v<<"\n";
    else
        cout<<minn;
  return 0;
}
