##Intent
There are certain entities that follow/perform similar steps of algorithm/action which are always in the same order
with individual implementation.The template method pattern allows us to define steps of the algorithm in a parent 
class and force each subclass to provide its own concrete implementation.


##Problem 
A real-world analogy if you go to a hospital for an eye check-up, the steps to get a check-up done are.

####You first enter the hospital's main reception, there are a few steps receptionist performs.
1. Extract patient existing medical reports if an old patient, else create a new report
2. Validate the patient report against their identity.
3. Apply some stamps.
4. Give you the folder with detail and requests to go to the ENT department reception

####You then enter the hospital's ENT reception. ENT receptionist will also perform few steps.
1. Extract patient information. Now this information will also contain some data from previous reception like payment receipt appointment date e.t.c.
2. validate the information.
3. scan your info & send to doctor room.
4. attach all info to your report.

####Same goes for doctor 
1. extract info
2. validate info
3. do check-up
4. add information to your checkup report.

## Enterprise use case
Commands invocation post order creation.

The system runs multiple commands post order confirmation. All commands contain a similar execution workflow.
1.  validate data
2.  create target system/entity request
3.  communicate with target system/entity
4.  update the status




## Credits
https://refactoring.guru/design-patterns