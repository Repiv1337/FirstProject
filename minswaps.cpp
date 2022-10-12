#include <vector>
#include <iostream>
#include <algorithm>





int count(std::vector<std::pair<int,int>> a){
    int swap=0;
    for(unsigned int i=0;i<a.size();i++)
{
    if(i==a[i].second){
        continue;
    }
    swap++;
    std::swap(a[i],a[a[i].second]);
    i--; 
}
return swap;
}




int lilysHomework(std::vector<int> arr) {

std::vector<std::pair<int,int>> vec(arr.size());
for(unsigned int i=0;i<arr.size();i++){
    vec[i] = {arr[i],i};
}
int swap=0;
int swapd = 0;
std::sort(vec.begin(),vec.end());
std::vector<std::pair<int,int>> vecd = vec;
std::reverse(vecd.begin(),vecd.end());

return std::min(count(vec),count(vecd));
}

int main()
{
    int n = 5;
    std::cin >> n;
    int val = 0;
    std::vector<int> vec;
    while(n!=0){
        std::cin >> val;
        vec.push_back(val);
        n--;
    }
   std::cout << lilysHomework(vec) << std::endl;
    return 0;
}
