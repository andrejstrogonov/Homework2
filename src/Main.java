public class Main {
    public static void main(String[] args) {
        var sumOfHours = 640;
        var hoursPerWorker = 8;
        var workers = sumOfHours/hoursPerWorker;
        System.out.println("Всего работников в компании - "+workers+" человек");
        workers = workers+94;
        var nextSumOfHours = workers*hoursPerWorker;
        System.out.println("Если в компании работает "+workers+" человек, то всего "+nextSumOfHours+
                " часов работы может быть поделено между сотрудниками");
    }
}