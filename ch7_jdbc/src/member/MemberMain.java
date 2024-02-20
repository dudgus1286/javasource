package member;

import java.util.List;
import java.util.Scanner;

public class MemberMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;

    MemberDAO memberDAO = new MemberDAO();

    while (run) {
      System.out.println("====================================");
      System.out.println("1. 전체 회원 조회");
      System.out.println("2. 개별 회원 조회");
      System.out.println("3. 회원 추가");
      System.out.println("4. 회원 수정");
      System.out.println("5. 회원 삭제");
      System.out.println("6. 종료");
      System.out.println("====================================");

      System.out.print("메뉴 입력 >> ");
      int menu = Integer.parseInt(sc.nextLine());
      switch (menu) {
        case 1: // 전체 회원 조회
          System.out.println("\n**** 전체 회원 조회 ****");
          System.out.println("아이디\t비밀번호\t이름\t이메일");
          System.out.println("====================================");
          List<MemberDTO> list = memberDAO.getRows();
          for (MemberDTO memberDTO : list) {
            System.out.print(memberDTO.getUserId() + "\t");
            System.out.print(memberDTO.getPassword() + "\t");
            System.out.print(memberDTO.getName() + "\t");
            System.out.print(memberDTO.getEmail() + "\t");
            System.out.println();
          }
          break;
        case 2: // 개별 회원 조회
          System.out.println("\n**** 회원 조회 ****");
          System.out.print("아이디 입력 >>> ");
          String selectId = sc.nextLine();
          System.out.print("비밀번호 입력 >>> ");
          String selectPassword = sc.nextLine();

          MemberDTO readDTO = new MemberDTO();
          readDTO.setUserId(selectId);
          readDTO.setPassword(selectPassword);

          MemberDTO row = memberDAO.getRow(readDTO); // == 객체로 넘기기
          // MemberDTO row = memberDAO.getRow(selectId, selectPassword); // 파라메터로 넘기기
          System.out.println("\n\n==== 조회 회원 정보 ====");
          System.out.println("아이디 : " + row.getUserId());
          System.out.println("비밀번호 : " + row.getPassword());
          System.out.println("이름 : " + row.getName());
          System.out.println("이메일 : " + row.getEmail());
          System.out.println();
          break;
        case 3: // 회원 추가
          System.out.println("\n**** 회원 추가 ****");
          System.out.print("아이디 >> ");
          String newId = sc.nextLine();
          System.out.print("비밀번호 >> ");
          String newPassword = sc.nextLine();
          System.out.print("이름 >> ");
          String newName = sc.nextLine();
          System.out.print("이메일 >> ");
          String newEmail = sc.nextLine();

          MemberDTO insertDto = new MemberDTO(
            newId,
            newPassword,
            newName,
            newEmail
          );
          System.out.println(
            memberDAO.insert(insertDto) > 0 ? "입력 성공" : "입력 실패"
          );
          break;
        case 4: // 회원 비밀번호 수정
          System.out.println("\n**** 회원 수정 ****");
          System.out.print("아이디 입력 >>> ");
          String updateId = sc.nextLine();
          System.out.print("기존 비밀번호 입력 >>> ");
          String updatePassword = sc.nextLine();
          // 아이디와 기존 비밀번호로 조회 시 회원이 존재하면 수정
          MemberDTO rowMem = memberDAO.getRow(updateId, updatePassword);
          if (rowMem == null) {
            System.out.println("입력한 아이디와 비밀번호를 확인해 주세요");
          } else {
            System.out.print("새 비밀번호 입력 >>> ");
            String changePassword = sc.nextLine();

            System.out.println(
              memberDAO.update(updateId, changePassword) > 0
                ? "수정 완료"
                : "수정 실패"
            );
          }
          break;
        case 5: // 회원 삭제
          System.out.println("\n**** 회원 삭제 ****");
          System.out.print("삭제할 아이디 입력 >>> ");
          String deleteId = sc.nextLine();
          System.out.print("비밀번호 입력 >>> ");
          String deletePassword = sc.nextLine();
          // 아이디와 기존 비밀번호로 조회 시 회원이 존재하면 삭제
          MemberDTO deleteMem = memberDAO.getRow(deleteId, deletePassword);
          if (deleteMem == null) {
            System.out.println("입력한 아이디와 비밀번호를 확인해 주세요");
          } else {
            int result = memberDAO.delete(deleteId);
            System.out.println(result > 0 ? "삭제 완료" : "삭제 실패");
          }
          break;
        case 6:
          run = false;
          break;
        default:
          break;
      }
    }
  }
}
