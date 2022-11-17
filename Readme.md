3. BadPotTwo

Since there is a sleep time when filling pot or get serving, there could be multiple processes entering validating the same if and entering in sleep mode.
With the Thread.sleep(200) we have more collisions and is easily see the error.



# Homework

1. Compare the approaches between Banket and BanketNoWait, which one is better (if any)? Argue your answer.
In the Banket, we make all the process sleep when they are waiting for the cook to refill the banket. On the other hand, BanketNoWait, as the name mentions it, the savages does not need to wait to fill the banket and they can, in this example, go for a walk instead of waiting.
//TODO: Ja esta, no?

2.  
