package object;

import java.util.*;


public class Test {
	public static double sum_fee(Classroom classroom) {
		return classroom.getChiPhiHocTap()*classroom.getMaxStudent();
	}
    public static void printList(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static ArrayList<Student> generateStudent(Classroom classroom, int n) {
        ArrayList<Student> students = new ArrayList<>();
        // tao mang ten
        String[] fullNames = {"Lương Thái Sơn ", "Nguyễn Huy Hoàng ", "Nguyễn Thành Đạt ", "Nguyễn Ngô Việt Trung ",
                "Đào Duy Chiến ", "Trần Danh Khang ", "Nguyễn Văn Hào ", "Bùi Thị Ngọc Huyền ", "Nguyễn Duy Minh Quân ",
                "Mai Thanh Hồng ","Phạm Đình Tiến ","Phạm Đăng Đông ","Đức Minh Hoàng ","Nguyễn Viết Vượng "};
        // tao dia chi
        String[] addresses = {"Hải Phòng", "Phú Thọ ", "Hải Dương ", "Hà Nội ","Nghệ An","Thanh Hoá","Thái Bình ","Nam Định"};
        // tao sdt
        int[] phoneNumbers = {0124354, 23528345, 234785623, 3284752, 1623127364, 92375975, 3487253};
        // tao bien chi so
        int cnt;
        for (int i = 0; i < n; i++) {
            // cap phat dong cho phan tu Students thu i
            Student student = new Student(classroom.getMaLop(), classroom.getMaKhoaHoc(), classroom.getChiPhiHocTap(),classroom.getNgayTaoLop(),classroom.getMaxStudent(), null, null, null, i);
            // tạo mã ngẫu nhiênet
            student.setMaHV("hv" + i);
            // tạo tên ngẫu nhiên
            cnt = (int) (Math.random() * fullNames.length);
            student.setFullName(fullNames[cnt]);
            // tao address ngau nhien
            cnt = (int) (Math.random() * addresses.length);
            student.setAddress(addresses[cnt]);
            // tao phonenumber ngau nhien
            cnt = (int) (Math.random() * phoneNumbers.length);
            student.setPhoneNumber(phoneNumbers[cnt]);
            students.add(student);
        }
        return students;
    }

    public static void sortname(ArrayList<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getFullName));
    }

    public static ArrayList<Student> searchStudent(ArrayList<Student> students, String name) {
        ArrayList<Student> results = new ArrayList<>();

        for (Student student : students) {
            if (student.getFullName().contains(name)) {
                results.add(student);
            }
        }
        
        return results;
    }
    public static void printClassrooms(ArrayList<Classroom> classrooms) {
        for (Classroom classroom : classrooms) {
            System.out.println("Mã lớp: " + classroom.getMaLop());
            System.out.println("Mã khóa học: " + classroom.getMaKhoaHoc());
            System.out.println("Chi phí học tập: " + classroom.getChiPhiHocTap());
            System.out.println("Ngày bắt đầu: " + classroom.getNgayTaoLop());
            System.out.println("Số lượng sinh viên: " + classroom.getMaxStudent());
            System.out.println("-----------------------------");
        }
    }
    public static void printStatistics(ArrayList<Classroom> classrooms) {
    	int count = 0 ;
    	int sum_money = 0 ; 
        for (Classroom classroom : classrooms) {
        	count += classroom.getMaxStudent();
        	sum_money += Test.sum_fee(classroom) ;
            System.out.println("Thống kê lớp " + classroom.getMaLop() + ":");
            System.out.println("Số lượng sinh viên: " + classroom.getMaxStudent());
            System.out.println("Tổng chi phí thu được trong lớp " + classroom.getMaLop() + "là : " + Test.sum_fee(classroom));
            System.out.println("-----------------------------");
        }
    		  // tổng số sinh viên trong trung tâm là :
    		System.out.println("Tổng số sinh viên đang theo học tại trung tâm là: " + count);  
    	    System.out.println("Tổng thu là: " + sum_money);
    }
    public static void main(String[] args) {
        int n = 20 + (int) (Math.random() * 100);
        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Classroom> classrooms = new ArrayList<>();
        classrooms.add(new Classroom("OOP JAVA", "2023", 2000, "20-12-2023", 30));
        classrooms.add(new Classroom("cau truc du lieu", "2023", 2001, "22-7-2023", 50));
        classrooms.add(new Classroom("Machine learning", "2023", 2002, "6-2-2023", 60));

        for (Classroom classroom : classrooms) {
            students.addAll(generateStudent(classroom, n));
        }

        System.out.println("Truoc khi sap xep:");
        printList(students);

        System.out.println("Sau khi sap xep:");
        sortname(students);
        printList(students);
        System.out.print("Nhập tên sinh viên cần tìm: ");
        Scanner scanner = new Scanner(System.in);
        String nameStudent = scanner.nextLine();
        
        // in thông tin sinh viên muốn tìm
        ArrayList<Student> searchResults = Test.searchStudent(students, nameStudent);
        if (searchResults.isEmpty()) {
            System.out.println("Không có sinh viên nào tên " + nameStudent);
        } else {
            System.out.println("Thông tin sinh viên tên " + nameStudent + ":");
            printList(searchResults);
        }
        // in danh sách lớp học 
        System.out.println("Thông tin các Lớp học là :");
        Test.printClassrooms(classrooms);
        // thống kê lớp học 
        Test.printStatistics(classrooms);
    }
}
