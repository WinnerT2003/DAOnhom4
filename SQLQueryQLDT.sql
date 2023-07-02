use DiemThi
create table Sinhvie
(
    Id int,
	Fullname varchar(30),
	gender varchar(5),
	email varchar(100),
	Phonenum varchar(12)
)
alter table Sinhvie add  Class varchar(30)
select *from Sinhvie;
delete from Sinhvie where Id = 123456
create table DiemSV
(
  Tensv varchar(30),
  diemgk float,
  diemck float,
  tenmon varchar(50),
  tongdiem float
  )
  select*from Sinhvie
  insert into DiemSV(Tensv, diemgk, diemck, tenmon)
  values('Thang',7.5, 8, 'lap trinh co ban');
  UPDATE Sinhvie set Class ='66IT4' where Id =400656
  delete from Sinhvie where Class ='66IT4'
  select ID, Tensv, diemgk, diemck, tenmon, diemgk+diemck as tongdiem from DiemSV
 alter table DiemSV add  diemchu varchar(10)
  select distinct Tensv, diemgk, diemck, tenmon, diemgk+diemck as tongdiem from DiemSV 
  select Tensv, 0.3*diemgk+0.7*diemck as tongdiem from DiemSV where Tensv = 'Thang'
  select  distinct ID,Tensv,tenmon,diemgk+diemck as tongdiem,case when diemgk+diemck < 10.0 then 'truot' when diemgk+diemck > 10.0 then 'qua'end as Trangthai from DiemSV 
  select ID,Tensv,avg(diemgk+diemck) as trungbinh,case when avg(diemgk+diemck) < 15 and avg(diemgk+diemck)>=10 then'A'when avg(diemgk+diemck) >= 15 and avg(diemgk+diemck) <= 20 then 'B'end as  chu from DiemSV group by ID,Tensv
  select DiemSV.tenmon, avg(diemgk+diemck)as trungbinh, Sinhvie.Class from Sinhvie join DiemSV on Sinhvie.Id = DiemSV.ID group by DiemSV.tenmon, Class 
  create table TK
  (
    username varchar(30),
	passwords varchar(30)
	)
	insert into TK(username, passwords) select Id,Id from Sinhvie
	select*from TK
	select distinct username,passwords from TK
	update TK set passwords=username
	delete from TK where passwords=123456
create table Tenmon
(
  mamon int,
  tenmon varchar(30),
  soTC int
  )
  insert into Tenmon(mamon,tenmon,soTC)
  values
  (45879,'Lap trinh co ban',3),
  (34578,'Mang may tinh',3),
  (12456,'Huong doi tuong',1),
  (48976,'CTDL va GT',2)
  select*from Tenmon
