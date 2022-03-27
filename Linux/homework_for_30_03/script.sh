#!/bin/bash
echo -n "Привет студент! "
read name
echo "Терминал рад тебя $name, добро пожаловать в систему!"
mkdir -p /tmp/test/
date +"%H_%M_%S" > /tmp/test/mydate.txt
for run in {1..10}
do
echo $run
sleep 0.5
done
echo "Данные сохранены, продолжаю работу"
df -h >> /tmp/test/mydate.txt
mkdir -p /opt/mydate/
cp /tmp/test/mydate.txt /opt/mydate/newmydate.txt
for timer in {5..1}
do
echo $timer
sleep 1
done
echo "Все сделано, Босс"
