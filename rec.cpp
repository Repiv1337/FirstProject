#include <iostream>
#include <random>
void show()
{
    std::cout << "hello" << std::endl;
}



int func(int x)
{
    std::cout << x << std::endl;
    if(x>0)
    {
        func(x-1);
    }
    show();
    return x;
}

long gen(int n){
float win=0;
std::random_device rd; // obtain a random number from hardware
std::mt19937 gen(rd()); // seed the generator
std::uniform_int_distribution<> distr(1, 6); // define the range
for(int i=0;i<n;i++)
{
    if(distr(gen)==2){
        win++;
    }
}
return win;
}




int main()
{

    func(5);
    long win = gen(100000);
    std::cout << win << std::endl;
}