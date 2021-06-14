import java.util.Iterator;

public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		/*
		 * 배열 객체 초기화
		 */
		System.out.println("-----------학생데이타를 저장하기위한 배열 객체 생성 초기화-----------");
		int[] noArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] nameArray = {"KIM", "LEE", "PARK", "CHOI", "SIM", "GOO", "QIM", "WIM", "EIM", "RIM"};
		int[] korArray = {99, 54, 55, 56, 57, 44, 43, 24, 99, 48};
		int[] engArray = {99, 64, 15, 26, 37, 74, 53, 14, 29, 76};
		int[] mathArray = {98, 44, 37, 71, 82, 23, 41, 97, 76, 87};
		int[] totArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double[] avgArray = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		char[] gradeArray = {'F','F','F','F','F','F','F','F','F','F'};
		int [] rankArray = {1,1,1,1,1,1,1,1,1,1};
		
		/*
		 * 총점, 평균, 평점 계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			totArray[i] = korArray[i]+engArray[i]+mathArray[i];
			avgArray[i] = totArray[i]/3.0;
			if(avgArray[i]>=90) {
				gradeArray[i] = 'A';
			}else if(avgArray[i]>=80) {
				gradeArray[i] = 'B';
			}else if(avgArray[i]>=70) {
				gradeArray[i] = 'C';
			}else if(avgArray[i]>=60) {
				gradeArray[i] = 'D';
			}else
				gradeArray[i] = 'F';
		}
		/*
		 * 석차계산
		 */
		for(int i=0; i<noArray.length; i++) {
			for(int j=0; j<noArray.length; j++) {
				if(totArray[i]<totArray[j]) {
					rankArray[i]++;
				}
			}	
		}
		
		
		/*
		 * 3번 학생 찾아서 1명 정보출력(학생 번호는 중복되지 않는다.)
		 */
		System.out.println(">>3번 학생 찾아서 1명 정보출력(학생 번호는 중복되지 않는다.)");
		for (int i = 0; i < noArray.length; i++) {
			if(noArray[i]==3) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
				break;
			}
		}
		
		
		/*
		 * F학점 학생 모두 찾아서 여러명 정보출력
		 */
		System.out.println(">>F학점 학생 모두 찾아서 여러명 정보출력");
		for (int i = 0; i < gradeArray.length; i++) {
			if(gradeArray[i]=='F') {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
			}
		}
		
		
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
					noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
		}
		
		/*
		 * [Quiz]오름차순 정렬 작업
		 */
		//1회 정렬
		for(int i=0;i<noArray.length-1;i++) {
			for(int j=0;j < noArray.length-1; j++) {
				if(totArray[j] > totArray[j+1]) {
					
					//총점 교환
					int tempTot = totArray[j+1];
					totArray[j+1] = totArray[j];
					totArray[j] = tempTot;
					
					//번호 교환
					int tempNo = noArray[j+1];
					noArray[j+1]=noArray[j];
					noArray[j]=tempNo;
					
					//이름 교환
					String tempName = nameArray[j+1];
					nameArray[j+1] = nameArray[j];
					nameArray[j] = tempName;
					
					//국어 교환
					int tempKor = korArray[j+1];
					korArray[j+1]=korArray[j];
					korArray[j]=tempKor;
					
					//영어 교환
					int tempEng = engArray[j+1];
					engArray[j+1]=engArray[j];
					engArray[j]=tempEng;
					
					//수학 교환
					int tempMath = mathArray[j+1];
					mathArray[j+1]=mathArray[j];
					mathArray[j]=tempMath;
					
					
					//평균 교환
					double tempAvg = avgArray[j+1];
					avgArray[j+1] = avgArray[j];
					avgArray[j] = tempAvg; 
					
					//평점 교환
					char tempGrade = gradeArray[j+1];
					gradeArray[j+1] = gradeArray[j];
					gradeArray[j] = tempGrade;
					
					//랭크 교환
					int tempRank = rankArray[j+1];
					rankArray[j+1] = rankArray[j];
					rankArray[j] = tempRank;
					
				}
			}
		}
		
			
			System.out.printf("---------------학생 성적출력[정렬후]-------------------%n");
			System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
					"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
			System.out.printf("-----------------------------------------------%n");
			
			for (int i = 0; i < noArray.length; i++) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
		}

	}

}
