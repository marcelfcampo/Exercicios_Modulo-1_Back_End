PGDMP     0                    {            canasvieiras    15.1    15.0                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16419    canasvieiras    DATABASE     n   CREATE DATABASE canasvieiras WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'C';
    DROP DATABASE canasvieiras;
                postgres    false            �            1259    16420    aluno    TABLE     �   CREATE TABLE public.aluno (
    id_matricula bigint NOT NULL,
    nome character varying(50) NOT NULL,
    cpf character varying(11) NOT NULL,
    is_turma bigint NOT NULL,
    "Email" character varying(50) NOT NULL
);
    DROP TABLE public.aluno;
       public         heap    postgres    false                       0    16420    aluno 
   TABLE DATA           K   COPY public.aluno (id_matricula, nome, cpf, is_turma, "Email") FROM stdin;
    public          postgres    false    214   �       q           2606    16424    aluno aluno_pkey 
   CONSTRAINT     v   ALTER TABLE ONLY public.aluno
    ADD CONSTRAINT aluno_pkey PRIMARY KEY (id_matricula, nome, is_turma, cpf, "Email");
 :   ALTER TABLE ONLY public.aluno DROP CONSTRAINT aluno_pkey;
       public            postgres    false    214    214    214    214    214                   x������ � �     