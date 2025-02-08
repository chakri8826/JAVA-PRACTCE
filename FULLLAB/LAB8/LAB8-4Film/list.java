import java.io.*;

public class list {
    MovieInfo start, end;
    int count = 0;

    void insert(String mn, String hn, String dn, float c) {
        MovieInfo newnode = new MovieInfo(mn, hn, dn, c);
        if (start == null)
            start = end = newnode;
        else {
            end.next = newnode;
            end = newnode;
        }
        count++;
    }

    void print() {
        MovieInfo current = start;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    void DeleteByName(String Name) {
        MovieInfo current = start;
        if (start.movie_Name.equals(Name))
            start = start.next;
        else {
            while (current.next.next != null) {
                if (current.next.movie_Name.equals(Name)) {
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
            if (current.next.movie_Name.equals(Name)) {
                end = current;
                end.next = null;
            }
        }
        count--;
    }

    void search(String name) {
        MovieInfo current = start;
        int found = 0;
        while (current != null) {
            if (current.movie_Name.equals(name)) {
                found = 1;
                break;
            }
        }
        if (found == 1)
            System.out.println("Present " + current);
        else
            System.out.println(name + " not found");
    }

    void sort() {
        MovieInfo pre, current, post;
        int out = count - 1;
        while (out > 0) {
            pre = null;
            current = start;
            post = current.next;
            int in = 0;
            while (in < out) {
                if (current.gross_Collections < post.gross_Collections) {
                    current.next = post.next;
                    post.next = current;
                    if (pre == null) {
                        start = post;
                        pre = post;
                    } else {
                        pre.next = post;
                        pre = post;
                    }
                    post = current.next;
                } else {
                    pre = current;
                    current = post;
                    post = current.next;
                }
                in++;
            }
            out--;
        }
    }

    void sortedFile() {
        try {
            FileWriter fw = new FileWriter("sorted.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            MovieInfo current = start;
            while (current != null) {
                bw.write(current.movie_Name);
                bw.write(" " + current.hero_Name);
                bw.write(" " + current.director_Name);
                bw.write(" " + current.gross_Collections + "\n");
                current = current.next;
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}