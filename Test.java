
import java.util.Scanner;
public class Test
{
	public static void main(String[] args){
		
		Hotel jiaRi = new Hotel();
		Scanner reader = new Scanner(System.in);
		System.out.println("��ӭʹ�þƵ����ϵͳ��");
		System.out.println("�鿴��ס����밴1��Ԥ�������밴2���˶������밴3���Ƴ�ϵͳ�밴0�����س�������");
		int judge = reader.nextInt();
		switch(judge){
			 case 1:{
				System.out.println("���Ƶ���ס�����");
				jiaRi.scanner();
				break;
			}case 2:{
				System.out.print("��ѡ������Ҫ��ס��¥�㣺");
				int lows = reader.nextInt();				
				System.out.print("��ѡ���¥��ķ���ţ���ǰ����������㣩");
				int cols = reader.nextInt();
				jiaRi.register(lows,cols);
				break;
			}case 3:{
				System.out.print("��ѡ������Ҫ�˶���¥�㣺");
				int rows = reader.nextInt();				
				System.out.print("��ѡ���¥��ķ���ţ���ǰ����������㣩");
				int cols = reader.nextInt();
				jiaRi.cancel(rows,cols);
				break;
			}case 0:
				System.exit(0);
			default:
				System.out.println("�������");
		}

	}
}
