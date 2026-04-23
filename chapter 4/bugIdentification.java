

if (age >= 65); t/*he semicolon is the bug*/
 System.out.println("Age is greater than or equal to 65");
else
 System.out.println("Age is less than 65)";

Fix:

if (age >= 65)
    System.out.println("Age is greater than or equal to 65");
else
    System.out.println("Age is less than 65");


int x == 1, total == 0;/*the increament for the loop and total*/
while (x <= 10) {
 total ++x;
 System.out.println(x);
}

Fix:

int x = 1, total = 0;
while (x <= 10) {
    total += x;
    System.out.println(x);
    x++;
}


while (x <= 100)/*increament and curly bracket*/
 total += x;
 ++x;

Fix:

while (x <= 100) {
    total += x;
    x++;
}


while (y =! 0) /*no opening brace*/
{
 System.out.println(y);

Fix:

while (y != 0) {
    System.out.println(y);
}
