public class CizgeAS {

    public static void main(String[] args) {
    	if(args.length != 1){
	 		System.out.println("Usage: java CizgeAS" + " [OPTION]");
	 		System.out.println("OPTION: 1-PRINT TEST");
	 		System.out.println("        2-TEST YOURSELF");
	 		return;
    	}


    	if(args[0].equals("1")){
    		test();
    	}
    	if(args[0].equals("2")){
    		System.out.println("----------------");
	    	System.out.println("TEST YOURSELF");
	    	System.out.println("----------------");
    		GraphUI graphUI = new GraphUI();
        	System.out.println(graphUI);
    	}

        
    }

    public static void test() {
    	Graph graph = new Graph<String>(5);

    	System.out.println("----------------");
    	System.out.println("PREDEFINED TEST");
    	System.out.println("----------------");
    	System.out.println("Add Node:");
    	System.out.println("----------------");
    	System.out.println("-Ankara");
    	System.out.println("-İstanbul");
    	System.out.println("-Erzurum");
    	System.out.println("-Adana");
    	System.out.println("-Bursa");
    	System.out.println("----------------");

    	graph.addNode("Ankara");
    	graph.addNode("İstanbul");
    	graph.addNode("Erzurum");
    	graph.addNode("Adana");
    	graph.addNode("Bursa");


    	System.out.println("Add Edge:");
    	System.out.println("----------------");
    	System.out.println("-Erzurum Adana 806");
    	System.out.println("-Erzurum İstanbul 1228");
    	System.out.println("-İstanbul Ankara 453");
    	System.out.println("-İstanbul Bursa 243");
    	System.out.println("-Ankara Bursa 384");
    	System.out.println("-Ankara Erzurum 875");
    	System.out.println("-Adana Ankara 490");
    	System.out.println("-Adana İstanbul 939");
    	System.out.println("-Bursa Adana 839");
    	System.out.println("-Bursa Erzurum 1239");
    	System.out.println("----------------");


    	graph.addEdge(new Edge("Erzurum","Adana",806));
    	graph.addEdge(new Edge("Erzurum","İstanbul",1228));

    	graph.addEdge(new Edge("İstanbul","Ankara",453));
    	graph.addEdge(new Edge("İstanbul","Bursa",243));

    	graph.addEdge(new Edge("Ankara","Bursa",384));
    	graph.addEdge(new Edge("Ankara","Erzurum",875));
    	
    	graph.addEdge(new Edge("Adana","Ankara",490));
    	graph.addEdge(new Edge("Adana","İstanbul",939));

    	graph.addEdge(new Edge("Bursa","Adana",839));
    	graph.addEdge(new Edge("Bursa","Erzurum",1239));

    	System.out.println("----------------");
    	System.out.println("----------------");

    	System.out.println(graph);

    	
    }
}
