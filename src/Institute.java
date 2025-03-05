public class Institute {
    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class LazyStudent extends Student {
        public LazyStudent(){
            super("Сегодня не учусь, мне лень.");
        }
        @Override
        public void study() {
            System.out.println(studying);
        }
    }
}
