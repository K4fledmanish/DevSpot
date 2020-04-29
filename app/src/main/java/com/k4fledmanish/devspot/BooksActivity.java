package com.k4fledmanish.devspot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BooksActivity extends AppCompatActivity {

    List<Book> lstBook ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);


        lstBook = new ArrayList<>();


        lstBook.add(new Book("97 things for Programmers","Programmers","PROGRAMMERS HAVE A LOT ON THEiR MiNDS. Programming languages, programming techniques, development environments, coding style, tools, development process, deadlines, meetings, software architecture, design pat- terns, team dynamics, code, requirements, bugs, code quality. And more. A lot.\n" +
                "There is an art, craft, and science to programming that extends far beyond the program. The act of programming marries the discrete world of comput- ers with the fluid world of human affairs. Programmers mediate between the negotiated and uncertain truths of business and the crisp, uncompromising domain of bits and bytes and higher constructed types.\n" +
                "With so much to know, so much to do, and so many ways of doing so, no single person or single source can lay claim to “the one true way.” Instead, 97 Things Every Programmer Should Know draws on the wisdom of crowds and the voices of experience to offer not so much a coordinated big picture as a crowdsourced mosaic of what every programmer should know. This ranges from code-focused advice to culture, from algorithm usage to agile thinking, from implementation know-how to professionalism, from style to substance.\n" +
                "The contributions do not dovetail like modular parts, and there is no intent that they should—if anything, the opposite is true. The value of each contribu- tion comes from its distinctiveness. The value of the collection lies in how the contributions complement, confirm, and even contradict one another. There is no overarching narrative: it is for you to respond to, reflect on, and connect together what you read, weighing it against your own context, knowledge, and experience.",R.drawable.book1));



        lstBook.add(new Book("Java for Dummies","Java","Well, if you want to write computer programs, this book is for you. This book avoids the snobby “of-course-you-already-know” assumptions, and describes computer programming from scratch.\n" +
                "The book uses Java — an exciting, relatively new computer programming lan- guage. But Java’s subtleties and eccentricities aren’t the book’s main focus. Instead, this book emphasizes a process — the process of creating instructions for a computer to follow. Many highfalutin’ books describe the mechanics of this process — the rules, the conventions, and the formalisms. But those other books aren’t written for real people. Those books don’t take you from where you are to where you want to be.\n" +
                "In this book, I assume very little about your experience with computers. As you read each section, you get to see inside my head. You see the problems that I face, the things that I think, and the solutions that I find. Some problems are the kind that I remember facing when I was a novice; other problems are the kind that I face as an expert. I help you understand, I help you visualize, and I help you create solutions on your own. I even get to tell a few funny stories.\n",R.drawable.book2));


        lstBook.add(new Book("Being Geek","Programming","For each new job I’ve considered, I can remember the moment I decided to make the leap. The consideration that went into each of these decisions was epic. There were Pro and Con lists, there were spreadsheets that did financial modeling, and there were endless conversations with trusted people that started with support and, weeks later, finished with, “Enough talking. When are you going to decide?”\n" +
                "This first section of Being Geek walks you through the endless list of decisions and tasks you can perform as you consider and engage in the search for your next gig. From early warning signs in the current gig to figuring out how to constructively stalk your future employer, these chapters document the various plays you can make as you consider the next move in your career.\n" +
                "These chapters leave the hardest part to you—making the decision.",R.drawable.book3));



        lstBook.add(new Book("Building the Perfect PC","Hardware","Building PCs isn’t just for techies anymore.\n" +
                "It used to be, certainly. Only gamers and other geeks actually built their PCs from the ground up. Everyone else just called Dell or Gateway and ordered a system. That started to change around the turn of the century. The first sign was when general merchandisers like Best Buy started stocking upgrade com- ponents. If you wanted to expand the memory in your PC or install a larger hard drive or add a CD writer, you could now get the components you needed at the local big-box store.\n" +
                "A year or two later, things changed again. Big-box retailers started carrying PC components like cases and motherboards—parts seldom needed by upgrad- ers, but necessary to build a new PC from scratch. Nowadays, although Best Buy and other local retailers may not carry as broad a range of PC components as some online specialty retailers, you can get everything you need for a new PC with one visit to a big-box store.\n" +
                "And you can bet that big-box stores don’t allocate shelf space to products that aren’t selling. Building your own PC has become mainstream. Nowadays, even regular nontechnical people build their own systems and have fun doing it. In- stead of settling for a mediocre, cookie-cutter system from Dell or HP, they get",R.drawable.book4));




        lstBook.add(new Book("Linux for Everyone","Operating System","Linux is truly amazing when you consider how it originated and how it continues to evolve. From its modest beginning as the hobby of one person — Linus Torvalds of Finland — Linux has grown into a full-fledged operating system with features that rival those of any commercial UNIX operating system. To top it off, Linux — with all of its source code — is available free to anyone. All you have to do is download it from an Internet site or get it on CDs or a DVD for a nominal fee from one of many Linux CD vendors.\n" +
                "Linux certainly is an exception to the rule that “you get what you pay for.” Even though Linux is free, it is no slouch when it comes to performance, features, and reliability. The robustness of Linux has to do with the way\n" +
                "it is developed and updated. Developers around the world collaborate to add features. Incremental versions are continually downloaded by users and tested in a variety of system configurations. Linux revisions go through much more rigorous beta testing than any commercial software does.\n" +
                "Since the release of Linux kernel 1.0 on March 14, 1994, the number of Linux users around the world has grown exponentially. Many Linux distributions — combinations of the operating system with applications and installation tools — have been developed to simplify installation and use. Some Linux distributions are commercially sold and supported, while many continue to be freely available.\n" +
                "Linux, unlike many freely available software programs, comes with exten- sive online information on topics such as installing and configuring the operating system for a wide variety of PCs and peripherals. A small group\n" +
                "of hard-core Linux users are expert enough to productively use Linux with the online documentation alone. A much larger number of users, however, move to Linux with some specific purpose in mind (such as setting up a Web server or learning Linux). Also, a large number of Linux users use their systems at home. For these new users, the online documentation is not easy to use and typically does not cover the specific uses of Linux that the user may have in mind.\n",R.drawable.book5));




        lstBook.add(new Book("Linux The Complete Guide","Operating System","The Linux operating system has become one of the major operating systems in use today, bringing to the PC all the power and flexibility of a Unix workstation as well as a complete set of Internet applications and a fully functional desktop interface. This book is designed not only to be a complete reference on Linux, but also to provide clear and detailed explanations of Linux features. No prior knowledge of Unix is assumed; Linux is an operating system anyone can use.\n" +
                "With the large number of Linux distributions available, it is easy to lose sight of the fact that most of their operations are the same. They all use the same desktops, shell, file systems, servers, administration support, and network configurations. Many distributions provide their own GUI tools, but these are just front ends to the same underlying Linux commands. This book is distribution independent, providing a concise and detailed explanation of those tasks common to all Linux systems. As much as 95 percent of a Linux system involves operations that are the same for all distributions. You can use this book no matter what particular Linux distribution you are using.\n" +
                "Linux distributions include features that have become standard, like the desktops; Unix compatibility; network servers; and numerous software applications such as office, multimedia, and Internet applications. GNOME and the K Desktop Environment (KDE) have become standard desktop Graphical User Interfaces (GUI) for Linux, noted for their power, flexibility, and ease of use. Both have become integrated components of Linux, with applications and tools for every kind of task and operation.\n" +
                "Linux is also a fully functional Unix operating system. It has all the standard features of a powerful Unix system, including a complete set of Unix shells such as BASH, TCSH, and the Z shell. Those familiar with the Unix interface can use any of these shells, with the same Unix commands, filters, and configuration features.\n" +
                "A wide array of applications operate on Linux. Numerous desktop applications are continually released on the distribution repositories. The GNU General Public License (GPL) software provides professional-level applications such as programming development tools, editors, and word processors, as well as numerous specialized applications such as those for graphics and sound.\n",R.drawable.book6));




        lstBook.add(new Book("Java (7 Edition)","Java","The most important characteristic of Java is that it was designed from the outset to be machine independent. You can run Java programs unchanged on any machine and operating system combination that supports Java. Of course, there is still the slim possibility of the odd glitch, as you are ultimately dependent on the implementation of Java on any particular machine, but Java programs are intrinsically more portable than programs written in other languages. An application written in Java only requires a single set of source\n" +
                "code statements, regardless of the number of different computer platforms on which it is run. In any other programming language, the application frequently requires the source code to be tailored to accommodate different computer environments, particularly if an extensive graphical user interface is involved. Java offers substantial savings in time and resources in developing, supporting, and maintaining major applications on several different hardware platforms and operating systems.\n" +
                "Possibly the next most important characteristic of Java is that it is object-oriented. The object-oriented approach to programming is an implicit feature of all Java programs, so you find out what this means later in this chapter. Object-oriented programs are easier to understand and less time-consuming to maintain and extend than programs that have been written without the benefit of using objects.\n" +
                "Not only is Java object-oriented, but it also manages to avoid many of the difficulties and complications that are inherent in some object-oriented languages, making it easy to learn and very straightforward to use. By and large, it lacks the traps and \"gotchas\" that arise in some other programming languages. This makes the learning cycle shorter, and you need less real-world coding experience to gain competence and confidence. It also makes Java code easier to test.\n" +
                "Java has a built-in ability to support national character sets. You can write Java programs as easily for use in Greece or Japan as you can for English-speaking countries, assuming you are familiar with the national languages involved, of course. You can even build programs from the outset to support several different national languages with automatic adaptation to the environment in which the code executes.\n",R.drawable.book7));




        lstBook.add(new Book("Maria Semples","Categorie Book","Description book",R.drawable.mariasemples));




        lstBook.add(new Book("The Martian","Categorie Book","Description book",R.drawable.themartian));




        lstBook.add(new Book("He Died with...","Categorie Book","Description book",R.drawable.hediedwith));
        lstBook.add(new Book("The Vegitarian","Categorie Book","Description book",R.drawable.thevigitarian));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapterForBooks myAdapter = new RecyclerViewAdapterForBooks(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);



    }
}
