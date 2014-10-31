#!/bin/bash

read n

sum=0
for (( c=1; c<=$n; c++ ))
do
  read r
  sum=`expr $sum + $r`
done

num=$(echo "$sum / $n" | bc -l)

echo $num | awk '{printf("%.3f",$1)}'

exit $?
