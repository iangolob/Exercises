#include <stdio.h>

int main(void) {
   unsigned int n;
   scanf("%du", &n);
   for (int i = 7; i >= 0; i--) {
      printf("%0X", (n >> i * 4) & 0xF);
   }
   return 0;
}