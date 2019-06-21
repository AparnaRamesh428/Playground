#include<stdio.h>
int main()
{
 int q,r,d,di;
  di=4;
  d=365;
  q=d/di;
  r=d%di;
  printf("Quotient: %d",q);
  printf("\nRemainder: %d",r);
  return 0;
}