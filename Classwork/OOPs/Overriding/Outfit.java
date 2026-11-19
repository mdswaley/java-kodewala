package OOPs.Overriding;

class Outfit {
    String categories(){
        System.out.println("All categories available..");
        return "Available";
    }
}

class Men extends Outfit{
    @Override
    String categories(){
        System.out.println("Men categories available..");
        return "Only for men";
    }
}
