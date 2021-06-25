#include <stdio.h>

int main(void) {
   unsigned int n;
   scanf("%du", &n);
   for (int i = 10; i >= 0; i--) {
      printf("%d", (n >> i * 3) & 0x7);
   }
   return 0;
}