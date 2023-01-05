JVM : what it does it it read the java bytecode and execute it , like a virtual cpu that runs its bytecode

it is platform independet, it is an emulated computer that takes compiled bytecode, disassembles it, and reassembles it specific to the type of JVM it is

pc based jvm : bytecode -> reassemble to x86 executable code
ARM based jvm: bytecode -> ARM executable code


JRE : it is the thing required to run. it is a set of programs and libraries used to run java code .it contains JVM, and some other supporting stuff java standard libraries. it can't actually run any bytecode without JVM, as JVM is the thing that actuall turns the java byte code instructions into assembly for target processor. JRE exists to facilitare running the JVM, so JVM is included with JRE

JDK: contains tools to create programs i.e compile java code


________JRE
|
JDK
|_______JVM

# primitive and referencce data types


# packages and import keyword