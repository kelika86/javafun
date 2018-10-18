class ProjectTest{
    public static void main(String[] args){
        Project cat= new Project();
        cat.setName("Kitty");
        cat.setDescription("Soft");
        String catName=cat.getName();
        String catDescription=cat.getDescription();
        System.out.println("Project name: " +catName+ "Description: "+catDescription);
    }
}