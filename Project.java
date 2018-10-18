public class Project{
    //sets Project's fields
    private String name;
    private String description;
   

    //Overload the constructor method depending on the info given during the instantiation of Project object
    public Project(){
    }
    public Project(String name){
        this.name=name;
    }
    public Project (String name, String description){
        this.name=name;
        this.description=description;
    }
   
    //a method starts with first small letter word and capital second letter world
    //prints the info of the Project object
    
    //sets Project's name, description and initialCost
    public void setName(String name){
        this.name=name;
    }
    public void setDescription(String description){
        this.description=description;
    }
   
    //returns the name, description and initialCost of the project
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    
}