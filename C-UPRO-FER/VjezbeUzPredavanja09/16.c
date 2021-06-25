#include <stdio.h>

int main(void) {
   unsigned int n;
   printf("Upisite heksadekadski nenegativni cijeli broj > ");
   scanf("%x", &n);
   while (n != 0) {
      printf("%11u\n", n);
      printf("Upisite heksadekadski nenegativni cijeli broj > ");
      scanf("%x", &n);
   }
   return 0;
}