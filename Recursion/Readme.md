what is Stack overflow?

A stack overflow condition during recursion occurs when a program makes too many nested function calls,
causing the call stack to exceed its fixed memory allocation.

How a Stack Overflow is Reached During Recursion?

When a function is called, the operating system allocates a block of memory called a stack frame (or activation record) on the call stack. This frame stores essential information for that specific execution, including:-

1)Function arguments and local variables.
2)The return address (where the CPU should go once the function finishes).
3)CPU register states

In a normal loop, variables are updated in place, reusing memory. However, in recursion, the parent function cannot finish until the child function completes. This means the parent's stack frame must remain in memory while a new stack frame is pushed on top of it for the child function.

If a recursive function continues to call itself without stopping, stack frames accumulate like a tower. Eventually, the stack pointer moves outside the memory block allocated for it, triggering a segmentation fault or runtime error, which crashes the program.

The Two Main Triggers:

1.Missing or Broken Base Case: If a recursive function lacks a condition to stop (base case), or if the recursive step fails to move toward that base case, it creates an infinite loop of execution

2.Excessive Recursion Depth: Even if a base case exists, a stack overflow can occur if the problem size is too large (e.g., trying to recursively process a list with 1 million elements when the stack can only hold 50,000 frames).