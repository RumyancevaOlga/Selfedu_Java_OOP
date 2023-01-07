public class Lib {
    private Book [] lib;
    private static final int MAX_BOOKS = 10000;

    public Lib() {
        this.lib = new Book [MAX_BOOKS];
    }

    public Book [] addLib (Book book) {
        for(int i = 0; i < MAX_BOOKS; i++) {
            if(lib[i] == null) {
                lib[i] = book;
                break;
            }
        }
        return lib;
    }

    public void printLib () {
        for(int i = 0; i < MAX_BOOKS; i++) {
            if(lib[i] != null) {
                System.out.println(lib[i].getTitle() + " " + lib[i].getAuthor() + " " + lib[i].getPublication() + " " + lib[i].getPages());
            }
        }
    }
}
