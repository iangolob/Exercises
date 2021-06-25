#include <stdio.h>

int getBit(unsigned int x, int y) { return x >> y & 0x1; }

int main(void) {
   unsigned int n;
   scanf("%u", &n);
   for (int i = 31; i >= 0; i--) {
      printf("%d", getBit(n, i));
   }
}