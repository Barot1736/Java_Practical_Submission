public class part4_21{
    public static void main(String args[]){
        degree d = new degree();
        d.getdegree();
        post p = new post();
        p.getdegree();
        under u = new under();
        u.getdegree();
    }
}

class degree{
    void getdegree(){
        System.out.println("I got Degreee");
    }
}

class post extends degree{
    void getdegree(){
        System.out.println("I am Postgraduate");
    }
}

class under extends degree{
    void getdegree(){
        System.out.println("I am Undergraduate");
    }
}