0. ABOUT GAMS

The Group Autonomy for Mobile Systems (GAMS) project at Carnegie Mellon University
is intended to provide a distributed operating environment for control of one or
more unmanned autonomous systems (UAS). The repository is composed of C++, Java,
MADARA, and some LUA bindings that enable a single person to control and understand
information from a swarm of agents, robots, or UAS.

GAMS is an extension of an earlier project called SMASH.

**************************************
1. HOW TO INSTALL

See the instructions at https://github.com/jredmondson/gams/wiki/GAMS-Installation
for a list of methods for installing GAMS and its prerequisites. For Linux users,
we have scripts in $GAMS_ROOT/scripts/linux that are useful for not only building
but also getting the latest version of repositories. See the base_build.sh script
in the linux directory for more information (pass help to it).

For Windows users, you will need to download the repositories for ACE, MADARA and
GAMS along with whatever options you are wanting to compile in. Then, you can use
the helpful base_build.bat script in %GAMS_ROOT%\scripts\windows to build GAMS
and prerequisites. Pass help from command line to see options.

For the base_build scripts on Linux or Windows, you will need to at LEAST pass
in "ace madara gams" in on a first build, at the least. After that, you can pick
and choose what you want to update. Tests, vrep, and other options will need
to be added by most users. There is a build_c++ script that wraps common options
for most users.

***************************************
2. GENERATING GAMS PROJECTS

We have a script called gpc.pl in $GAMS_ROOT/scripts/projects that is very useful
for generating almost any kind of GAMS or MADARA project. See -h for usage
information. The most common GAMS Project Configurator (GPC) usage is the
--new-algorithm option and the many options for configuring a VREP simulation.
Again, see the help information for specifics.

***************************************
3. COMPILING GAMS PROJECTS

After you've generated a project with the GPC, you should see two scripts in
your project directory (action.bat|sh). The .bat file is used by Visual Studio
users to compile GAMS projects. The .sh file is used by Linux g++ users to
compile GAMS projects. Pass "help" to the script for usage information.

***************************************

4. GETTING HELP

  1. Please see our helpful Wiki which include guides at:
     https://github.com/jredmondson/gams/wiki

  2. Please see our full c++ doxygen documentation at:
     http://jredmondson.github.io/gams/docs/cpp/

     Java docs are available here:
     http://jredmondson.github.io/gams/docs/java/

  3. Issues can be posted to our Issue system (which hasn't gotten any usage):
     https://github.com/jredmondson/gams/issues

  4. If you are still having trouble, feel free to contact me directly at:
     jedmondson@gmail.com