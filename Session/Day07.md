# Recap

- Exception Handling
    - Errors
    - Exceptions
        - Checked Exception
        - Unchecked Exception
- Compile Time Error
- Run Time Error
- Threads
- What are Processes
- Concurrency
- Parallelism
- Synchronization
- Thread Safe
- Stack and Heap
- Runnanble Interface
- Thread class
- finally

# Demos


- ProducerConsumer (Ends at 1:46)
    - Sync Block
- ProducerConsumerThreadSafe
    - Sync is in the Class itself
    - This Class will be thread safe
- Blocking Queue
- Locks
- Atomic Integer
- Executor Framework
- Semaphore

# ThreadSafe

If a class or method is ThreadSafe, that means it will have a well defined behaviour inside threads.

The developers of threadsafe classes have used synchronization in their code. So, if you use them inside threads, they will not cause ConcurrentModificationException. You can skip synchronization for them inside a thread.

# Ways for synchronization
- Sync
    - topics
        - synchronized method
        - sync block
        - threadsafe classes
    - benefits
        - this is too much optimized
    - drawbacks
        - it increases development complexity
        - Only Applicable for threads
        - is a java thing
- locks
    - OS concept
    - Java is giving you a wrapper around
    - benefits
        - this is optimized
        - reduces mental load on a developer
        - share locks between processes
- Semaphores
    - OS concept
    - Java is giving you a wrapper around it
    - Also work with processes


# Semaphores

- When you create a semaphore than you mention how many threads can pass the semaphore
- You specify the maximum number of threads that can run

# CountdownLatch & CyclicBarrier 

- You specify the minimum number of threads.
semaphores.acquire

# AtomicInteger

- An Atomic Operation is an operation during which a processor will not switch a thread

- Except long and double all binary operations related to primitive data types are atomic

- AtomicInteger gives you methods that are treated as a single atomic operation which on normal int data type might consist of multiple atomic operations.

# Good resources

- https://www.baeldung.com/java-thread-safety
- https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html

# Task

- Read all the code in the JavaDemoWorkspace
- Try to make new SynchronizedList() work