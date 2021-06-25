#include <stdio.h>

int main(void) {
   unsigned int n;
   scanf("%du", &n);
   for (int i = 31; i >= 0; i--) {
      printf("%d", (n >> i) & 0x1);
   }
   return 0;
}