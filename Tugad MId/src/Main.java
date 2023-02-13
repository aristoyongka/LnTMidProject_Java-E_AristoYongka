import java.util.*;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	Vector<Vector<String>>data;
	Vector<String> temp;

	void clear() {
		for (int i = 1; i< 30; i++) {
			System.out.println("");
		}
	}

	public Main() {
		
		data = new Vector<>();
		
		int input = 0;
		String kode, nama, gender, jabatan;
		double gaji;
		do {
			clear();
			System.out.println("Database Karyawan PT Meksiko");
			System.out.println("=============================");
			System.out.println("1. Input data karyawan");
			System.out.println("2. View data karyawan");
			System.out.println("3. Update data karyawan");
			System.out.println("4. Delete data karyawan");
			System.out.println("5. Exit");
			System.out.print(">> ");
			input = sc.nextInt();
			
			if(input == 1) {
				clear();
				System.out.println("Input data karyawan");
				System.out.println("===================");
				
				//nama
				do {
					System.out.println("Input nama karyawan [>=3]: ");
					nama = sc.nextLine();
					if(nama.length() < 3) {
						System.out.println("->Nama karyawan minimal 3 huruf");					
					}
				} while (nama.length() < 3);
				
				//gender
				do {
					System.out.print("Input jenis kelamin [Laki-laki/Perempuan] (Case Sensitive): ");
					gender = sc.nextLine();
					
					if (!gender.equals("Laki-laki") && !gender.equals("Perempuan")) {
						System.out.println("->Input Invalid!");
					}
				} while (!gender.equals("Laki-laki") && !gender.equals("Perempuan"))
					
				//jabatan
				do {
					System.out.print("Input jabatan [Manager | Supervidor | Admin] (Case Sensitive): ");
					jabatan = sc.nextLine();
					
					if (!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin")) {
						System.out.println("->Input Invalid!");
					}
				} while (!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin"))
					
				//gaji
				if(jabatan == "Manager") {
					gaji = 8000000;
				}
				else if(jabatan == "Supervisor") {
					gaji = 6000000;
				}
				else if(jabatan == "Admin") {
					gaji = 4000000;
				}
					
					
				//generate ID
				kode = "GA";
				int random = (int) (Math.random() * (999-100+1) + 100);
				kode += random;
				
				temp = new Vector<>();
				temp.add(nama);
				temp.add(gender);
				temp.add(jabatan);
				temp.add(String.valueOf(gaji));
				temp.add(kode);
				
				data.add(temp);
				
				System.out.print("Berhasil menambahkan karyawan dengan id "+id);
				System.out.println("Enter to return");
				sc.nextLine();sc.nextLine();
				
			}
			else if (input == 2){
				clear();
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|");
				System.out.print("|No  |Kode Karyawan    |Nama Karyawan                 |Jenis Kelamin  |Jabatan       |Gaji Karyawan|");
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|");
				
				for(int i=0; i<data.size(); i++) {
					system.out.printf("|%4d|%17s|%30s|%15s|%14s|%13s|",i+1, data.kode.get(i), , data.nama.get(i), data.gender.get(i), data.jabatan.get(i), data.gaji.get(i));
				}
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|");
			}
			
			else if (input == 3) {
				clear();
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|");
				System.out.print("|No  |Kode Karyawan    |Nama Karyawan                 |Jenis Kelamin  |Jabatan       |Gaji Karyawan|");
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|");
				
				for(int i=0; i<data.size(); i++) {
					System.out.printf("|%4d|%17s|%30s|%15s|%14s|%13s|",i+1, data.kode.get(i), , data.nama.get(i), data.gender.get(i), data.jabatan.get(i), data.gaji.get(i));
				}
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|");
				
				System.out.print("Input nomor urutan karyawan yang ingin diupdate: ");
				int noUpdate;
				noUpdate = sc.nextLine();
				
				//nama
				System.out.println("Input nama karyawan [>=3]: ");
				nama = sc.nextLine;
					if(!nama.equals("0")) {
						do {
							System.out.println("Input nama karyawan [>=3]: ");
							nama = sc.nextLine();
							if(nama.length() < 3) {
								System.out.println("->Nama karyawan minimal 3 huruf");					
							}
						} while (nama.length() < 3);
						data.nama.set(noUpdate-1, nama);
				}
				//gender
				System.out.println("Input jenis kelamin [Laki-laki/Perempuan] (Case Sensitive): ");
				gender = sc.nextLine;
					if(!gender.equals("0")) {
						do {
							System.out.print("Input jenis kelamin [Laki-laki/Perempuan] (Case Sensitive): ");
							gender = sc.nextLine();
							
							if (!gender.equals("Laki-laki") && !gender.equals("Perempuan")) {
								System.out.println("->Input Invalid!");
							}
						} while (!gender.equals("Laki-laki") && !gender.equals("Perempuan"))
						data.gender.set(noUpdate-1, gender);
					}
				
					
				//jabatan
				System.out.println("Input jabatan [Manager | Supervidor | Admin] (Case Sensitive): ");
				jabatan = sc.nextLine;
					if(!jabatan.equals("0")) {
						do {
							System.out.print("Input jabatan [Manager | Supervidor | Admin] (Case Sensitive): ");
							jabatan = sc.nextLine();
							
							if (!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin")) {
								System.out.println("->Input Invalid!");
							}
						} while (!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin"))
						data.jabatan.set(noupdate-1, jabatan);	
					}
					
				System.out.println("Berhasil mengupdate karyawan dengan id "+data.kode.get(noUpdate-1));
				System.out.println("Enter to return");
				sc.nextLine();sc.nextLine();
			}
					
			else if(input == 4) {
				clear();
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|");
				System.out.print("|No  |Kode Karyawan    |Nama Karyawan                 |Jenis Kelamin  |Jabatan       |Gaji Karyawan|");
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|");
				
				for(int i=0; i<data.size(); i++) {
					system.out.printf("|%4d|%17s|%30s|%15s|%14s|%13s|",i+1, data.kode.get(i), , data.nama.get(i), data.gender.get(i), data.jabatan.get(i), data.gaji.get(i));
				}
				System.out.print("|----|-----------------|------------------------------|---------------|--------------|-------------|");
				
				System.out.print("Input nomor urutan karyawan yang ingin dihapus: ");
				noUpdate = sc.nextLine();
				data.nama.remove(noUpdate-1);
				data.gender.remove(noUpdate-1);
				data.jabatan.remove(noUpdate-1);
				data.gaji.remove(noUpdate-1);
				
				System.out.print("Karyawan dengan kode "+data.kode.get(noUpdate-1)+"berhasil dihapus");
				
				data.remove(noUpdate-1);
				
				System.out.println("Enter to return");
				sc.nextLine();sc.nextLine();
			}
					
		}while (input != 5);
	}
	public static void main(String[] args) {
		new Main();
	}
}










}