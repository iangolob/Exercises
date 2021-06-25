#include <stdio.h>

int main(void){
    int z1, z2, z3, z4;
    printf("Upisite 4 cijela broja (po jednu znamenku) >");
    scanf("%d %d %d %d", &z1, &z2, &z3, &z4);
    printf("m=%d",z1*1000+z2*100+z3*10+z4);
    return 0;

}