package day02_variable;

public class Quiz01 {
	public static void main(String[] args) {
//		����ȯ�� �̿��Ͽ� ������ �ذ��ϼ���
//		ũ�⸦ Ȯ���ϰ� �� �׷����� ������ ������
		
		byte b =97;
		short s = 20;
		char c = 'A';
		float f;
		s = b;//
		c = (char)b;//�ɸ��ʹ� ����� ���� ����Ʈ�� ������ ��� ���
//		�����ϴ� ���� ������ �ٸ��⶧���� ���������´�
		
		s = (short)c;
		c = (char)s;
		f = (float)5.11; //double�� �νĵǱ⶧��
		f = 5.11f;//(double�̾ƴ� float���� ǥ���ϰڽ��ϴ�)
//		�÷��� �־��ش�
//		���� ���� ���ֶ� �� �̷��� �Ǿ������� �����غ���
	
	}
}
