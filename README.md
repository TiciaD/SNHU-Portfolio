# SNHU Portfolio
This repo will contain various projects I've worked on throughout my journey through the Computer Science program at Southern New Hampshire University. Some of the courses include Programming Languages, Software Development Lifecycle, Data Structures and Algorithms, etc. Hopefully this will provide insight into my thought process as well as show my progression over time.

## Software Management Projects
### Software Development Lifecycle (SDLC) Sprint Retrospective
#### Project Overview/Analysis
This section contains a deliverable that pulls together the agile and Scrum practices that I've applied throughout the Software Development Lifecycle course. I take on the role of the Scrum Master and create a Sprint Review and Retrospective to summarize, analyze, and draw conclusions on the work completed during the course of the development lifecycle.

In this course I have learned why user stories are a great way to express user needs. It can be hard to interpret user needs and that's why there are portions of the SDLC dedicated to Planning and Designing the project before a line of code is even written. You must understand the perspective of the end-user before you can develop a product geared towards that user. To interpret these needs I could look at products that are similar to the one I'm developing and see what users like/dislike about those, as well as survey users on what they would look for in a product I'm developing. Based off of those responses I could translate those user needs into multiple user stories that take that need and define solutions I can incrementally complete.

I like to plan my programs before I begin developing and usually I would provide myself with a task list breaking down things that needed to get done. Now that I understand SDLC from this course, I realize I was pretty close to following a Waterfall methodology and in the future I would like to incorporate more agile methodologies into my project planning. Instead of trying to strictly plan out every requirement for the project, I could split that up into sprints so the work is more manageable and I can start development quicker. Then I can iterate upon what I've already built instead of trying to just work with what I had even if some of my scope or requirements have changed.

The importance of being a good team member cannot be understated especially in an agile project where communication is a must. Being a good team member means being adaptable and open minded, as well as being forthcoming with any creative ideas including the vulnerabilities of them. And of course, every good team is built or broken on communication, if it's too difficult to communicate ideas with others then that can lead to a lot of issues for a fast-paced rapidly changing process.


## C++ Projects
### Grocery Tracker
#### Project Overview/Analysis
This section contains an item-tracking program for made with C++ and Python. The program analyzes text records that contain a list of items purchased from the time a store opens to the time it closes and given that information, it can provide data about how often items are purchased.  

I think in this project I did a decent job of trying to abstract some of the common logic from my C++ file into generic classes I can utilize in multiple areas and even in projects outside of this one. I think perhaps in the future I could even take that a step further and utilize the classes in my Python code as well. I think the hardest part of the project, or at least the most time consuming when it came to debugging, was trying to make sure my input validation was looping correctly and covering most edge cases. Since most projects require input validation, I'm glad I spent a lot of time on it so I could learn a lot of the basic approaches and even made generic classes that I can reuse so I don't reinvent the wheel everytime.  

Luckily I made sure to add lots of comments, maybe even too many at some points, explaining my functions so I can come back later and easily understand what my thought process was without having to walk through every line to figure out what's going on. And of course like I've said before, I think the use of generic classes will help make this code maintainable in the future since a lot of it can be refactored independently from the rest of the program.

## Software Design Projects
### DriverPass Business Requirements and System Design Documents
#### Project Overview/Analysis
This section contains a business requirements document and a system design document for the client, DriverPass. The client wanted the system to be a web-based application, with offline capabilities, to provide students with access to where they could take online practice tests and book on-the-road training to prepare for their driving exams.

I believe I did well with gathering the requirements for the system, since an interview was already conducted with DriverPass, it helped to have the transcript from that meeting to lead the requirements gathering. With that as a reference, it was easier to determine what the client desired out of the system and how we could possibly implement that. If I had to pick a section I'd like to revisit most then I'd like to revise my UML Class Diagram and UML Use Case Diagram. I don't feel like I addressed every potential use case, which I understand that particular diagram isn't meant to be super comprehensive but I still wanted to address all of the business requirements and I feel like I left out some like the disable package use case. I also feel like the Class Diagram is pretty sparse and it was optional in the assignment to add the methods so I didn't but I feel like if I did include methods it would've been more clear how each class would potentially function.

As mentioned before, it was incredibly helpful having the interview transcript to reference when trying to determine what the user needs would be and then figuring out solutions to address them. I wanted to be sure in every UML diagram I created in the System Design document that every use case explicitly mentioned from the interview was addressed. For instance, when mentioned in the interview that he wanted a Forgot password process for the user and IT Admin to interact with, I made sure this was addressed in the UML use case diagram with the appropriate actors and interactions. It's important to take the user's needs into account when designing a system because at the end of the day they'll be the ones actually using the application. The company is reliant on the user to interact with their application so they can increase business and if we don't consider what would make for a good user experience to encourage the users to use that application, the we could cost the company potentially a lot of business, the exact opposite of our main goal.

When it comes to designing a system, I think communication with the client is key. If that solid foundation isn't there, then a lot of business requirements can be assumed or misinterpreted. So I would still utilize a strategy of conducting interviews with the client to ascertain what the goals of the system are and what they're expecting to gain from utilizing this system. Then more thorough infrastructure planning can be made, like the UML diagrams as well as scheduling with something like a Gantt Chart to keep the project on an appropriate timeline. Obviously it's a big undertaking to design a system from scratch so I believe staying organized and understanding what the main goals are will go a long way in helping that vision come to life.

### Draw It or Lose It Software Design Document
#### Project Overview/Analysis
This section contains a software design document and a prototype of the game application showcasing how the client can offer their game, the client being *The Gaming Room*. They want to develop a web-based game that serves multiple platforms based on their current game, Draw It or Lose It, which is currently available in an Android app only. The staff at The Gaming Room does not know how to set up the environment so I must step in to facilitate the development of the web-based version of the gaming app by preparing a software design document and beginning development on the game application, addressing their software requirements.

I think I did well summarizing the objective of the design and what design constraints would need to be taken into consideration. This was helpful for me in understanding why we were utilizing the design patterns we did and how each pattern affected the overall architecture of the application. If I had a little more time and a little more experience I would definitely like to revisit the Evaluation section for the Development Requirements. I feel like it was hard for me to ascertain what each platform's strengths and weaknesses were because there are a lot of opinionated articles about each operating system. So maybe with more experience, I could see for myself how each OS works and form my own opinion or with more time I could find more neutral scholarly articles/documents that reviewed the different operating systems with less bias.

The most important thing I had to consider when developing the document was the user's needs. I made sure to mention this when overviewing the design constraints as well as in the recommendations section so that anyone overlooking the document would know how the end-user influenced certain decisions. For instance, users will likely be connected to each other over the internet since this will be a multiplayer game, with that in mind, there are security and network concerns that need to be accounted for early on before it becomes a problem when the application is launched. At the end of the day, when the application is built the end-user's opinion will be the most important and if we don't consider them while we design the application then we could potentially make something that noone wants to use or is too difficult for them to use.

If I had to design a similar application, I would definitely build off of some of the things I've learned from this one but also as mentioned earlier, make sure I had more time to go more in depth with my research on different operating platforms. I would also probably try to have conversations with the management, development and, design team along the way to make sure my recommendations are in line with what they feel they can accomplish.
