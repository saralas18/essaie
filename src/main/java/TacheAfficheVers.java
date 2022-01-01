
    public final class TacheAfficheVers implements Runnable {
        private final String vers;


        public TacheAfficheVers(String vers) {
            this.vers = vers;
        }

        @Override
        public void run() {
            System.out.println(this.vers);
        }
    }



