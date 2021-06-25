#include <stdio.h>

int main(void) {
   int d, m, g;
   printf("Upisite dan, mjesec i godinu > ");
   scanf("%d %d %d", &d, &m, &g);
   printf("%d. ", d);
   if (m == 1)
      printf("sijecnja");
   else if (m == 2)
      printf("veljace");
   else if (m == 3)
      printf("ozujka");
   else if (m == 4)
      printf("travnja");
   else if (m == 5)
      printf("svibnja");
   else if (m == 6)
      printf("lipnja");
   else if (m == 7)
      printf("srpnja");
   else if (m == 8)
      printf("kolovoza");
   else if (m == 9)
      printf("rujna");
   else if (m == 10)
      printf("listopada");
   else if (m == 11)
      printf("studenog");
   else if (m == 12)
      printf("prosinca");
   printf(" %d.\n", g);

   printf("%d. ", d);
   switch (m) {
   case 1:
      printf("sijecnja");
      break;
   case 2:
      printf("veljace");
      break;
   case 3:
      printf("ozujka");
      break;
   case 4:
      printf("travnja");
      break;
   case 5:
      printf("svibnja");
      break;
   case 6:
      printf("lipnja");
      break;
   case 7:
      printf("srpnja");
      break;
   case 8:
      printf("kolovoza");
      break;
   case 9:
      printf("rujna");
      break;
   case 10:
      printf("listopada");
      break;
   case 11:
      printf("studenog");
      break;
   case 12:
      printf("prosinca");
      break;
   }
   printf(" %d.\n", g);
   return 0;
}