#include <stdio.h>

int main(void){
    int a, b, t;
    printf("Upisite 2 cijela broja >");
    scanf("%d %d", &a, &b);
    t = a % 10;
    a = b % 10;
    b = t;
    printf("a = %d\nb = %d", a, b);
    return 0;    
}