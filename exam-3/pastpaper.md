# Past Paper Question

> An examination office of a university must securely store students' examination papers and their grades. The office keeps the documentation of past students for two years. After two years the office only stores the student grades. All documentation of current students is frequently accessed for other operations and the volume of the data increasaes quickly.
***
To better support its operations, the office is creating a new system to provide this storage
***
> **(a)** identify two aspects of data that need to be taken into account during the planning of the system.
The two aspects of data that need to be taken into account during the planning of the system are:

- The volume of the data increases quickly. The system will have to use a database that can scale for large amounts of data. For exmaple, a relational database that can scale vertically might not be the best choice. A NoSQL database that can scale horizontally might be a better choice. Vertical scaling can only be done by upgrading the hardware. Horizontal scaling doesn't affect performancee with larger amounts of data.
- Since the data has to be frequently accessed, a database that can handle high read/write operations is needed.

***
> **(b)** Describe how direct observations on the current system may provide information to help propose a suitable new system.

Observing the problems of the current system might help to propose a suitable new system. For example, if the current system is slow, then a new system that can handle high read/write operations might be a good choice. In addition, observing parts of the current system that the clients are currently using and are an integral part of the system might help to propose a suitable new system.
***
A prototype of the new system is created to present to the examination office.
***
> **(c)** Describe the purpose of this prototype.

the purpose of this prototype is to show the examination office how the new system will work. The prototype will show the examination office how the new system will be used and how it will solve the problems of the current system. This is essential because it provides both the team and the client with a better understanding of the new system without having it actually produced.
***
The examination office needs to upgrade the computing resources for their operations, and this will require data migration.
***
> **(d)** Discuss two possible problems that may occur during data migration.
The two problems that may occur during data migration are:

- Data loss: If the data is not backed up, then it may be lost during the migration. For example, a power outage a failed hard drive, or software bugs can leave the data corrupt or lost.
- Incompatibility: Some data types may not be compatible with the new system. For example, if the new system uses a different database, then the data may not be compatible with the new system.

***
> **(e)** outline one economic aspect that the examination office needs to take into account to support parallel running.

Running two different systems at the same time may be costly. There would be both hardware and software expenses. For example, the examination office would have to purchase new hardware and software for the new system. In addition, the examination office would have to pay for the maintenance of the old system at the same time.

***
