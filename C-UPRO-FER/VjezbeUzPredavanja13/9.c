#include <stdio.h>

int getBit(unsigned int x, int y) { return x >> y & 0x1; }

int main(void) {
   unsigned int n;
   int poz;
   scanf("%u", &n);
   scanf("%d", &poz);
   printf("%d", getBit(n, poz));
}