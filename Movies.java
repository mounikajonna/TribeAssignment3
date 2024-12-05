package Assignment3;

import java.util.Scanner;

public class Movies {
	String title;
    String director;
    String[] actors;
    String[] reviews;
    int actorCount;
    int reviewCount;

    public Movies(String title, String director, int maxActors, int maxReviews) {
        this.title = title;
        this.director = director;
        this.actors = new String[maxActors];
        this.reviews = new String[maxReviews];
        this.actorCount = 0;
        this.reviewCount = 0;
    }

    public void addActor(String actor) {
        if (actorCount < actors.length) {
            actors[actorCount++] = actor;
        } else {
            System.out.println("Cannot add more actors. Array is full.");
        }
    }

    public void addReview(String review) {
        if (reviewCount < reviews.length) {
            reviews[reviewCount++] = review;
        } else {
            System.out.println("Cannot add more reviews. Array is full.");
        }
    }

    public void displayMovieDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors:");
        for (String actor : actors) {
            if (actor != null) {
                System.out.println("- " + actor);
            }
        }
        System.out.println("Reviews:");
        for (String review : reviews) {
            if (review != null) {
                System.out.println("- " + review);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie title:");
        String title = sc.nextLine();

        System.out.println("Enter director name:");
        String director = sc.nextLine();

        System.out.println("Enter maximum number of actors:");
        int maxActors = sc.nextInt();

        System.out.println("Enter maximum number of reviews:");
        int maxReviews = sc.nextInt();
        sc.nextLine();

        Movies movie = new Movies(title, director, maxActors, maxReviews);

        System.out.println("Enter the number of actors to add:");
        int numActors = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numActors; i++) {
            System.out.println("Enter actor " + (i + 1) + ":");
            String actor = sc.nextLine();
            movie.addActor(actor);
        }

        System.out.println("Enter the number of reviews to add:");
        int numReviews = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numReviews; i++) {
            System.out.println("Enter review " + (i + 1) + ":");
            String review = sc.nextLine();
            movie.addReview(review);
        }

        movie.displayMovieDetails();
        sc.close();
    }
}
