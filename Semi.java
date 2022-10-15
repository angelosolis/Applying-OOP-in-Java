public abstract class Semi
    {
        private int num1,num2;

        public Semi(int num1, int num2)
        {
            this.num1 = num1;
            this.num2 = num2;
        }

        public int getnum1()
        {
            return num1;
        }

          public int getnum2()
        {
            return num2;
        }

        public abstract String toString();
    }
