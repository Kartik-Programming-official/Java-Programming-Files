import java.io.*;
import java.awt.*;
class StudentFile extends Frame{
	TextField number,name,marks;
	Button enter,done;
	Label numLabel,nameLabel,markLabel;
	DataOutputStream dos;
	public StudentFile(){
	super("Create student File");	
	}
	public void setup(){
		resize (400,200);
		setLayout(new GridLayout(4,2));
		number=new TextField(25);
		numLabel=new Label("Roll Number:-");
		name=new TextField(25);
		nameLabel=new Label("Student Name:-");
		marks=new TextField(25);
		markLabel=new Label("Marks:-");
		enter=new Button("Enter");
		done=new Button("Done");
		add(numLabel);
		add(number);
		add(nameLabel);
		add(name);
		add(markLabel);
		add(marks);
		add(enter);
		add(done);
		show();
		try{
			dos=new DataOutputStream(new FileOutputStream("student.dat"));
		}
		catch(IOException e){
			System.err.println(e.toString());
			System.exit(1);
		}
	}
	public void addRecord(){
		int num;
		double d;
		num=(new Integer (number.getText())).intValue();
		try{
			dos.writeInt(num);
			dos.writeUTF(name.getText());
			d=new Double(marks.getText());
			dos.writeDouble(d.doubleValue());
		}
		catch(IOException e){ }
		number.setText(" ");
		name.setText(" ");
		marks.setText(" ");
	}
	public void cleanup(){
		if(! number.getText().equals(" ")){
			addRecord();
		}
		try{
			dos.flush();
			dos.close();
		}
		catch(IOException e){}
	}
	public boolean action(Event event,object o){
		if(event.teg instanceof Button){
			if(event.arg.equals("Enter")){
				addRecord();
				return true;
			}
		}
		return super.action(event,o);
	}
	public boolean handleEvent(Event event){
		if(event.get instanceof Button){
			if(event.arg.equals("DONE")){
				cleanup();
				System.exit(0);
				return true;
			}
		}
		return super.handleEvent(event);
	}
	public static void main(String[]args){
		StudentFile student=new StudentFile();
		student.setup();
	}
}