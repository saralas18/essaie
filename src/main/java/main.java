public class main {
    public static void main(String[] args) {
        final String[] poeme = {"Souvent, pour s’amuser, les hommes d’équipage",
                "Prennent des goélands, vastes oiseaux des mers,",
                "Qui suivent, indolents compagnons de voyage,",
                "Le navire glissant sur les gouffres amers."
        };
        Thread t;
        for (var s : poeme) {
            t = new Thread(new TacheAfficheVers(s));
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}

