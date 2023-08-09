//package 프로젝트2차;
//
//import java.util.Scanner;
//
//public class BookSearchApp {
//    public static void main(String[] args) {
//        BookSearch bookSearch = new BookSearch();
//        bookSearch.run();
//    }
//}
//
//class BookSearch {
//    private String[][][] booklist = {
//        // ... (your book data here)
//    };
//
//    public void run() {
//        Scanner sc = new Scanner(System.in);
//
//        boolean found = false;
//
//        loop: while (true) {
//            System.out.println("찾고싶은 도서의 카테고리 또는 도서번호를 입력하세요(문학,외국어,철학,취미,미성년 또는 도서번호):\n이전단계로 돌아가길 원하시면 '이전' 을 입력해주세요");
//            String input = sc.nextLine();
//
//            switch (input) {
//                case "문학":
//                    // ... (your category-specific logic)
//                    break;
//                case "외국어":
//                    // ... (your category-specific logic)
//                    break;
//                // ... (other cases)
//                case "이전":
//                    System.out.println("이전단계로 돌아갑니다");
//                    break loop;
//                default:
//                    // ... (default book search logic)
//            }
//
//            if (!found) {
//                System.out.println("해당 카테고리 또는 도서 번호의 도서를 찾을 수 없습니다.");
//            }
//        }
//
//        sc.close();
//    }
//}
//
