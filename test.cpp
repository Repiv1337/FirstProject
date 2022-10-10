#include <iostream>
#include <vector>

std::vector<int> manis(std::vector<int> vec){
    for(unsigned int i=0;i<vec.size();i++){
        vec[i] = vec[i]*2;
    }
    return vec;
}


int main(){
    std::vector<int> vect = {{1,2,3,4}};
    std::vector<int> ne = manis(vect);
    for(auto x: ne){
        std::cout << x << " ";
    }
}