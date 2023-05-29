# Борјана Дончева, бр. на индекс 213023
# Control Flow Graph
![SILab2_213023 drawio](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/290c6160-a99b-4934-86c5-0736149142d2)

# Цикломатска комплексност
Цикломатската комплексност на овој код е 11. Истата ја добив со формулата E-N+2, каде Е ми го претставува број на ребра, N бројот на јазли, така што за овој код
Е=37, N=29, па следува дека 38-29+2=10.

# Тест случаи според Every branch
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/3d85a448-5da7-416c-b66b-dd413079b258)

1.Прв тест случај: 
Во првиот тест случај, каде username=borjanadonceva, password=null и email=билоШто, се поминуваат гранките 1-2 и 2-25, бидејќи username=borjana.donceva, password=null и email=било што. Ќе влезе во условот if (user==null || user.getPassword()==null || user.getEmail()==null) бидејќи станува збор за логичкиот оператор и,  односно доволно е еден исказите да е точен за да влезе во условот и да фрли исклулок, во мојот случај тест случај тоа е исказот password=null . Кога ќе фрли исклучок завршува со функцијата и оди на последната линија од функцијата, односно на завршниот јазол 25.

2.Втор тест случај: 
Во вториот тест случај во кој, username=null, password=SI2023 и email=travijandoncev@gmail.com, се поминуваат гранките 1-3, 3-4, 4-5, 5-6, 6-7, 7-8.1, 8.1-8.2, 8.2-9, 9-10, 10-12, 12-8.3, 8.3-8.2, 8.2-(14,15,16,17) , (14,15,16,17)-18, и  18-25. Бидејќи ја username=null, влегува во 4-тиот јазол (if (user.getUsername()==null) условот) и не го поминува реброто 3-5, реброто 6-(14,15,16,17) не го поминува бидејќи влегува во 7миот јазол ( го исполнува условот if (user.getEmail().contains("@") && user.getEmail().contains(".")) )  и не го поминува реброто 12-8.3 бидејќи влегува во јазелот 13 (го исполнува условот if (existingUser.getUsername() == user.getUsername())) . Бидејќи должината на password e pomala od 8, влегува во јазелот 18 и враќа false, така шт излегува од функцијата. 

3.Трет тест случај: 
Во третиот тест случај, каде username=borjanadonceva, password=SI2023lab2, и email=borjanadonceva15.gmail.com,  од досега не изминатите ребра ги изминуваме 6-(14,15,16,17) бидејќи email не содржи @ па не го исполнува условот if (user.getEmail().contains("@") && user.getEmail().contains(".")) каде порани операторот && (или) потребно е двете да се точни за да го исполува. Дополнително ги изминува следните досега не изминати ребра: (14,15,16,17)-19, 19-20, 20-21.1, 21.1-21.2, 21.2-24, 21.2-22, 22-21.3, 21.3-21.2 и 24-25. Односно во овој тест случај бидејчи не го исполнува условот if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8), не влегува во јазелот 18, туку влегува во else ( јазел 19). 

Во овие три тест случаи ги поминавме голем дел од ребрата, но мора да ги изминеме сите ребра. Ребрата кои досега не се изминати се 10-11,11-12,12-13,13-8.3, 20-24, 22-23 и 23-25. Потребни ни се два тест случаи бидејќи за изминување на реброто 20-24 потребно е тест случајот да не влезе во условот if (!passwordLower.contains(" "))), а за изминување на реброто 23-25 потребно е да влезе во истиот услов и потоа да влезе во условот if (password.contains(String.valueOf(specialCharacters.charAt(i)))), односно password да содржи специјален знак и празно место.  Па според тоа ги креираме следните два тест случаи.

4.Четврти тест случај: 
Со четвртиот тест случај каде username=borjanadonceva, password=SI2023@lab2, и email=borjanadonceva15@gmail.com . Со овој ги поминуваме следните досега не поминати ребра: 10-11, 11-12, 12-13, 13-8.3, 22-23 и 23-25.

5.Пети тест случај: 
Потребен ни е уште еден тест случај за изминување на реброто 20-24, кое ќе го изминиме доколку password содржи празно место и нема да го исполнува условот if (!passwordLower.contains(" ")). Тоа го постигнува со тест случајот каде username=borjanadonceva, password=SIlab2 2023 и email=borjanadonceva15@gmail.com.

![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/865e6e96-7bdc-4031-b50f-abd0dac46589)

# Тест 1
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/8a385bb7-5a3f-4a1a-ace2-87eb21827015)

# Тест 2
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/3d8f41f4-0db2-4ba1-b416-73e0edfe97f0)

# Тест 3
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/70effc68-32e1-4e36-8779-8f9ee6d1d52d)

# Тест 4
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/6ec55098-62a7-43d8-98fa-5a50f19f1d90)

# Тест 5
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/dfd06906-59a0-418a-865e-df608a103a83)


# Тест случаи според критериумот Multiple Condition
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/c5f284d9-205c-4090-8a09-4fa57a3eaec4)
 
1. Првиот исказ, user==null, враќа true, бидејќи станува збор за операторот или, односно доволно е еден исказ да е точен во условот. Во овој случај е точен првиот исказ па другите нема потреба да ги проверува. (1-2)
2. Првиот исказ, user==null враќа false, па сега затоа го проверува вториот исказ user.getPassword)==null што ќе врати true, значи условот е исполнет и нема потреба од проверување на третиор исказ. (1-2)
3. Првиот исказ, user==null враќа false, па го проверува вториот исказ user.getPassword)==null кој исто така враќа false, па затоа го проверува и третиот исказ user.getEmail)==null, кој враќа true, значи услот е исполнет. (1-2)
4. Доколку сите искази вратат false, условот не е исполнет и јазелот 2 се прескокнува. (1-3)

![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/517ff29c-b7c1-45a3-bf36-5ae1759457d3)
# Тест 1
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/5779e37e-cab3-4571-9537-3952bfcd24e4)

# Тест 2
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/8d2aa73c-84d8-4f65-abb5-c5ecdde8c138)

# Тест 3
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/704ce200-ebce-4b08-af29-f62d30f8fcf1)

# Тест 4
![image](https://github.com/borjanadonceva15/SI_2023_lab2_213023/assets/101622176/ba2bf963-779d-4804-8646-555480233d46)

