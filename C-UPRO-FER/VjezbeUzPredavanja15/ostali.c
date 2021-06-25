/*
2 23
11 22
5 21
*/

#include <stdio.h>

int main(void) {
   int polje[] = {2, 3, 5, 7, 11, 23, 29};
   int *p1 = &polje[0], *p2 = NULL;
   p2 = &polje[5];
   printf("%d %d\n", *p1, *p2);
   printf("%d %d\n", *(p2 - 1), *p2 - 1);
   printf("%d %d\n", p2 - p1, *p2 - *p1);

   return 0;
}

/*
11 47
31 14
4 20
*/

/*
#include <stdio.h>

int main(void) {
   int polje[4][3] = {{2, 11, 23}, {29, 31, 37}, {47, 51, 59}, {61, 67, 71}};
   int *p1 = NULL, *p2 = NULL, *p3 = NULL;
   p1 = &polje[0][1];
   p2 = p1 + 5;
   p3 = &polje[3][1];
   printf("%d %d\n", *p1, *p2);
   printf("%d %d\n", *(p1 + 3), *p1 + 3);
   printf("%d %d\n", p3 - p2, *p3 - *p2);
   return 0;
}
*/

/*
2 2 51 59
*/
/*#include <stdio.h>

int main(void) {
   int polje[2][3] = {{2, 11, 23}, {47, 51, 59}};
   int *p = &polje[0][1], i = 3;
   p += i;
   *(--p) = --i;
   printf("%d %d %d %d\n", *p, polje[1][0], polje[1][1], polje[1][2]);
   return 0;
}
*/