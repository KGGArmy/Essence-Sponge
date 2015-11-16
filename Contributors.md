Contributing to Essence Sponge
==============================

## Code Style

* Line endings
    * Use Unix line endings when committing (\n)
    * Windows users of Git can do `git config --global core.autocrlf true` to let Git convert them automatically
    
* Column width
    * 80 for Javadocs
    * 150 for code
    * Feel free to wrap when it will help with readability
    
* Indentation
    * Use 4 spaces for indentations, do not use 2 spaces
    
* Vertical whitespace
    * Place a blank line before the first member of a class, interface, enum, etc. (i.e. after class Example {) as well 
    as after the last member

* File headers
    * File headers must contain the license headers for the project. Use the licenseFormat Gradle task to add them 
    automatically.
    
* Imports
    * Imports must be grouped in the following order, where each group is separated by an empty line
        * Static imports
        * All other imports
        * java imports
        * javax imports

* Javadocs
    * Do not use @author
    * Wrap additional paragraphs in `<p>` and `</p>`
    * Capitalize the first letter in the descriptions within each “at clause”, i.e. @param name Player to affect, no periods
    
## Code Conventions

* Use Optionals instead of returning null in the API
* Method parameters accepting null must be annotated with @Nullable (from javax.*), all methods and parameters are @Nonnull by default.
* Use Google Preconditions for null- and argument checking.