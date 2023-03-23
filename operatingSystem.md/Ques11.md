A process goes through different states in its entire lifecycle. A process goes through the following states:

Start: This is the initial state. A process is in this state on its creation.
Ready: The process is assigned 'Ready' state when it is ready to be processed. The process is moved from the 'Start' state to the 'Ready' state after it is moved into memory. The process can be moved here from the 'Running' state as well if some other process is moved to the 'Running' state.
Running: The process is moved to the 'Running' state when it is assigned to a processor and its processing starts. At a single point in time, a single process will be in the 'Running' state on a single processor.
Waiting: The process is moved to the 'Waiting' state if the process is waiting for any resource.
Terminated: The process is moved to the 'Terminated' state once its execution is completed or it is terminated by the OS.
