public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno do incide x = " + x + " é " + alunos[x]);
        }


        //a cada iteração de alunos o aluno atualiza o valor da posição
        for ( String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
