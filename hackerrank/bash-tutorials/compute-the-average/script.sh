#!/bin/bash

read n

soma=0
for (( c=1; c<=$n; c++ ))
do
  read r
  soma=`expr $soma + $r`
done

#num=`expr $soma * 1000 / $n`
num=$(echo "$soma * 1000 / $n" | bc)

echo `printf %.3f $num`

echo $num