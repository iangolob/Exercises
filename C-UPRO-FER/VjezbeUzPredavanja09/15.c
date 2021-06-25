#include <stdio.h>

int main(void) {
   int n;
   printf("Upisite dekadski cijeli broj > ");
   scanf("%d", &n);
   while (n != 0) {
      printf("%o\n%X\n", n, n);
      printf("Upisite dekadski cijeli broj > ");
      scanf("%d", &n);
   }
   return 0;
}