### The Goal

Your objective is to write a program capable of predicting the route Indy will take on his way down a tunnel. Indy is not in danger of getting trapped in this first mission.

### Rules

The tunnel consists of a patchwork of square rooms of different types.The rooms can be accessed and activated by computer using an ancient RS232 serial port (because Mayans aren't very technologically advanced, as is to be expected...).

There is a total of 14 room types (6 base shapes extended to 14 through rotations).

Upon entering a room, depending on the type of the room and Indy's entrance point (**TOP**,**LEFT**, or **RIGHT**) he will either exit the room through a specific exit point, suffer a lethal collision or lose momentum and get stuck:

| Room        | Description  |
| :-------------: |:------------------|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_00.png "Type 0")|Type 0. This room type is not part of the tunnel per se as Indy cannot move across it.|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_01.png "Type 1")|Type 1. The green arrows indicate Indy's possible paths through the room.|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_02.png  "Type 2")  ![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_03.png "Type 3")|Type 2, 3. The room of type 3 is similar to the room of type 2 but rotated.|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_04.png  "Type 4")  ![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_05.png "Type 5")|Type 4 and 5. A red arrow indicate a path that Indy cannot use to move across the room.|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_06.png "Type 6")|Type 6|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_07.png "Type 7")|Type 7|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_08.png "Type 8")|Type 8|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_09.png "Type 9")|Type 9|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_10.png "Type 10")|Type 10|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_11.png "Type 11")|Type 11|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_12.png "Type 12")|Type 12|
|![alt text](https://cdn-games.codingame.com/the-last-crusade/indiana1/type_13.png "Type 13")|Type 13|

Indy is perpetually drawn downwards: he cannot leave a room through the top.

At the start of the game, you are given the map of the tunnel in the form of a rectangular grid of rooms. Each room is represented by its type.

For this first mission, you will familiarize yourself with the tunnel system, the rooms have all been arranged in such a way that Indy will have a safe continuous route between his starting point (top of the temple) and the exit area (bottom of the temple).

### Each game turn:

* You receive Indy's current position

* Then you specify what Indy's position will be next turn.

* Indy will then move from the current room to the next according to the shape of the current room.

