#include <stdio.h>

int main(void) {
   int n;
   scanf("%d", &n);
   if (n < 0)
      printf("neispravni bodovi");
   else if (n <= 9)
      printf("nedovoljan");
   else if (n <= 13)
      printf("dovoljan");
   else if (n <= 17)
      printf("dobar");
   else if (n <= 21)
      printf("vrlo dobar");
   else if (n <= 25)
      printf("izvrstan");
   else
      printf("neispravni bodovi");
   printf("\n");
   switch (n) {
   default:
      printf("neispravni bodovi");
      break;
   case 0 ... 9:
      printf("nedovoljan");
      break;
   case 10 ... 13:
      printf("dovoljan");
      break;
   case 14 ... 17:
      printf("dobar");
      break;
   case 18 ... 21:
      printf("vrlo dobar");
      break;
   case 22 ... 25:
      printf("izvrstan");
      break;
   }
   return 0;
}