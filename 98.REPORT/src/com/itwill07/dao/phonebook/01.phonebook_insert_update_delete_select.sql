--insert
insert into phonebook values(phonebook_no_seq.nextval,'김순근','123-4568');
insert into phonebook values(phonebook_no_seq.nextval,'이순근','555-6789');
insert into phonebook values(phonebook_no_seq.nextval,'박순근','673-1315');
commit;

--update(pk update)
update phonebook set name='황순근',phone='899-9999' where no = 1;

commit;

--delete (pk delete)
delete from phonebook where no = 1; 

commit;

--select (pk select)
select no, name, phone from phonebook where no = 3;

--select(all select)
select * from phonebook;