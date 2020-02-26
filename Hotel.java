
public class Hotel
{
	Hotel(){
		this(5,10);
	}
	Hotel(int rows,int cols){
		 rooms = new Room[rows][cols];
		//����rows
		for(int i=0;i<rows;i++){
			
			//Ϊ¥�����Զ���0
			String str01 = "";
			for(int j=10;j<=rows;j*=10){
				if((rows/j != 0) && ((i+1)/j == 0))
					str01 += "0";
			}
			//����cols
			for(int j=0;j<cols;j++){
				rooms[i][j] = new Room();
				//�жϲ�����type
				if(i < rows*2/5)
					rooms[i][j].setType("��׼��");
				else if(i >= rows*4/5)
					rooms[i][j].setType("������");
				else
					rooms[i][j].setType("˫�˼�");
				//Ϊ¥�����Զ���0
				String str02 = "";
				for(int k=10;k<=cols;k*=10){
					if((cols/k != 0) && ((j+1)/k == 0))
						str02 += "0";
				}
					rooms[i][j].setNo(str01 + (i + 1) + str02 + (j + 1));					
			}

		}
	}
	public Room[][] rooms;
	//��ӡ�Ƶ���ס���
	public void scanner(){
		//����ÿ��¥��
		for(int i=0;i<rooms.length;i++){
			//�ж�¥�����ͣ���ӡ��������
			if(i < rooms.length*2/5)
					System.out.println("[��׼��]");
				else if(i >= rooms.length*4/5)
					System.out.println("[������]");
				else
					System.out.println("[˫�˼�]");
			//����ÿ������
			for(int j=0;j<rooms[i].length;j++){
				System.out.print(rooms[i][j].getNo()+":");
				if(rooms[i][j].getIsUse())
					System.out.print("����ס");
				else
					System.out.print("δ��ס");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	//�Ƶ�Ǽ�ϵͳ
	public void register(int rows,int cols){
		//�жϷ����Ƿ�Ԥ��
		if(rooms[rows][cols].getIsUse()){
			System.out.println("��Ǹ����ѡ��ķ����ѱ�Ԥ����");
		}else{
			System.out.println("���ã��÷���δ��Ԥ����");
			System.out.println("�Ƿ�Ԥ��" +"[" + rooms[rows][cols].getType() + "]"+ rooms[rows][cols].getNo() + "�ŷ���?(Y/N)");
			java.util.Scanner reader =new java.util.Scanner(System.in);
			String confirm = reader.next();
			//ȷ��Ԥ������ȡ��Ԥ��
			if("Y".equals(confirm)|| "y".equals(confirm)){
				System.out.println("Ԥ���ɹ���");
				rooms[rows][cols].setIsUse(true);
			}else
				System.out.println("�Ѿ�ȡ��Ԥ����");
		}	
	}
	//�Ƶ��˶�ϵͳ
	public void cancel(int rows,int cols){
		if(!rooms[rows][cols].getIsUse()){
			System.out.println("��Ǹ����ѡ��ķ���δ��Ԥ����");
		}else{
			System.out.println("���ã��÷����ѱ�Ԥ����");
			System.out.println("�Ƿ��˶�" +"[" + rooms[rows][cols].getType() + "]" + rooms[rows][cols].getNo() + "�ŷ���?(Y/N)");
			java.util.Scanner reader =new java.util.Scanner(System.in);
			String confirm = reader.next();
			//ȷ���˶�����ȡ���˶�
			if("Y".equals(confirm)|| "y".equals(confirm)){
				System.out.println("�˶��ɹ���");
				rooms[rows][cols].setIsUse(true);
			}else
				System.out.println("�Ѿ�ȡ���˶���");
		}
	}

}

