package Projetos_Java.A3priSem;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Executavel {
    public static void menus() {
        System.out.println("---------------------------------------------------------");
        System.out.println("----MENU-CADASTROS----");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        System.out.println("3 - Sala");
        System.out.println("4 - Curso");
        System.out.println("");
        System.out.println("----MENU-ALOCAÇÕES----");
        System.out.println("5 - Aluno -> Curso");
        System.out.println("");
        System.out.println("----CURSOS-ATIVOS-----");
        System.out.println("6 - Lista de cursos");
        System.out.println("");
        System.out.println("-----OBSERVAÇÕES------");
        System.out.println("- Alunos são automaticamente alocados a turmas.");
        System.out.println("- Primeiro Cadastre antes de Alocar.");
        System.out.println("- Digite '7' para cancelar o processo.");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // VARIÁVEIS E LISTAS GLOBAIS
        int opcao;
        int contadorMatricula = 1;
        int contadorCodFuncionario = 1;
        int contadorCodSala = 1;

        ArrayList<ClasseAluno> listaAlunos = new ArrayList<ClasseAluno>();
        ArrayList<ClasseProfessor> listaProfessor = new ArrayList<ClasseProfessor>();
        ArrayList<ClasseSala> listaSala = new ArrayList<ClasseSala>();
        ArrayList<ClasseCurso> listaCurso = new ArrayList<ClasseCurso>();

        try {

            do {
                menus();
                System.out.printf("Opção: ");
                opcao = scan.nextInt();
                System.out.printf("\n");

                if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7) { // Tratando
                                                                                                                      // erro
                    System.out.println("Por favor, escolha uma das opções disponíveis.");
                }
                if (opcao == 1) { // Criar aluno
                    String nomeAluno, cpf, endereco, email, celular;

                    scan.nextLine();// scan criado para resolver um bug.
                    System.out.printf("Nome do aluno: ");// Nome
                    nomeAluno = scan.nextLine();
                    System.out.printf("CPF do aluno: ");// Cpf
                    cpf = scan.nextLine();
                    System.out.printf("Endereço do aluno: ");// Endereço
                    endereco = scan.nextLine();
                    System.out.printf("Email do aluno: ");// Email
                    email = scan.nextLine();
                    System.out.printf("Celular do aluno: ");// Celular
                    celular = scan.nextLine();
    
                    listaAlunos.add(
                            new ClasseAluno(nomeAluno, cpf, endereco, email, celular, "" + contadorMatricula));
                    contadorMatricula++;
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("Aluno criado com sucesso!");
                    System.out.println("--------------------------------------------------\n");
                    FileWriter arqAluno = new FileWriter("C:\\Users\\Lucas\\Desktop\\Faculdade\\PSL\\A3\\Arquivos TXT\\alunos.txt");
                    PrintWriter gravarArqAluno = new PrintWriter(arqAluno);
                    gravarArqAluno.println(listaAlunos);
                    gravarArqAluno.close();
                }
                if (opcao == 2) { // Criar professor
                    String nomeProfessor, cpf, endereco, email, celular;

                    scan.nextLine();// scan criado para resolver um bug.
                    System.out.printf("Nome do professor: ");// Nome
                    nomeProfessor = scan.nextLine();
                    System.out.printf("CPF do professor: ");// Cpf
                    cpf = scan.nextLine();
                    System.out.printf("Endereço do professor: ");// Endereço
                    endereco = scan.nextLine();
                    System.out.printf("Email do professor: ");// Email
                    email = scan.nextLine();
                    System.out.printf("Celular do professor: ");// Celular
                    celular = scan.nextLine();

                    listaProfessor.add(new ClasseProfessor(nomeProfessor, cpf, endereco, email, celular,
                            "" + contadorCodFuncionario));
                    contadorCodFuncionario++;
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("Professor criado com sucesso!");
                    System.out.println("--------------------------------------------------\n");
                    FileWriter arqProfessor = new FileWriter("C:\\Users\\Lucas\\Desktop\\Faculdade\\PSL\\A3\\Arquivos TXT\\professores.txt");
                    PrintWriter gravarArqProfessor = new PrintWriter(arqProfessor);
                    gravarArqProfessor.println(listaProfessor);
                    gravarArqProfessor.close();
                }
                if (opcao == 3) { // Criar Sala
                    String nomeSala, localSala;
                    int capacidadeTotal;

                    scan.nextLine();// scan criado para resolver um bug.
                    System.out.printf("Nome da sala: ");// Nome
                    nomeSala = scan.nextLine();
                    System.out.printf("Local da sala: ");// Local
                    localSala = scan.nextLine();
                    System.out.printf("Capacidade da sala: ");// Capacidade
                    capacidadeTotal = scan.nextInt();

                    listaSala.add(new ClasseSala(nomeSala, localSala, (capacidadeTotal - 1), "" + contadorCodSala));
                    contadorCodSala++;
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("Sala criada com sucesso!");
                    System.out.println("--------------------------------------------------\n");
                    FileWriter arqSala = new FileWriter("C:\\Users\\Lucas\\Desktop\\Faculdade\\PSL\\A3\\Arquivos TXT\\salas.txt");
                    PrintWriter gravarArqSala = new PrintWriter(arqSala);
                    gravarArqSala.println(listaSala);
                    gravarArqSala.close();
                }
                if (opcao == 4) { // Criar Curso
                    if (listaAlunos.size() == 0 && listaProfessor.size() == 0 && listaSala.size() == 0) {
                        System.out.println("Por favor, antes de criar um curso certifique-se que tenha " +
                                "criado aluno, professor e sala.");
                    } else {
                        String nomeCurso = null, cargaHoraria = null, descricao = null;
                        ClasseProfessor prof;
                        ClasseSala sala;
                        int contadorProfessor = 0;
                        int contadorSala = 0;
                        int numeroProfessor;
                        int numeroSala;

                        scan.nextLine();// scan criado para resolver um bug.
                        System.out.printf("Nome do curso: ");// Nome Curso
                        nomeCurso = scan.nextLine();
                        System.out.printf("Carga horária do curso: ");// Carga horária do curso
                        cargaHoraria = scan.nextLine();
                        System.out.printf("Descrição do curso: ");// Descrição do curso
                        descricao = scan.nextLine();

                        System.out.printf("Professor do curso: ");// Professor do curso
                        System.out.println("\n--LISTA-DE-PROFESSORES-ABAIXO--\n");
                        System.out.println("Digite o número do professor escolhido para este curso.\n");

                        for (ClasseProfessor index : listaProfessor) {
                            System.out.print("PROFESSOR: " + (contadorProfessor + 1) + "\n");
                            System.out.println(index);
                            contadorProfessor++;
                        }
                        System.out.printf("Número Professor: ");
                        numeroProfessor = scan.nextInt();
                        prof = listaProfessor.get(numeroProfessor - 1);

                        System.out.printf("Sala do curso: ");// Sala do curso
                        System.out.println("\n\n--LISTA-DE-SALAS-ABAIXO--\n");
                        System.out.println("Digite o número da sala escolhida para este curso.\n");

                        for (ClasseSala index : listaSala) {
                            System.out.print("SALA: " + (contadorSala + 1) + "\n");
                            System.out.println(index);
                            contadorSala++;
                        }
                        System.out.printf("Número Sala: ");
                        numeroSala = scan.nextInt();
                        sala = listaSala.get(numeroSala - 1);

                        if (prof != null && sala != null) {
                            listaCurso.add(
                                    new ClasseCurso(nomeCurso, "" + listaCurso.size(), cargaHoraria, descricao, prof,
                                            sala));
                            System.out.println("\n---------------------------------------------------");
                            System.out.println("Curso criado com sucesso!");
                            System.out.println("--------------------------------------------------\n");
                        } else {
                            System.out.println("Seu curso não foi criado, argumentos vazios. Tente novamente.");
                        }
                        listaSala.remove(numeroSala - 1);
                    }
                    FileWriter arqCurso = new FileWriter("C:\\Users\\Lucas\\Desktop\\Faculdade\\PSL\\A3\\Arquivos TXT\\cursos.txt");
                    PrintWriter gravarArqCurso = new PrintWriter(arqCurso);
                    gravarArqCurso.println(listaCurso);
                    gravarArqCurso.close();
                }
                if (opcao == 5) { // Alocar aluno
                    if (listaAlunos.isEmpty() || listaCurso.isEmpty()
                            || listaAlunos.isEmpty() && listaCurso.isEmpty()) { // Tratando erro
                        System.out.println("Por favor, certifique-se que aluno e curso ja estejam cadastrados.");
                    } else {

                        int numeroAluno = 0;
                        int numeroCurso = 0;

                        System.out.println("Escolha um aluno a ser alocado: ");
                        for (int i = 0; i < listaAlunos.size(); i++) {
                            System.out.print("\nALUNO: " + (i + 1) + "\n");
                            System.out.println(listaAlunos.get(i));
                        }

                        System.out.printf("Número do aluno: ");
                        numeroAluno = scan.nextInt();

                        System.out.println("Escolha em que curso o aluno vai ser alocado: ");
                        for (int i = 0; i < listaCurso.size(); i++) {
                            System.out.print("\nCURSO: " + (i + 1) + "\n");
                            System.out.println(listaCurso.get(i));
                        }

                        System.out.printf("Número do curso: ");
                        numeroCurso = scan.nextInt();

                        if (listaCurso.get(numeroCurso - 1).getSala() // Alocando aluno a sala (se possível)
                                .getCapacidadeTotal() >= (listaCurso.get(numeroCurso - 1).getAlunos().size())) {
                            listaCurso.get(numeroCurso - 1).vincularAluno(listaAlunos.get(numeroAluno - 1));
                            listaAlunos.remove(numeroAluno - 1);
                        } else {
                            System.out.println("\n-------------------------------------------------------------");
                            System.out.println("Numero de alunos máximo atingido para este curso, tente outro.");
                            System.out.println("--------------------------------------------------------------\n");
                        }
                    }
                }
                if (opcao == 6) { // Lista Cursos
                    for (ClasseCurso cursoClasse : listaCurso) {
                        System.out.println(cursoClasse);
                    }
                }
            } while (opcao != 7);

        } catch (Exception erro) { // Tratando erros generalizados
            System.out.println("\n--------------------------------------------------");
            System.out.println("Um erro ocorreu, tente novamente!");
            System.out.println("--------------------------------------------------\n");
        } finally {  
            System.out.println("Programa finalizado.\n");
        }
        
        scan.close();

    }
}
