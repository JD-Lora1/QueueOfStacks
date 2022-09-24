## Juan Diego Lora - A00369885

## Operation of JuandiQueue
Proyect use my Stack (*JuandiStack*), implemented as a Linked-List (a Node '_head_' which has a link to nexts Nodes)
Each node has a link to his next

Methods _dequeue()_, _front()_, and _isEmpty()_ from the JuandiQueue class
work as _pop()_, _peek()_, and _isEmpty()_ from the JuandiStack class.

For the method _enqueue()_ an extra JuandiStack (*tempStack*) is used, a temporary one,
that saves the data of the *main* JuandiStack, while the main one is being emptied.<br>
When the main JuandiStack is empty, it does _push()_ to add the new element to the main one.
Finally it does _push()_ for each element on the tempStack