import oui.*;

public class Client{
    public static void main(String[] args) throws Exception{
        DataManager.basedir=args[0];
        //basedir naam ki static property set krdi 
        //args-> when command line se fire maarte hai jb args paas krte hain
        App app=new App();
    }
}