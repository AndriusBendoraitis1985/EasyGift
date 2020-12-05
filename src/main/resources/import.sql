insert into users (user_name, password, email, logo_path, role_id) values ('Homer','$2a$10$IT9KkfibuVgtumte6Zrj.uxhVSLtQpfS8oGBsVdc.ephEQUokVv62','homer@gmail.com','https://consequenceofsound.net/wp-content/uploads/2017/04/homer-simpson-feature1.png?w=807',1);
insert into users (user_name, password, email, logo_path, role_id) values ('Marge','$2a$10$IT9KkfibuVgtumte6Zrj.uxhVSLtQpfS8oGBsVdc.ephEQUokVv62','marge@gmail.com','https://www.pngitem.com/pimgs/m/256-2562500_simpsons-png-images-free-download-homer-simpson-png.png',2);
insert into users (user_name, password, email, logo_path, role_id) values ('Bart','$2a$10$IT9KkfibuVgtumte6Zrj.uxhVSLtQpfS8oGBsVdc.ephEQUokVv62','bart@gmail.com','https://www.pngfind.com/pngs/m/62-626692_bart-simpson-head-png-transparent-png.png',2);
insert into users (user_name, password, email, logo_path, role_id) values ('Lisa','$2a$10$IT9KkfibuVgtumte6Zrj.uxhVSLtQpfS8oGBsVdc.ephEQUokVv62','lisa@gmail.com','https://pbs.twimg.com/profile_images/685655033556369408/_URvpaLd_400x400.png',2);

insert into roles (name) values ('ROLE_ADMIN');
insert into roles (name) values ('ROLE_USER');

insert into occasions (user_name, user_surname, occasion_type, occasion_date) values ('Homer','Simpson','birthday','2021-06-21');
insert into occasions (user_name, user_surname, occasion_type, occasion_date) values ('Marge','Simpson','weddings','2021-07-19');
insert into occasions (user_name, user_surname, occasion_type, occasion_date) values ('Bart','Simpson','birthday','2021-11-04');
insert into occasions (user_name, user_surname, occasion_type, occasion_date) values ('Lisa','Simpson','birthday','2021-04-11');
insert into occasions (user_name, user_surname, occasion_type, occasion_date) values ('Marge','Simpson','birthday','2021-01-28');
insert into occasions (user_name, user_surname, occasion_type, occasion_date) values ('Marge','Simpson','Christmas','2020-12-24');
insert into occasions (user_name, user_surname, occasion_type, occasion_date) values ('Homer','Simpson','Christmas','2020-12-24');
insert into occasions (user_name, user_surname, occasion_type, occasion_date) values ('Lisa','Simpson','Christmas','2020-12-24');
insert into occasions (user_name, user_surname, occasion_type, occasion_date) values ('Bart','Simpson','Christmas','2020-12-24');

insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Cake','https://www.handletheheat.com/wp-content/uploads/2015/03/Best-Birthday-Cake-with-milk-chocolate-buttercream-SQUARE-550x550.jpg',3,1);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Ham','https://png.pngtree.com/png-clipart/20190920/original/pngtree-super-delicious-big-ham-png-image_4665908.jpg',7,1);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Weekend in Paris','https://europe.stripes.com/sites/default/files/styles/community_site_carousel_750x500/public/article-images/53081031_s.jpg?itok=eHxRiJQK',8,2);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Visit in theatre','https://www.teatras.lt/uploads/img/catalog/13/image_13_79645224.jpg',2,2);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Skate','https://image.made-in-china.com/202f0j00nKMtLWvrJUfY/China-Skate-Manufacturer-Mini-Longboard-Skateboards-for-Girls.jpg',4,3);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Bicycle','https://www.telegraph.co.uk/content/dam/health-fitness/2018/11/01/future_trans_NvBQzQNjv4BqztbJieiwAQnQRmGy6ktPKjGlvRPkLrU2fMgxYfCf0eU.jpg',0,3);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Saxophone','https://clipartion.com/wp-content/uploads/2015/11/lisa-saxophone-clipart.gif',6,4);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Book','https://ashmagautam.files.wordpress.com/2013/11/mcj038257400001.jpg',1,4);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Oven','https://ksd-images.lt/display/aikido/store/f1805a7435b9778e3d01849a32ab025d.jpg',2,5);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Perfume','https://i5.walmartimages.com/asr/b8a1e0f8-7154-4a69-af22-f53b9970f291_3.600ef75af25b4fadb9aca2a6f96454a0.jpeg',1,5);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('New car','https://tstoaddicts.files.wordpress.com/2015/04/canyonero-friendship-prize.png',0,6);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Dress','https://soondayswiss.files.wordpress.com/2013/12/soonday-08-m-simpson.jpg?w=650',3,6);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Beer','https://www.powercoin.it/14777-thickbox_default/duff-beer-simpsons-1-oz-silver-coin-1-tuvalu-2019.jpg',5,7);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Bear','https://ksd-images.lt/display/aikido/store/820303cbe60f0ee767afda3641b38ce6.jpg',3,8);
insert into gifts (gift_description, imagine_path, rating, occasion_id) values ('Bear','https://media.istockphoto.com/vectors/cartoon-bomb-illustration-vector-id842671590?k=6&m=842671590&s=612x612&w=0&h=D1A2a--svXcKUyosW2-StYy-2cUNz7c_Zf3RlcqJDK8=',0,9);

insert into history (history_date, history_description, history_imagine_path, history_type, user_name, user_surname) values ('2019-06-19','Hammock','https://images1.novica.net/pictures/2/p176824_2a.jpg','birthday','Homer','Simpson');
insert into history (history_date, history_description, history_imagine_path, history_type, user_name, user_surname)values ('2019-04-23','Hat','https://4wayz.co.uk/wp-content/uploads/2019/01/c8f03132-e2c3-4df7-89cf-d5679b78869d.jpg','Chritsmas','Lisa','Simpson');
