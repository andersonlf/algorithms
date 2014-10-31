#!/bin/bash

read expression

result=`echo "$expression" | bc -l`

echo $result | awk '{printf("%.3f",$1)}'

exit $?