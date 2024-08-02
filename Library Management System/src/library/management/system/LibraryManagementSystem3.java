/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author AYANTIKA
 */
public class LibraryManagementSystem3 {

    // Assuming other methods (addBook, etc.) are already implemented

    // Binary search for a book by title
    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, size, Comparator.comparing(Book::getTitle));
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = books[mid].getTitle().compareToIgnoreCase(title);
            if (compareResult == 0) {
                return books[mid];
            } else if (compareResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

