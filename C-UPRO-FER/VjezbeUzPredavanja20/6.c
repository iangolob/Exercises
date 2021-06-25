#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define RED 10

void inicijalizirajPolje(char *p, int n) {
   for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
         *(p + i * n + j) = '.';
      }
   }
}

void ispisiPolje(char *p, int n) {
   for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
         printf("%2c", *(p + i * n + j));
      }
      printf("\n");
   }
}

void crtajPutanju(char *p, int n, char c) {
   int pozr = 0, pozs = 0;
   while (pozr < n && pozs < n) {
      *(p + pozr * n + pozs) = c;
      if (rand() % 2 == 0) {
         pozr++;
      } else {
         pozs++;
      }
   }
   return;
}

int main(void) {
   srand((unsigned int)time(NULL));
   char polje[RED][RED];

   inicijalizirajPolje(&polje[0][0], RED);

   crtajPutanju(&polje[0][0], RED, 'o');
   ispisiPolje(&polje[0][0], RED);
   printf("\n");
   crtajPutanju(&polje[0][0], RED, 'x');
   ispisiPolje(&polje[0][0], RED);
   printf("\n");
   return 0;
}