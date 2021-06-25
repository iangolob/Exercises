#include <stdio.h>

int main(void) {
   float h;
   scanf("%f", &h);
   if (h < 12)
      printf("troposfera");
   else if (h < 50)
      printf("stratosfera");
   else if (h < 80)
      printf("mezosfera");
   else if (h < 700)
      printf("termosfera");
   return 0;
}